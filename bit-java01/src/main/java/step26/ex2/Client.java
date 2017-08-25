/* 파일 업로드 클라이언트 만들기
 * 
 */
package step26.ex2;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
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
    
    //파일 경로를 가지고 파일 정보를 다룰 객체를 만든다.
    File file = new File(filePath);
    
    try (
      FileInputStream fileIn = new FileInputStream(file); // 파일을 읽을 때 사용하는 도구 
      Socket socket = new Socket(serverAddress, 9999);
      Scanner in = new Scanner(socket.getInputStream());
      DataOutputStream out = new DataOutputStream(socket.getOutputStream());) {
      
      //1) 서버에 파일 이름을 보낸다.
      out.writeUTF(file.getName());
      
      //2) 서버에 파일 크기를 보낸다.
      out.writeLong(file.length());
      
      //3) 서버에 파일을 보낸다.
      int b;
      while ((b = fileIn.read()) != -1) { // read()의 리턴 값이 -1이면, 모두 읽어다는 의미다.
        out.writeByte(b);
      }
      
      //4) 서버의 응답을 받는다.
      String message = in.nextLine();
      System.out.println(message);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}










