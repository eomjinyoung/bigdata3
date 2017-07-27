/* 웹 서버 만들기: 7단계
 * => 서블릿 클래스를 만들 때 마다 객체를 생성하여 서블릿 보관소에 저장하는 코드를 추가해야 한다.
 *    매우 불편하다. 
 *    자동화하고 싶다!
 * => 애노테이션을 이용하여 서블릿 클래스에 안에 URL 정보를 저장하라!
 *    그리고 MyWebServer는 서블릿 클래스 안에 있는 애노테이션을 꺼내 그 ULR을 사용하라!
 * => 작업
 *    1) 서블릿 URL 정보를 저장할 애노테이션을 만든다.
 *       - @WebServlet
 */
package step23.v7;

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






