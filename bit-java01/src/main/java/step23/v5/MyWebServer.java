/* 웹 서버 만들기: 5단계
 * => URL에 첨부된 요청 파라미터를 처리하여 서블릿 객체에게 전달하자!
 *    예) http://localhost/plus?a=20&b=300
 *    - 위 URL에서 a=20&b=300 이 요청 파라미터이다.
 * => 즉 URL에서 요청 파라미터를 추출하여 맵에 담아서 서블릿 객체에게 전달한다.
 * => 작업
 *    1) Servlet 인터페이스의 service() 메서드에서 요청 파라미터 값을 받을 수 있도록 변경한다. 
 */
package step23.v5;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyWebServer {
  int port;
  HashMap<String,Servlet> servletMap = new HashMap<>();
  
  public MyWebServer(int port) {
    this.port = port;
    servletMap.put("/hello", new Hello());
  }

  private void processRequest(Socket socket) {
    try (
      Scanner in = new Scanner(socket.getInputStream());
      PrintWriter out = new PrintWriter(socket.getOutputStream());
    ) {
      boolean isRequestLine = true;
      String requestUri = null;
      while (true) {
        try {
          String line = in.nextLine();
          
          if (isRequestLine) {
            requestUri = line.split(" ")[1];
            isRequestLine = false;
          }
          
          if (line.isEmpty())
            break;
        } catch (Exception e) {
          break; 
        }
      }
      
      // 웹브라우저에 응답한다.
      out.println("HTTP/1.1 200 OK");
      out.println("Content-Type: text/html; charset=utf-8");
      out.println("Connection: close");
      out.println();

      Servlet servlet = servletMap.get(requestUri);
      
      if (servlet != null) {
        Map<String,String> paramMap = getRequestParameters(requestUri);
        servlet.service(out);
      } else { 
        responseError(out);
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  private Map<String,String> getRequestParameters(String url) {
    HashMap<String,String> paramMap = new HashMap<>();
        
    // 예) url: "/plus?a=200&b=300"
    // url을 "?"로 짜른다. => {"/plus", "a=200&b=300"}
    String[] values = url.split("?");
    if (values.length == 1)
      return paramMap;
    
    // "a=200&b=300"을 "&"로 짜른다. => {"a=200", "b=300"}
    String[] params = values[1].split("&");
    for (String param : params) {
      String[] kv = param.split("=");
      paramMap.put(kv[0], kv[1]);
    }
    
    return paramMap;
  }
  
  private void responseError(PrintWriter out) throws Exception {
    out.println("<html><body><h1>해당 URL을 처리할 수 없습니다!</body></html>");
  }
  
  public void run() {
    try {
      ServerSocket ss = new ServerSocket(this.port);
      
      while (true) {
        Socket socket = ss.accept(); 
        processRequest(socket);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public static void main(String[] args) {
    MyWebServer webServer = new MyWebServer(80);
    System.out.println("웹서버 실행 중...");
    
    webServer.run();
  }

}






