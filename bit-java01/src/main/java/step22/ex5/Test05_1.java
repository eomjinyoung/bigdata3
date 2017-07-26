/* 예외 처리 문법: finally 블록 사용법
 * => finall 블록은 선택 사항이다.
 *    예외가 발생하든 하지 않든 무조건 실행할 코드가 있다면 
 *    finally 블록에 두어라!
 * => try ~ catch ~ 블록을 빠져나가기 전에 finally 블록은 반드시 실행한다.
 *    그래서 보통 finally 블록에는 try 블록에서 사용한 자원을 해제시키는 코드를 둔다.
 *    예를 들어 DB 커넥션을 닫는다거나 파일을 닫는 등의 작성을 수행한다. 
 * => 문법
 *    try {
 *      예외를 던지는 코드
 *      ...
 *    } catch (자식예외클래스 변수) {
 *      ...
 *    } catch (부모예외클래스 변수) {
 *      ...
 *    } finally {
 *      try ~ catch ~를 나가기 전에 마무리 해야할 코드
 *    }
 *    
 *    
 */
package step22.ex5;

public class Test05_1 {

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
      m1("Hello!"); // 정상적으로 실행해도 finally 블록은 실행되고,
      //m1(null); // 예외가 발생되면 catch 블록을 실행한 후 finally 블록이 실행된다.
      System.out.println("try 블록 정상 실행!");
      //return; // 아예 메서드를 나가려 해도, try ~ catch ~ 벗어나기 전에 finally 블록은 반드시 실행된다. 
      
    } catch (NullPointerException e) { // 자식 예외 먼저 받는다.
      System.out.println("m1()의 파라미터 값이 null입니다.");
      
    } catch (RuntimeException e) { // 그 다음에 부모 예외를 받아야 한다.
      System.out.println("m1()의 파라미터 값이 빈 문자열입니다.");
      
    } finally {
      System.out.println("finally 블록 실행!");
    }
    
    // 또 다른 작업
    System.out.println("예외가 발생하더라도 또 다른 작업은 실행되어야 한다.");
  }

}










