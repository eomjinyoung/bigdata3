/* 웹 서버 만들기: 1단계
 * => 웹브라우저의 요청에 응답하기 
 * 네트워크 프로그래밍 용어
 * 1) 서버
 *    - 요청에 응답하는 프로그램
 *    - 예) 웹서버, 채팅서버, 게임서버, 메신저서버, 메일서버, 캘린더 서버, FTP서버 등
 * 2) 클라이언트
 *    - 서버에게 요청을 하는 프로그램
 *    - 예) 웹브라우저, 채팅 클라이언트, 게임 프로그램, 카카오메신저, 메일클라이언트, 캘린더,FTP 클라이언트 등
 * 3) 프로토콜
 *    - 클라이언트와 서버가 데이터를 주고 받는 규칙
 *    - 예) 웹서버-웹브라우저 : HTTP
 *         FTP서버-FTP클라이언트 : FTP
 *         Telnet서버- Telnet클라이언트 : Telnet
 *         보내는메일서버-메일클라이언트: SMTP
 *         받는메일서버-메일클라이언트: POP3, IMAP
 * 4) HTTP 프로토콜
 *    - 보통 프로토콜에 따라 통신을 하는 클라이언트(Client)/서버(Server)는
 *      그 프로토콜의 이름을 붙여 부른다.
 *      예) HTTP 서버 / HTTP 클라이언트
 *    - 그런데 HTTP 서버에 대해서는 "웹 서버(Web Server)"라는 애칭을 더 많이 사용한다.
 *      이유? HTTP 서버의 주된 목적은 HTML 문서를 제공하는 것이다.
 *           HTML 문서는 거미 줄처럼 서로 엮여 있다.
 *           그래서 거미줄의 "Web" 이라는 단어를 가져온 것이다.
 *    - HTTP 클라이언트도 "웹 브라우저(Web Browser)"라는 애칭을 더 많이 사용한다.
 *      이유? HTTP 클라이언트 HTML 문서에 연결된 다른 문서를 다운로드 받기 위해
 *           여러 웹 서버를 돌아다닌다(browse)고 해서 "브라우저"라는 용어를 사용한다.
 *    - 결론?
 *      HTTP 서버 = 웹 서버
 *      HTTP 클라이언트 = 웹 브라우저   
 * 5) HTTP 프로토콜의 요청 문법
 *    - 웹 브라우저가 서버에 요청할 때 다음과 같은 형식으로 데이터를 보낸다.
------------------------------------------------
GET / HTTP/1.1
Host: dic.daum.net
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
 *
 * 6) HTTP 프로토콜의 응답 문법
 *    - 웹 브라우저의 요청에 대해 웹 서버가 응답할 때 다음과 같은 형식으로 데이터를 보낸다.
------------------------------------------------
HTTP/1.1 200 OK
Date: Thu, 27 Jul 2017 01:10:55 GMT
Server: Apache
Content-Language: ko-KR
Connection: close
Transfer-Encoding: chunked
Content-Type: text/html;charset=utf-8
(빈줄)
<!DOCTYPE html>
<html lang="ko" xmlns:daum="http://dic.daum.net/">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>다음 어학사전</title>  
...
------------------------------------------------
 * 
 * 7) IP 주소
 *    - 인터넷에 연결된 컴퓨터에 부여된 주소
 *    - 32비트 값으로 표현한다.
 *    - 보통 1바이트씩 4개로 나눠 10진수로 표현한다.
 *      예) 192.168.0.13
 *    - 127.0.0.1 은 자기 자긴을 가리키는 주소이다.
 * 8) 도메인 이름
 *    - 숫자로 된 IP 주소를 암기하고 관리하기 힘들어서 만든 이름이다.
 *    - 보통 알파벳과 숫자로 만든다.
 *    - 그룹명(도메인명)과 컴퓨터명을 섞어서 만든다.
 *    - 컴퓨터명을 앞에 두고 그룹명을 뒤에 둔다.
 *      예) www.daum.net
 *    - 도메인명은 국제적으로 지정된 기관에 유료로 등록해야 한다.
 *    - 그 도메인에 소속된 컴퓨터 이름은 자체 도메인서버에서 관리하거나 
 *      도메인명을 등록한 서비스 업체에 위탁한다.
 * 9) NIC 주소
 *    - 모든 랜카드는 고유의 식별 값을 갖고 있다.
 *    - 국제적인 조직에서 이 주소를 관리하며 랜카드를 만드는 회사에게 사용 범위를 지정한다.
 *    - 랜카드를 만드는 회사는 자신들이 발급 받은 범위 내에서 랜카드의 주소를 부여한다.
 *    - 로컬 네트워크에서 물리적으로 컴퓨터를 찾을 때 이 NIC 주소를 사용한다.
 *    - IP 주소가 없으면 인터넷 상에서 다른 컴퓨터와 통신을 할 수 없다.
 *    - IP 주소가 있더라도 NIC 주소가 없으면 내부 네트워크에 연결되어 있는 컴퓨터 중에서
 *      어떤 컴퓨터인지 구분할 수 없기 때문에 최종적으로 데이터를 받을 수 없다.
 *    - 걱정마시라. 랜카드 당 고유의 NIC 주소가 랜카드 칩에 심어져 있다. 
 */
package step23.v1;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyWebServer {

  static void processRequest(Socket socket) {
    // 소켓을 통해 클라이언트와 데이터를 주고 받으려면 
    // 데이터를 읽고 쓰는 객체가 필요하다.
    try (
      Scanner in = new Scanner(socket.getInputStream());
      PrintWriter out = new PrintWriter(socket.getOutputStream());
    ) {
      // 웹브라우저가 보낸 데이터를 모두 읽는다.
      System.out.println("웹 브라우저에서 보낸 데이터를 읽기:");
      System.out.println("------------------------------------------------------");
      while (true) {
        try {
          String line = in.nextLine();
          System.out.println(line);
          if (line.isEmpty())
            break;
        } catch (Exception e) {
          break; // 웹브라우저가 보낸 데이터를 모두 읽으면 예외가 발생한다. 그러면 while 문을 나간다.
        }
      }
      System.out.println("------------------------------------------------------");
      
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
