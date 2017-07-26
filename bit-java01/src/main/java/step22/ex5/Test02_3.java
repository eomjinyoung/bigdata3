/* 예외 처리 문법: throw 명령 사용법 II
 * => 사용자 정의 예외 던지기
 *    - 예외가 발생하는 상황에서 개발자는 자바 API에서 그 예외를 잘 표현할 수 있는 예외 클래스를 찾아 던진다.
 *    - 만약 예외를 적절하게 표현할 클래스가 없다면 개발자가 Throwable의 하위 클래스를 만들어 전달할 수 있다. 
 */
package step22.ex5;

public class Test02_3 {

  static void m1() throws Throwable {
    //throw new String("예외 발생!"); // 컴파일 오류!
    //throw new Exception("예외 발생!"); // OK! Exception은 Throwable의 자식 클래스이다.
    //throw new Error("예외 발생"); // OK! Error는 Throwable의 자식 클래스이다.
    throw new RuntimeException("예외 발생"); // OK! RuntimeException은 Exception의 자식이다.
  }
  
  public static void main(String[] args) {
    try {
      m1();
    } catch (Throwable e) { 
      //예외처리 코드 
    }
  }

}










