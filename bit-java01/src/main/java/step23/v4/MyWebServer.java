/* 웹 서버 만들기: 4단계
 * => URL로 클라이언트 요청을 구분하여 처리하자!
 * => 요청을 처리하는 객체를 매번 만들지 말고,
 *    한 번만 만들어서 계속 사용하자!
 * => 작업
 *    1) HashMap을 만들어 클라이언트 요청을 처리할 객체를 보관한다.
 *    2) 맵에 객체를 보관할 때 key 값으로 URL을 사용한다.
 *    3) 클라이언트 요청이 들어오면 URL과 일치하는 객체를 찾아 실행한다.
 *    4) 만약 그런 객체가 없다면 요청을 처리할 수 없다고 오류 메시지를 출력한다.
 */
package step23.v4;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class MyWebServer {
  int port;
  
  // 클라이언트 요청을 처리하는 서블릿 객체 보관소
  HashMap<String,Servlet> servletMap = new HashMap<>();
  
  public MyWebServer(int port) {
    this.port = port;
    
    // URL을 key로 사용하여 서블릿 객체 보관한다.
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
          
          // Request-Line을 분석하자!
          if (isRequestLine) {
            requestUri = line.split(" ")[1];
            isRequestLine = false;
          }
          
          if (line.isEmpty())
            break;
        } catch (Exception e) {
          break; // 웹브라우저가 보낸 데이터를 모두 읽으면 예외가 발생한다. 그러면 while 문을 나간다.
        }
      }
      
      // 웹브라우저에 응답한다.
      // => HTTP 응답 헤더를 보낸다.
      out.println("HTTP/1.1 200 OK");
      out.println("Content-Type: text/html; charset=utf-8");
      out.println("Connection: close");
      out.println();

      // => 클라이언트가 요청한 URL을 처리할 서블릿 객체를 보관소에서 꺼낸다.
      Servlet servlet = servletMap.get(requestUri);
      
      if (servlet != null) { // 해당 URL을 처리할 서블릿 객체를 찾았다면 호출한다.
        servlet.service(out);
      } else { //못찾았다면, 안내 문구를 출력한다.
        responseError(out);
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
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






