/* 웹 서버 만들기: 5단계
 * => URL에 첨부된 요청 파라미터를 처리하여 서블릿 객체에게 전달하자!
 *    예) http://localhost/plus?a=20&b=300
 *    - 위 URL에서 a=20&b=300 이 요청 파라미터이다.
 * => 즉 URL에서 요청 파라미터를 추출하여 맵에 담아서 서블릿 객체에게 전달한다.
 * => 작업
 *    1) Servlet 인터페이스의 service() 메서드에서 요청 파라미터 값을 받을 수 있도록 변경한다. 
 *    2) Hello 클래스를 Servlet 규칙에 맞추어 변경한다.
 *       - URL에서 name을 지정하여 전달하면, 그 name 값으로 인사를 하도록 변경한다.
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
      String url = null; // 서블릿 URL이다.
      String queryString = null; // ? 다음에 오는 데이터 

      while (true) {
        try {
          String line = in.nextLine();
          
          if (isRequestLine) {
            // 예) GET /plus?a=200&b=300 HTTP/1.1
            // => request-line에서 requestUrl를 추출한다.
            String requestUri = line.split(" ")[1]; // "/plus?a=200&b=300" 
            
            // requestUri에서 ?를 기준으로 값을 추출한다.
            // 정규표현식에서 ?문자는 특별한 명령을 수행한다.
            // 우리는 단지 ?문자로 문자열을 자르기를 원한다.
            // 그렇다면 정규표현시에서 ?를 단순한 문자로 인식하게 만들어야 한다.
            // "\?"를 작성하면 된다.
            // 문제는 자바에서 \를 문자로 표현하려면 \를 앞에 한 개 더 붙여야 한다.
            // 그래서 최종적으로 "\\?"라는 값이 만들어진 것이다.
            String[] values = requestUri.split("\\?"); // {"/plus", "a=200&b=300"} 
            
            // requestUri 문자열에서 ? 앞에 있는 값은 
            url = values[0]; // "/plus" 
            
            if (values.length > 1) { // ? 문자가 있을 때 
              queryString = values[1]; // "a=200&b=300" 
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

      Servlet servlet = servletMap.get(url); // "/plus" 
      
      if (servlet != null) {
        Map<String,String> paramMap = getRequestParameters(queryString); // "a=200&b=300"
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
    
    // "a=200&b=300"을 "&"로 짜른다. => {"a=200", "b=300"}
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






