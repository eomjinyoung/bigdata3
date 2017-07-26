package step23;

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
          if (line.isEmpty())
            break;
          System.out.println(line);
        } catch (Exception e) {
          break; // 웹브라우저가 보낸 데이터를 모두 읽으면 예외가 발생한다. 그러면 while 문을 나간다.
        }
      }
      
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
