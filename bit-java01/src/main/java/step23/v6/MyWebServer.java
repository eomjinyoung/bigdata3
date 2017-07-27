/* 웹 서버 만들기: 6단계
 * => 다음 URL을 처리하는 웹 애플리케이션을 작성하라!
 *    http://localhost/plus?a=20&b=30
 * => 이 URL을 요청한 후 서버에서 받는 응답 결과는 다음과 같다.
 *    20 + 30 = 50
 * => 작업
 *    1) Servlet 인터페이스를 구현한 Plus 클래스를 만든다.
 *    2) 웹브라우저가 보낸 a와 b값을 꺼내서 더하기를 한 후 그 결과를 출력한다.
 *    3) Plus 클래스의 인스턴스를 만들어 서블릿 보관소에 등록한다.
 * => 연습
 *    - 다음 URL을 처리하는 Multiple 클래스를 작성하고 실행해보라!
 *      http://localhost/multiple?a=20&b=30
 *    - 결과는,
 *      20 * 30 = 600
 */
package step23.v6;

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
    servletMap.put("/plus", new Plus());
    servletMap.put("/multiple", new Multiple());
  }

  private void processRequest(Socket socket) {
    try (
      Scanner in = new Scanner(socket.getInputStream());
      PrintWriter out = new PrintWriter(socket.getOutputStream());
    ) {
      boolean isRequestLine = true;
      String url = null; 
      String queryString = null; 

      while (true) {
        try {
          String line = in.nextLine();
          
          if (isRequestLine) {
            String requestUri = line.split(" ")[1]; 
            String[] values = requestUri.split("\\?"); 
            url = values[0]; // "/plus" 
            
            if (values.length > 1) { 
              queryString = values[1];
            }
            
            isRequestLine = false;
          }
          
          if (line.isEmpty())
            break;
        } catch (Exception e) {
          e.printStackTrace();
          break; 
        }
      }
      
      // 웹브라우저에 응답한다.
      out.println("HTTP/1.1 200 OK");
      out.println("Content-Type: text/html; charset=utf-8");
      out.println("Connection: close");
      out.println();

      Servlet servlet = servletMap.get(url); 
      
      if (servlet != null) {
        Map<String,String> paramMap = getRequestParameters(queryString);
        servlet.service(paramMap, out);
      } else { 
        responseError(out);
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  private Map<String,String> getRequestParameters(String queryString) {
    HashMap<String,String> paramMap = new HashMap<>();
        
    if (queryString == null)
      return paramMap;
    
    String[] params = queryString.split("&");
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






