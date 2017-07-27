/* 웹 서버 만들기: 2단계
 * => 클라이언트가 요청한 자원의 주소를 알아내기
 * => 다음 HTTP 요청 프로토컬을 보면, 첫 번째 줄에 클라이언트가 요청한 자원의 주소가 들어 있다.
 *    따라서 첫 번째 줄을 분석하여 "요청 자원의 주소"를 뽑아내 보자!
------------------------------------------------
GET / HTTP/1.1         <===== Request-Line 이라 부른다.
Host: dic.daum.net     <===== 나머지 것들은 헤더이다.
Connection: keep-alive
Pragma: no-cache
Cache-Control: no-cache
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3071.115 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,...
Accept-Encoding: gzip, deflate
Accept-Language: ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4
Cookie: suggest=on; rq=browse%2C%25EA%25BB%2598%25EC%259A%2594%2C%25EA%25...
(빈 줄)
------------------------------------------------
 *
 * => HTTP 요청 프로토콜 
 * Request-Line = method sp request-uri sp http-version CRLF
 * (general-header | request-header | entity-header) CRLF*
 * CRLF
 * message-body 
 * 
 * => URI(Uniform Resource Identifier)
 *    - 인터넷의 자원을 구분할 때 사용하는 아이디이다.
 *    - 종류
 *      1) URL(Uniform Resource Locator)
 *         보통 웹 자원을 가리킬 때 사용한다.
 *         예) http://www.daum.net/a/b/d/test.html
 *      2) URN(Uniform Resource Name)
 *         위치에 독립적인 식별자. 즉 특정 서버의 위치 정보를 담고 있지 않다.
 *         예) urn:lex:eu:council:directive:2010-03-09;2010-19-UE
 */
package step23.v2;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyWebServer {

  static void processRequest(Socket socket) {
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
  
  public static void main(String[] args) {
    try {
      ServerSocket ss = new ServerSocket(80);
      System.out.println("웹서버 실행 중...");
      
      while (true) {
        // 클라이언트가 연결을 시도하면 서버에서 승인한다.
        Socket socket = ss.accept(); // 클라이언트와 데이터를 주고 받을 수 있는 도구를 리턴한다.
        processRequest(socket);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
