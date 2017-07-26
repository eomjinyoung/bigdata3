/* 예외 처리 문법: try ~ catch ~ 사용법 - 부모/자식 관계가 있는 예외를 받을 때
 * => 자식 예외를 받는 catch 블록을 먼저 선언해야 한다.
 *    만약 부모 예외를 받는 catch 블록을 앞에 있다면 결코 자식 예외를 받는 catch 블록은 실행되지 않을 것이다.
 *    왜? 부모 변수에서 다 받기 때문이다.
 * => 문법
 *    try {
 *      예외를 던지는 코드
 *      ...
 *    } catch (자식예외클래스 변수) {
 *      ...
 *    } catch (부모예외클래스 변수) {
 *      ...
 *    }
 *    
 *    
 */
package step22.ex5;

public class Test04_4 {

  static void m1(String str) 
    throws NullPointerException, RuntimeException {
    
    if (str == null) 
      throw new NullPointerException("파라미터 값이 null입니다.");
    else if (str.length() == 0) 
      throw new RuntimeException("빈 문자열입니다.");
    
    System.out.println(str);
  }
  
  public static void main(String[] args) throws Exception {
    try {
      //m1("Hello!");
      //m1(null);
      m1("");
      
    } catch (NullPointerException e) { // 자식 예외 먼저 받는다.
      System.out.println("m1()의 파라미터 값이 null입니다.");
      
    } catch (RuntimeException e) { // 그 다음에 부모 예외를 받아야 한다.
      System.out.println("m1()의 파라미터 값이 빈 문자열입니다.");
    } 
    
    // 또 다른 작업
    System.out.println("예외가 발생하더라도 또 다른 작업은 실행되어야 한다.");
  }

}










