/* 예외 처리 문법: try ~ catch ~ 사용법 - 여러 타입을 한 개의 catch 블록에 통합하는 방법
 * => Java 7에 추가된 문법이다.  
 * => 오류를 처리하는 코드가 같을 때 각 예외 별로 중복해서 작성하는 것은 바람직하지 않다.
 *    이런 경우 한 개의 catch 블록에서 처리하도록 한다.
 * => 문법
 *    try {
 *      예외를 던지는 코드
 *      ...
 *    } catch (예외타입1 | 예외타입2 | ... | 예외타입n 변수) {
 *      예외를 처리하는 코드
 *      ...
 *    }
 *    
 *    
 */
package step22.ex5;

public class Test04_2 {

  static class EmptyStringException extends RuntimeException {
    public EmptyStringException() {}
    public EmptyStringException(String message) {
      super(message);
    }
  }
  
  static void m1(String str) 
    throws NullPointerException, EmptyStringException {
    
    if (str == null) 
      throw new NullPointerException("파라미터 값이 null입니다.");
    else if (str.length() == 0) 
      throw new EmptyStringException("빈 문자열입니다.");
    
    System.out.println(str);
  }
  
  public static void main(String[] args) throws Exception {
    try {
      //m1("Hello!");
      //m1(null);
      m1("");
      
    } catch (NullPointerException | EmptyStringException e) {
      System.out.println("m1()의 파라미터 값이 null 또는 빈 문자열입니다."); 
    }
    
    // 또 다른 작업
    System.out.println("예외가 발생하더라도 또 다른 작업은 실행되어야 한다.");
  }

}










