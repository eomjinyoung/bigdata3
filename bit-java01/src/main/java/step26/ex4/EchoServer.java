/* 에코 서버 만들기
 *      
 */
package step26.ex4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
  
  static class EchoAgent extends Thread {
    Socket socket;
    
    public EchoAgent(Socket socket) {
      this.socket = socket;
    }
    
    @Override
    public void run() {
      try ( 
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
      ) {
        
        String message = in.readUTF();
        System.out.println(message);
        out.writeUTF(message);
        
      } catch (Exception e) {
        e.printStackTrace();
        
      } finally {
        try {socket.close();} catch (Exception e) {}
      }
    }
  }
  
  public void service() throws Exception {
    try (
      ServerSocket ss = new ServerSocket(9999);
    ) {
      System.out.println("클라이언트 연결을 기다리는 중...");
    
      while (true) {
        new EchoAgent(ss.accept()).start();
      }
    }
  }
  
  public static void main(String[] args) throws Exception {
    EchoServer echoServer = new EchoServer();
    echoServer.service();
  }
}









