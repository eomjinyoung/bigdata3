/* 예외 처리 문법: throws 명령 사용법 - 스텔스 모드 예외
 * => 어떤 예외를 던지는 메서드를 실행하는 메서드가 있다면,
 *    try ~ catch ~로 예외를 처리하거나 
 *    아니면 상위 호출자에게 예외를 던진다는 의미에서 
 *    메서드 선언부에 throws 문장을 작성해야 한다.
 * => 예를 들면, 
 *    m1() 메서드에서 예외를 던지는데,
 *    m1()을 호출하는 m2() 메서드에서는 m1()이 던진 예외를 호출자에게 전달하기 위해
 *    m2() 메서드 선언부에 throws 문장을 작성하였다.
 *    m3(), m4() 메서드도 m2() 마찬가지로 throws 문장을 작성하였다.
 * => m2()와 m3(), m4()처럼 
 *    예외를 발생시키는 m1()과 그 기능을 요구하는 main() 사이에 끼어 있다는 이유만으로
 *    메서드 선언부에 throws 문장을 작성해야 한다면 매우 불편할 것이다.
 *    그래서 등장한 문법이 스텔스 모드 예외이다.
 *    즉 예외를 전달한다고 선언하지 않아도 문법적으로 문제가 없는 것을 말한다.
 * => java.lang.RuntimeException
 *    - Exception의 자식 클래스이다.
 *    - RuntimeException 계열의 예외를 던질 때는
 *      Exception과 달리 메서드 선언부에 throws 문장을 작성할 필요가 없다.
 *    - 그래서 예외를 던지는 메서드를 호출하기가 편리하다.
 *    
 *    
 *    
 *    
 */
package step22.ex5;

public class Test03_5 {
  
  // 빈 문자열일 때 예외를 표현할 적당한 클래스가 없어서 다음과 같이 새로 만든다. 
  // => 스텔스 기능을 갖는 예외 클래스를 만들 때는 Exception 대신 RuntimeException을 상속 받아야 한다.
  static class EmptyStringException extends RuntimeException {
    public EmptyStringException() {}
    public EmptyStringException(String message) {
      super(message);
    }
  }

  //RuntimeException 예외가 발생하는 경우, throws 문장을 작성하는 것은 선택사항이다. 
  static void m4(String str) {
    m3(str);  
  }
  
  //RuntimeException 예외가 발생하는 경우, throws 문장을 작성하는 것은 선택사항이다. 
  static void m3(String str) {
    m2(str); 
  }

  // RuntimeException 예외가 발생하는 경우, throws 문장을 작성하는 것은 선택사항이다. 
  static void m2(String str) {
    m1(str); 
  }
  
  // NullPointerException과 EmptyStringException은 RuntimeException의 서브 클래스이다.
  // RuntimeException 예외를 던지는 경우에는 메서드 선언부에 throws 문장을 작성할 필요가 없다.
  // 왜? 중간에 끼어있는 메서드들이 throws 문장을 작성해야 하는 불편함을 없애주기 위해서이다.
  static void m1(String str) {
    
    if (str == null) // NullPointerException 은 RuntimeException 서브 클래스이다.
      throw new NullPointerException("파라미터 값이 null입니다.");
    else if (str.length() == 0) 
      throw new EmptyStringException("빈 문자열입니다.");
    
    System.out.println(str);
  }
  
  
  
  public static void main(String[] args) {
    // m4()는 RuntimeException을 던질 수 있다.
    // RuntimeException의 예외 처리는 선택사항이다.
    // 다음과 같이 try ~ catch ~ 사용하여 예외를 처리해도 되고 또는 처리하지 않아도 된다.
    // 다만 처리하지 않으면 메서드 선언부에 throws 문장이 없더라도 상위 호출자에게 자동으로 전달된다.
    // 여기서 중요한 점!
    // 처리하지 않아도 문법 오류가 발생하지 않기 때문에 
    // 개발자가 오류를 처리하지 않고 놓치는 상황이 발생할 수 있다.
    // main()에서 오류를 잡지 못하고 놓치면 그대로 JVM에게 전달되고, JVM은 실행을 멈춘다.
    // 이것을 주의하라!
    // 따라서 컴파일 오류가 안뜬다고 안심하지 말고,
    // 혹시 RuntimeException을 던지는 것은 아닌지 늘 살펴봐라!
    // 어찌되었든 main()에서는 무조건 예외를 처리하도록 해야 한다.
    // 
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










