/* 서버 애플리케이션 만들기
 * => 포트
 *    - 데이터를 송수신 할 때 대상을 구분하기 위한 값이다. 
 *    - 컴퓨터에서 중복되지 않아야 한다.
 *    - 서버 포트 번호는 애플리케이션에서 정한다.
 *    - 클라이언트 포트 번호는 OS가 자동으로 부여해준다.
 *    - 널리 알려진 서버 포트 번호
 *      80(웹서버), 8080(웹프록시서버), 20(FTP 데이터 송수신), 21(FTP 접속 제어),
 *      23(텔렛), 22(SSH), 110(POP3 메일 수선 서버), 143(IMAP4 메일 수신 서버) 
 *      443(암호화된 웹서버; HTTPS) 등
 *      서버 포트 번호로 널리 알려진 번호는 가능한 사용하지 말라!
 *      
 */
package step26.ex1;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
  public static void main(String[] args) throws Exception {
    //1) 서버 소켓을 준비한다.
    // => 클라이언트의 접속을 관리할 객체이다.
    ServerSocket ss = new ServerSocket(9999);
    System.out.println("클라이언트 연결을 기다리는 중...");
    
    //2) 서버와 연결되어 대기중인 클라이언트 중에서 한 개를 뽑아 리턴한다.
    // => 대기열 : 클라이언트가 서버와 연결하면 대기열에 등록되어 관리된다.
    //             만약 대기열이 꽉찼다면 클라이언트 연결은 거절된다.
    Socket socket = ss.accept();
    
    //3) 소켓을 통해 입출력을 할 수 있는 도구를 꺼낸다.
    InputStream in = socket.getInputStream();
    OutputStream out = socket.getOutputStream();
    
    //4) InputStream과 OutputStream에 String 객체를 직접 입출력할 수 있는 장비를 장착한다.
    Scanner in2 = new Scanner(in);
    PrintStream out2 = new PrintStream(out);
    
    //5) 클라이언트가 보낸 문자열을 먼저 읽는다.
    String message = in2.nextLine();
    System.out.println(message);
    
    //6) 클라이언트로 답장을 보낸다.
    out2.println("반갑습니다. 엄진영입니다.");
    
    //7) 클라이언트와의 대화가 끝났으면 연결을 끊는다.
    out2.close(); // in 객체와 연결한 객체를 끊으면 in도 함께 끊긴다.
    in2.close(); // out 객체와 연결한 객체를 끊으면 out도 함께 끊긴다.
    socket.close();
    ss.close();
    
  }
}









