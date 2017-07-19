/* Top level nested class = static nested class
 * => nested class
 *    - 패키지에 소속된 클래스가 아니라 다른 클래스에 소속된 클래스를 말한다.
 *    - 특정 클래스 안에서만 사용될 클래스인 경우 굳이 패키지 멤버로 만들지 않고 
 *      유지보수에 좋도록 사용 범위를 좁히기 위해 만든 문법이다.
 *    - 즉 특정 클래스 안에서만 사용되는 클래스라면
 *      특정 클래스 안에서만 사용되도록 가둬두면
 *      유지보수할 때 편하다. 
 * => static nested class?
 *    - nested class(중첩클래스) 중에서 static이 붙은 중첩 클래스를 말한다.
 *    - 변수나 메서드를 한 클래스 안에 두기에는 변수나 메서드가 너무 많이 관리하기가 불편하고, 
 *      그렇다고 따로 클래스로 뽑아내기에는 너무 많이 클래스를 만들어야 할 것 같을 때,
 *      static nested class 문법을 사용한다.
 *    - 특히 계층 구조로 변수나 메서드를 관리하고 싶을 때 사용한다.
 *    - 보통 상수 값을 정의할 때 많이 사용한다.
 *    - 계층구조하면 기억해야 할 키워드 "OGNL".
 * OGNL?
 * => Object Graph Navigation Language의 약자이다.
 * => 클래스(또는 객체)에 소속된 변수나 메서드를 사용할 때 파일의 경로처럼 단순하게 표현하는 문법
 *    예) 파일을 가리킬 때 다음과 같이 슬래시를 이용하여 파일의 위치를 가리킨다.
 *       c:/workspace/java01/src/main/java/Hello.java
 *    예) 객체의 변수나 메서드도 위와 같이 표현하면 편할 것이다.
 *       student.photo.filename
 *       book.press.name 
 *  
 */
package step15.ex2;

public class Test02_1 {
  
  // static nested class = top level nested class 
  static class MyClass {
    
  }
  
  public static void main(String[] args) {
    
  }
}











