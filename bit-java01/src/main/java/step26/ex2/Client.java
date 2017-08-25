/* 클라이언트 만들기
 * 
 */
package step26.ex2;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
  public static void main(String[] args) {
    //=> 키보드 입력을 읽어들이는 도구(System.in)
    //=> System.in 객체에 문자열을 한 줄 읽을 수 있는 도구를 붙인다.
    Scanner keyScan = new Scanner(System.in);
    
    System.out.print("연결할 서버 주소:");
    String serverAddress = keyScan.nextLine();
    
    System.out.print("서버에 보낼 파일:");
    String filePath = keyScan.nextLine();
    
    keyScan.close();
    
    System.out.println(serverAddress);
    System.out.println(filePath);
    /*
    try (
      Socket socket = new Socket("192.168.0.26", 9999);
      Scanner in = new Scanner(socket.getInputStream());
      DataOutputStream out = new DataOutputStream(socket.getOutputStream());) {
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    */
  }
}










