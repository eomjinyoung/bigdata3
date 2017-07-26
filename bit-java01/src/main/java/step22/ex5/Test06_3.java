/* 예외 처리 문법: try-with-resources 사용법
 * => 문법
 *    try (java.lang.AutoCloseable 객체 준비) {
 *      ...
 *    } catch (...) {...}
 *    } finally {...}
 *    
 */
package step22.ex5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test06_3 {
  
  static class MyClass {
    public void close() {
      System.out.println("MyClass의 자원을 해제합니다.");
    }
  }
  
  public static void main(String[] args) {
    
    try (
        FileReader in = new FileReader("Hello.c");
        //MyClass obj = new MyClass(); // 컴파일 오류! java.lang.AutoCloseable을 구현하지 않은
                                     // 클래스는 여기에 작성할 수 없다.
        //int a = 100; // 컴파일 오류! 이 괄호 안에는 반드시 java.lang.AutoCloseable 인터페이스를
                     // 구현한 클래스만이 올 수 있다.
    ) {
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
    } 
  }

}










