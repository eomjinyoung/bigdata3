/* 서버 애플리케이션 만들기 III
 * => 스레드를 적용하여 여러 클라이언트 요청을 동시에 처리하라!
 *      
 */
package step26.ex1;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server3 {
  
  static class MessageAgent extends Thread {
    Socket socket;
    
    public MessageAgent(Socket socket) {
      this.socket = socket;
    }
    
    @Override
    public void run() {
      try ( // java.lang.Autocloseable 구현체에 대해서만 변수를 선언할 수 있다.
        Scanner in2 = new Scanner(socket.getInputStream());
        PrintStream out2 = new PrintStream(socket.getOutputStream());) {
        
        String message = in2.nextLine();
        System.out.println(message);
        out2.println("반갑습니다. 엄진영입니다.");
        
      } catch (Exception e) {
        // 일단 예외 상황을 무시한다.
      } finally {
        try {socket.close();} catch (Exception e) {}
      }
    }
  }
  
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(9999);
    System.out.println("클라이언트 연결을 기다리는 중...");
    
    while (true) {
      //Socket socket = ss.accept();
      //MessageAgent agent = new MessageAgent(socket);
      //agent.start();
      new MessageAgent(ss.accept()).start();
    }
    
    //ss.close();
    
  }
}









