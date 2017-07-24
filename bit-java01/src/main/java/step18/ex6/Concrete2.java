package step18.ex6;

/* 인터페이스끼리 겹치는 메서드는 상관없다. 
 * => 각각의 인터페이스에 입장에서 자신의 메서드를 모두 구현하면 되기 때문이다.
 * => 즉 컴파일러 입장에서는 Concrete2 클래스는 C에 선언된 메서드도 모두 구현하고 있고,
 *    D에 선언된 메서드도 모두 구현하고 있기 때문에 아무런 문제가 없다.
 */
public class Concrete2 implements C, D {
  // C 인터페이스에 선언된 메서드 구현
  public void m1() {}
  
  // C와 D 인터페이스에 선언된 메서드 구현
  public void m2() {}
  
  // D 인터페이스에 선언된 메서드 구현
  public void m3() {}
}
