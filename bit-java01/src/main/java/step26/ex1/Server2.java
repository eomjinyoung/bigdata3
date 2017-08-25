/* 서버 애플리케이션 만들기 II
 * => 반복문을 사용하여 여러 클라이언트의 요청을 처리하라!
 *      
 */
package step26.ex1;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(9999);
    System.out.println("클라이언트 연결을 기다리는 중...");
    
    while (true) {
      Socket socket = ss.accept();
      Scanner in2 = new Scanner(socket.getInputStream());
      PrintStream out2 = new PrintStream(socket.getOutputStream());
      String message = in2.nextLine();
      System.out.println(message);
      out2.println("반갑습니다. 엄진영입니다.");
      out2.close(); 
      in2.close(); 
      socket.close();
      Thread.currentThread().sleep(5000); // 현재 스레드를 5초 동안 실행 중지시킨다.
    }
    
    //ss.close();
    
  }
}









