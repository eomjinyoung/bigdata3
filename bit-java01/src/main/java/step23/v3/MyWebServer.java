/* 웹 서버 만들기: 3단계
 * => 클라이언트가 요청한 자원을 실행한다.
 * => 보충 
 *    - 기존의 MyWebServer가 스태틱 멤버 위주로 되어 있다.
 *      이것을 인스턴스 멤버 위주로 전환하자!
 */
package step23.v3;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyWebServer {
  int port;
  
  public MyWebServer(int port) {
    this.port = port;
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
      
      System.out.println(requestUri);
      
      // 웹브라우저로 데이터를 보낸다.
      out.println("HTTP/1.1 200 OK");
      out.println("Content-Type: text/html; charset=utf-8");
      out.println("Connection: close");
      out.println();
      out.print("<html><body><h1 style='color:blue;'>엄진영:Hello</h1></body></html>");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
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






