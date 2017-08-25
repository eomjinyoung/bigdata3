/* HTTP 클라이언트 만들기
 * 
 */
package step26.ex3;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Client {
  public static void main(String[] args) {
    
    try (Scanner keyScan = new Scanner(System.in);) {

      // => 사용자로부터 URL을 입력 받는다.
      System.out.print("URL:");
      URL url = new URL(keyScan.nextLine()); // URL 정보를 다루는 객체를 준비한다.
      
      // => URL 객체를 통해 웹서버에 요청한다.
      URLConnection urlConnection = url.openConnection();
      
      // => 웹서버가 보낼 데이터를 읽을 도구를 준비한다.
      try (Scanner in = new Scanner(urlConnection.getInputStream());) {
        // => 웹서버가 보낸 응답 데이터를 읽는다.
        while (in.hasNext()) {
          System.out.println(in.nextLine());
        }
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}










