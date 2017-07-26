/* 예외 처리 문법: finally 블록 사용법 II
 * => 예외 처리를 상위 호출자에게 맡기는 경우가 있다.
 *    이런 경우 catch 블록 없이 try ~ finally ~ 를 작성할 수 있다.
 * => 문법
 *    try {
 *      예외를 던지는 코드
 *      ...
 *    } finally {
 *      try ~ catch ~를 나가기 전에 마무리 해야할 코드
 *    }
 *    
 *    
 */
package step22.ex5;

public class Test05_2 {

  static void m2(String str) {
    try {
      m1(str); // m1()에서 예외가 발생하면 상위 호출자에게 전달한다.
               // m1()이 던지는 예외는 RuntimeException 이기 때문에
               // m2() 메서드 선언부에 따로 throws 문장을 작성할 필요는 없다.
               // 물론 RuntimeException 아니면 throws 문장을 작성해야 할 것이다.
      System.out.println("m1() 호출을 정상적으로 완료하였습니다.");
      
    } finally { // catch 블록 없이 finally 블록을 작성할 수 있다.
      System.out.println("finally 실행!");
    }
  }
  
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
      //m2("Hello!"); // 정상적인 실행!
      m2(null); // 일부로 예외 발생시키기
      
    } catch (NullPointerException e) { // 자식 예외 먼저 받는다.
      System.out.println("m1()의 파라미터 값이 null입니다.");
      
    } catch (RuntimeException e) { // 그 다음에 부모 예외를 받아야 한다.
      System.out.println("m1()의 파라미터 값이 빈 문자열입니다.");
      
    }
    
    // 또 다른 작업
    System.out.println("예외가 발생하더라도 또 다른 작업은 실행되어야 한다.");
  }

}










