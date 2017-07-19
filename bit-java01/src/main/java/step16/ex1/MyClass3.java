// 오버라이딩 불가 메서드 만들기
package step16.ex1;

// 메서드 앞에 final을 붙이면 오버라이딩 할 수 없다.
public class MyClass3 {
  
  // m1()은 서브클래스에서 오버라이딩 할 수 없다.
  public final void m1() {
    System.out.println("Hello!");
  }
  
  public void m2() {
    System.out.println("Hello2!");
  }

}
