package step18.ex6;

// 클래스를 다중 상속할 수 없지만,
// 인터페이스는 다중 구현이 가능하다.
// => 각각의 인터페이스에 선언된 메서드를 모두 구현하면 된다.
public class Concrete implements A, B {
  // A 인터페이스에 선언된 메서드 구현
  public void m1() {}
  public void m2() {}
  
  // B 인터페이스에 선언된 메서드 구현
  public void m3() {}
  public void m4() {}

}
