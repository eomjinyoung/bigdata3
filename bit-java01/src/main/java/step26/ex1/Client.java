/* 클라이언트 만들기
 * 
 */
package step26.ex1;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
  public static void main(String[] args) throws Exception {
    //1) 서버에 연결할 도구를 준비한다.
    Socket socket = new Socket("localhost", 9999);
    
    //2) 소켓을 통해 입출력을 할 수 있는 도구를 꺼낸다.
    InputStream in = socket.getInputStream();
    OutputStream out = socket.getOutputStream();
    
    //3) InputStream과 OutputStream에 String 객체를 직접 입출력할 수 있는 장비를 장착한다.
    Scanner in2 = new Scanner(in);
    PrintStream out2 = new PrintStream(out);
    
    //4) 서버에 데이터를 보낸다.
    out2.println("안녕하세요. 엄진영입니다!");
    
    //5) 서버가 응답한 데이터를 받는다.
    String message = in2.nextLine();
    System.out.println(message);
    
    //6) 클라이언트와의 대화가 끝났으면 연결을 끊는다.
    out2.close(); // in 객체와 연결한 객체를 끊으면 in도 함께 끊긴다.
    in2.close(); // out 객체와 연결한 객체를 끊으면 out도 함께 끊긴다.
    socket.close();
        
  }
}










