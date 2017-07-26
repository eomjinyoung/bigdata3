/* 예외 처리 문법: try-with-resource 사용 전
 * => 객체를 사용한 후 항상 자원을 해제시켜야 하는 경우,
 *    다음 코드와 같이 finally 블록을 이용하여 자원을 해제시켰다.
 *    
 *    
 */
package step22.ex5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test06_1 {

  public static void main(String[] args) {
    FileReader in = null;
    try {
      in = new FileReader("Hello.c");
      int ch;
      while (true) {
        ch = in.read();
        if (ch == -1) 
          break; 
        System.out.print((char)ch); 
      }
    } catch (FileNotFoundException e) {
      System.out.println("해당 파일을 찾을 수 없습니다.");
      
    } catch (IOException e) {
      System.out.println("한 문자를 읽다가 오류가 발생했습니다.");
      
    } finally {
      try {in.close();} catch (IOException e) {} 
    }
  }

}










