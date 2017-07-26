/* 예외 처리 문법: throws 명령 사용법 - 스텔스 모드 예외 II
 * => RuntimeException 오류가 발생하는 메서드는 
 *    굳이 throws 문장을 작성할 필요는 없지만,
 *    그 메서드를 사용하는 다른 개발자들이 
 *    예외를 던지지 않을 거라고 착각하는 일을 막기 위해서
 *    가능한 throws 문장을 작성하는 것이 좋다.
 */
package step22.ex5;

public class Test03_6 {
  
  // 빈 문자열일 때 예외를 표현할 적당한 클래스가 없어서 다음과 같이 새로 만든다. 
  // => 스텔스 기능을 갖는 예외 클래스를 만들 때는 Exception 대신 RuntimeException을 상속 받아야 한다.
  static class EmptyStringException extends RuntimeException {
    public EmptyStringException() {}
    public EmptyStringException(String message) {
      super(message);
    }
  }

  // RuntimeException 예외가 발생하는 경우, throws 문장을 작성하지 않아도 되지만
  // 다른 개발자에게 어떤 예외가 발생하는지 구체적으로 알려주기 위해 throws 문장을 작성하였다.
  static void m4(String str) 
      throws NullPointerException, EmptyStringException {
    m3(str);  
  }
  
  static void m3(String str) 
      throws NullPointerException, EmptyStringException {
    m2(str); 
  }

  static void m2(String str) 
      throws NullPointerException, EmptyStringException {
    m1(str); 
  }
  
  static void m1(String str) 
    throws NullPointerException, EmptyStringException {
    
    if (str == null) 
      throw new NullPointerException("파라미터 값이 null입니다.");
    else if (str.length() == 0) 
      throw new EmptyStringException("빈 문자열입니다.");
    
    System.out.println(str);
  }
  
  
  
  public static void main(String[] args) {
    try {
      //m4("Hello!");
      m4(null);
      //m4("");
    } catch (Exception e) {
      System.out.println("예외가 발생했네요! 적절하게 초기할게요.");
    }
    
    // 또 다른 작업
    System.out.println("또 다른 작업을 수행!");
  }

}










