/* 예외 처리 문법: throw 명령 사용법
 * => 예외 정보를 호출자에게 던질 때 사용한다.
 * => java.lang.Throwable 객체만 던질 수 있다.
 *    서브 클래스는 상위 클래스의 모든 기능을 포함하고 있으니까
 *    당연히 그 서브 클래스도 가능하다.
 */
package step22.ex5;

public class Test02_1 {

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










