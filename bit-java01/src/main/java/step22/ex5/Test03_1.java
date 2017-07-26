/* 예외 처리 문법: throws 명령 사용법
 * => 호출자에게 예외를 전달하는 메서드는 메서드 선언부(메서드 시그너처)에 어떤 예외를 전달하는 지 지정해야 한다.
 * => 메서드 시그너처 
 *    - 메서드의 형식을 선언하는 "메서드 선언부"를 가리키는 용어이다.
 *    - 리턴타입, 메서드명, 파라미터에 대한 부분만을 가리킨다.
 *    - C 언어에서는 "함수 프로토타입(function prototype)"이라 부른다.
 * => throws 문법
 *    리턴타입 함수명(파라미터,...) throws 예외타입, 예외타입, ... {...}
 *    
 *    
 */
package step22.ex5;

public class Test03_1 {

  static void m1() throws Exception { // 이렇게 메서드 선언부에 이 메서드가 전달하는 예외를 지정해야 한다.
    throw new Exception("예외 발생!"); 
  }
  
  public static void main(String[] args) {
    try {
      m1();
    } catch (Exception e) { 
      //예외처리 코드 
    }
  }

}










