/* 파일 업로드 서버 애플리케이션 만들기
 */
package step26.ex2;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(9999);
    System.out.println("클라이언트 연결을 기다리는 중...");
    
    try (
        Socket socket = ss.accept();
        DataInputStream in = new DataInputStream(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());) {
        
        //1) 클라이언트가 보낸 파일 이름을 받는다.
        String fileName = in.readUTF();
        
        //2) 클라이언트가 보낸 파일 크기를 받는다.
        long fileLength = in.readLong();
        
        //3) 클라이언트가 보낸 파일을 받는다.
        // => 클라이언트가 보낸 파일 이름을 파일 정보를 다룰 객체를 준비한다.
        // => 이클립스에서 파일의 기본 위치는 프로젝트 폴더이다.
        File file = new File("c:/socketupload/" + fileName);
        
        // => 파일을 출력할 도구를 준비한다.
        try (FileOutputStream fileOut = new FileOutputStream(file);) {
          for (int i = 0; i < fileLength; i++) {
            fileOut.write(in.readByte());
          }
        }
        
        //4) 클라이언트에게 응답한다.
        out.println("파일을 모두 받았습니다!");
        
        System.out.println("파일 수신 완료!");
        
      } catch (Exception e) {
        e.printStackTrace();
      }    
    
  }
}









