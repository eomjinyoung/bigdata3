/* 예외 처리 문법: try-with-resources 사용 후
 * => java.lang.AutoCloseable 인터페이스를 구현한 객체를 사용할 경우,
 *    개발자가 일일이 finally 블록을 통해 자원을 해제시킬 필요가 없다.
 *    try ~ catch ~ 블록을 벗어나기 전에 자동으로 close() 메서드가 호출될 것이다. 
 *    단 다음과 같이 작성하라!
 *    
 */
package step22.ex5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test06_2 {

  public static void main(String[] args) {
    
    try (FileReader in = new FileReader("Hello.c");) {
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
    } // finally 블록이 없어도, FileReader 객체에 대해 close()가 자동 호출될 것이다.
    
    // 이런 try ~ catch ~ 블록을 "try-with-resources" 문장이라 말한다. Java 7에 추가된 특징!
  }

}










