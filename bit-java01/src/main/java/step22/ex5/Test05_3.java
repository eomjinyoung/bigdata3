/* 예외 처리 문법: finally 블록 사용법 III
 * => finally를 사용하는 전형적인 예:
 *    - 파일 입/출력 객체를 사용할 때
 *    - DB 커넥션을 사용할 때
 *    - 네트워크 소켓을 사용할 때
 *    등
 *    
 *    
 */
package step22.ex5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test05_3 {

  public static void main(String[] args) {
    
    FileReader in = null;
    
    try {
      // 1) 프로젝트 폴더에서 Hello.c 파일을 읽어 들이는 도구를 준비한다.
      in = new FileReader("Hello.c");
      
      // 2) 한 문자씩 읽어서 출력한다.
      int ch;
      while (true) {
        ch = in.read();
        if (ch == -1) // 파일에서 읽을 데이터가 더이상 없다면 read()는 -1을 리턴한다. 
          break; // -1을 리턴하면 즉시 반복문을 멈춘다.
        System.out.print((char)ch); // 어어~~ ch 변수에 들어 있는 것은 유니코드이니까
                                    // 출력할 때 그 유니코드에 해당하는 문자를 출력하렴.
      }
    } catch (FileNotFoundException e) {
      System.out.println("해당 파일을 찾을 수 없습니다.");
      
    } catch (IOException e) {
      System.out.println("한 문자를 읽다가 오류가 발생했습니다.");
      
    } finally {
      
      try {
        in.close(); // try 블록은 finally 블록과 다른 블록이기 때문에
                    // try 블록에서 선언된 변수는 finally 블록에서 사용할 수 없다.
        // close() 메서드도 IOException 예외를 던지기 때문에 try ~ catch ~ 로 처리해야 한다.
      } catch (IOException e) {
        // 단 close()를 호출하다가(파일을 사용한 후 닫다가) 오류가 발생한 경우에는
        // 개발자가 특별히 뭔가 처리할 게 없다. 
        // catch 블록을 그냥 빈채로 둬라!
      } 
                  
    }
  }

}










