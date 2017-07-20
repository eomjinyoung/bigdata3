/* local class - 접근 제어 modifier를 붙일 수 없다.
 *     
 */
package step15.ex4;

public class Test01_3 {
  // static 또는 non-static nested class는 
  // 클래스 멤버(변수,메서드)나 인스턴스 멤버(변수,메서드)처럼 접근 범위를 조절할 수 있다.
  public static class MyClass1 {}
  protected static class MyClass2 {}
  static class MyClass3 {}
  private static class MyClass4 {}
  
  public class MyClass5 {}
  protected class MyClass6 {}
  class MyClass7 {}
  private class MyClass8 {}
  
  public static void main(String[] args) {
    // local class는 로컬 변수와 같다. 즉 접근을 제어할 수 없다. 
    //public class MyClass9 {} // 컴파일 오류!
    //protected class MyClass10 {} // 컴파일 오류!
    //private class MyClass11 {} // 컴파일 오류!
    class MyClass12 {} // 로컬 변수처럼 접근 제어 modifier를 붙일 수 없다.
    
  }
}





