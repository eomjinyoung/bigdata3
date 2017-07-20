/* Top level nested class = static nested class
 * => static nested class의 로딩 
 * => static nested class가 특정 클래스에 소속되어 있다고 해서
 *    바깥 클래스가 로딩될 때 자동으로 로딩되는 것은 아니다.
 * => 단지 특정 클래스에 소속되었다는 것이지,
 *    로딩이 되려면 그 클래스를 사용해야 한다.
 *    1) 클래스 멤버(변수,메서드)를 사용할 때.
 *    2) 인스턴스를 만들 때.
 */
package step15.ex2;

public class Test01_2 {
  static {
    System.out.println("Test01_2의 static{} 실행");
  }
  
  // static nested class = top level nested class 
  static class MyClass {
    static {
      System.out.println("MyClass의 static{} 실행");
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Test01_2.main()");
    
    // 다음과 같이 static 중첩 클래스를 사용할 때 비로서 로딩된다.
    //Test01_2.MyClass obj = new Test01_2.MyClass();
  }
}











