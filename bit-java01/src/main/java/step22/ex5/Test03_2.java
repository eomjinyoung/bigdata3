/* 예외 처리 문법: throws 명령 사용법 - 여러 타입의 예외를 던질 때
 * => 메서드 시그너처에 차례대로 나열하면 된다.
 * => throws 문법
 *    리턴타입 함수명(파라미터,...) throws 예외타입1, 예외타입2, ... {...}
 *    
 *    
 */
package step22.ex5;

import javax.management.BadStringOperationException;

public class Test03_2 {

  static void m1(String str) 
      throws NullPointerException, BadStringOperationException { 
    
    if (str == null)
      throw new NullPointerException("파라미터 값이 null입니다.");
    else if (str.length() == 0) 
      throw new BadStringOperationException("빈 문자열입니다.");
    
    System.out.println(str);
  }
  
  public static void main(String[] args) throws Exception {
    m1("Hello!");
  }

}










