/* 예외 처리 문법: throw 명령 사용법 - 애플리케이션 예외
 * => 예외의 종류
 *    - 자바에서 예외는 크게 두 종류로 다룬다.
 *    - JVM에서 발생하는 시스템 예외와 개발자가 작성한 코드에서 발생하는 애플리케이션 예외로 나눈다.
 *    - 이런 두 종류의 예외를 표현하기 위해 Java에서는 Throwable 클래스의 자식 클래스로 
 *      두 개의 클래스를 두고 있다. Error와 Exception이다.  
 * => 애플리케이션 예외
 *    - Throwable의 두 개의 자식 클래스 중에서 Exception 계열의 예외를 말한다.
 *    - 애플리케이션을 잘못 작성해서 발생하는 예외이다. 즉 개발자가 발생시킨 예외이다.
 *      그래서 애플리케이션 예외라 부른다. 
 *    - 개발자가 반드시 다뤄야 할 예외이다.
 *    - 예를 들어 레퍼런스 변수에 주소가 없는데 그 레퍼런스를 사용하려 한다거나,
 *      배열의 범위가 아닌 인덱스를 지정하는 등의 작업을 수행할 때 발생한다.
 *      예) NullPointerException, ArrayIndexOutOfBoundsException 등
 *    - 이런 예외에 대해서 개발자는 try ~ catch 문법을 이용하여 처리해야 한다.
 *    - 예외 처리 문법의 존재 이유인 
 *      "예외가 발생하더라도 적절한 조치를 취한 후 계속 실행하게 하는 문법"의 대상이다. 
 *    - 반드시 개발자가 이런 예외에 대해 조치를 취하는 코드를 작성해야 한다.
 */
package step22.ex5;

public class Test02_3 {

  static void m1() throws Exception {
    throw new Exception("애플리케이션 예외 발생"); 
  }
  
  public static void main(String[] args) {
    try {
      m1();
    } catch (Exception e) { 
      // 적절한 조치를 취한 후 계속 실행한다. 시스템을 종료하지 않는다.
      System.out.println("게시물 등록 중 오류 발생! 필수 입력이 빠졌습니다. 다시 등록하세요!");
    }
    
    // 또 다른 작업
    System.out.println("또 다른 작업을 한다.");
  }

}










