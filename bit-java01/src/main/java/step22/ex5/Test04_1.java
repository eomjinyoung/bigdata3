/* 예외 처리 문법: try ~ catch ~ 사용법
 * => 예외를 던지는 코드를 사용할 때 그 예외를 처리하는 문법이다.
 * => 문법
 *    try {
 *      예외를 던지는 코드
 *      ...
 *    } catch (예외를 받는 변수 선언) {
 *      예외를 처리하는 코드
 *      ...
 *    }
 *    
 *    
 */
package step22.ex5;

public class Test04_1 {

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
      
    } catch (NullPointerException e) {
      System.out.println("null 값입니다."); 
      
    } catch (EmptyStringException e) {
      System.out.println("빈 문자열입니다."); 
    }
    
    // 또 다른 작업
    System.out.println("예외가 발생하더라도 또 다른 작업은 실행되어야 한다.");
  }

}










