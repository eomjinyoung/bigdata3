/* 스태틱 블록 : 클래스가 로딩되는 경우
 * => 클래스가 로딩될 때 클래스 변수가 생성되고 스태틱 블록이 실행된다.
 *    이것을 가지고 클래스가 언제 실행되는지 알아보자! 
 * 
 */
package step09;

class MyClass3 {
  static {
    System.out.println("MyClass3 스태틱 블록 실행:");
  }
}

public class Test03_3 {
  static {
    System.out.println("Test03_3 스태틱 블록 실행:");
  }
  
  public static void main(String[] args) {
    System.out.println("Hello!");
  }
}









