/* 예외 처리 문법: 호출자에게 예외를 전달하고 호출자는 예외를 받기 
 * => 호출자에게 예외를 전달하는 문법
 *    throw Throwable객체;
 *    - Throwable 객체?
 *      java.lang.Throwable 객체 및 그 하위 클래스의 객체
 *      
 * =>예외를 던질 수 있는 메서드는 메서드 선언부에 어떤 예외를 던질 수 있는지 설정해야 한다.
 *    리턴타입 메서드명(파라미터,...) throws 던지는예외타입, ... {...} 
 *    
 * => 호출자가 메서드로부터 예외를 전달 받는 문법 
 *    try {
 *      예외를 던질 수 있는 메서드를 호출하는 코드
 *    } catch (예외타입 변수) {
 *      예외를 처리하는 코드 
 *    }
 */
package step22.ex5;

public class Test01_2 {

  static void m1() throws Throwable { // 어떤 예외를 전달할지 설정
    throw new Throwable("예외 발생!"); // 예외 상황을 호출자에게 전달
  }
  
  public static void main(String[] args) {
    try {
      m1(); // 예외를 던질 수 있는 메서드 호출
    } catch (Throwable e) { // 메서드가 전달한 예외 정보를 받을 변수 선언 
      //예외처리 코드 
    }
  }

}










