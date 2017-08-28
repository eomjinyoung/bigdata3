/* 에코(echo) 클라이언트 만들기
 * 
 */
package step26.ex4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
  String address;
  String message;
  
  public void prompt() throws Exception {
    try (
      Scanner keyScan = new Scanner(System.in);
    ) {
    
      System.out.print("서버 주소:");
      this.address = keyScan.nextLine();
      
      System.out.print("보낼 문구:");
      this.message = keyScan.nextLine();
    }
  }
  
  public void echo() throws Exception {
    try (
        Socket socket = new Socket(this.address, 9999);
        ) {
      
      DataInputStream in = new DataInputStream(socket.getInputStream());
      DataOutputStream out = new DataOutputStream(socket.getOutputStream());
      
      out.writeUTF(this.message);
      out.flush(); // 버퍼에 저장된 내용이 있다면 모두 서버에 보낼 것을 명령한다.
      
      String responseResult = in.readUTF();
      System.out.println(responseResult);
    }
  }
  
  public static void main(String[] args) throws Exception {
    EchoClient echoClient = new EchoClient();
    echoClient.prompt();
    echoClient.echo();
  }
}










