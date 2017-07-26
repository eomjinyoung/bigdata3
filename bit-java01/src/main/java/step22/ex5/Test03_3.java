/* 예외 처리 문법: throws 명령 사용법 - 여러 타입의 예외를 던질 때 하나의 예외로 통합하기
 * => 메서드에서 호출자에게 전달하는 예외가 여러 타입일 때,
 *    각각의 예외 타입을 다음과 같이 method signature에 나열 할 수도 있지만,
 *       리턴타입 함수명(파라미터,...) throws 예외타입1, 예외타입2, ... {...}
 *    또는 그 타입들의 공통 분모인 즉 부모 클래스를 사용하여 하나로 통합할 수 있다.
 *       리턴타입 함수명(파라미터,...) throws 부모예외타입 {...}
 *    
 *    
 */
package step22.ex5;

import javax.management.BadStringOperationException;

public class Test03_3 {

  static void m1(String str) 
      throws Exception { // 이렇게 공통의 조상 예외 클래스를 지정해도 된다.
                         // 단 이 방법은 이 메서드를 사용하는 쪽에 자세한 정보를 전달하지 못하기 때문에 
                         // 유지보수에는 오히려 손해이다.
    
    if (str == null)
      throw new NullPointerException("파라미터 값이 null입니다.");
    else if (str.length() == 0) 
      throw new BadStringOperationException("빈 문자열입니다.");
    
    System.out.println(str);
  }
  
  public static void main(String[] args) throws Exception {
    //m1("Hello!");
    //m1(null);
    m1("");
  }

}










