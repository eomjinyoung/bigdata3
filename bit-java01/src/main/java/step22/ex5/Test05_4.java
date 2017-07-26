/* 예외 처리 문법: finally 블록 사용법 IV
 * => Test05_3.java의 코드를 좀 더 이해하기 쉽도록 주석을 제거하였다.
 *    그냥 참조하라!
 *    
 */
package step22.ex5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test05_4 {

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










