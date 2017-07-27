/* 웹 서버 만들기: 3단계
 * => 클라이언트가 요청한 자원을 실행한다.
 * => 웹브라우저에게 응답할 때,
 *    응답헤더는 MyWebServer가 출력하고
 *    웹브라우저가 출력할 내용은 Hello 클래스가 출력한다.
 * => 즉 웹 브라우저의 요청이 들어오면
 *    MyWebServer는 Hello 객체에 대해 service()를 호출하여 응답을 처리한다.
 *    이렇게 Hello처럼 웹서버가 실행하는 프로그램을 "웹 애플리케이션"이라고 부른다.
 *    "Hello" 클래스는 웹 애플리케이션이다.
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
      
      // 웹브라우저에 응답한다.
      // => HTTP 응답 헤더를 보낸다.
      out.println("HTTP/1.1 200 OK");
      out.println("Content-Type: text/html; charset=utf-8");
      out.println("Connection: close");
      out.println();

      // => HTTP 응답 본문 데이터를 보낸다.
      // 웹 브라우저가 요청한 자원을 찾아 실행한다.
      Hello servlet = new Hello();
      servlet.service(out);
      
      // 예전에는 MyWebServer가 직접 클라이언트에게 데이터를 보냈다면,
      // 이번 예제에서는 MyWebServer가 HTTP 응답 헤더만 보낸다.
      // 나머지 본문 데이터는 Hello 객체의 service()를 호출하여 
      // Hello 객체가 보내도록 유도했다.
      
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






