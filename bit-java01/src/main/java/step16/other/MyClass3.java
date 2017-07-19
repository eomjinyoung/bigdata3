// 오버라이딩 불가 메서드 만들기
package step16.other;

// 메서드 앞에 final을 붙이면 오버라이딩 할 수 없다.
public class MyClass3 {
  
  // m1()은 서브클래스에서 오버라이딩 할 수 없다.
  // 오버라이딩을 못하게 하는 이유?
  // => 원래의 기능 그대로 쓰도록 강제하고 싶을 때 사용하라!
  // => 보안상 서브 클래스에서 재정의 하지 못하게 막고 싶을 때 사용하라! 
  public final void m1() {
    System.out.println("Hello!");
  }
  
  public void m2() {
    System.out.println("Hello2!");
  }

}
