package step18.ex7;

/* 클래스는 인터페이스를 구현할 때,
 * 그 인터페이스가 상속 받은 메서드까지 모두 구현해야 한다.
 */
public class Concrete implements C {
  // C 인터페이스에 선언된 메서드 구현
  public void m4() {}
  
  // C가 상속 받은 B 인터페이스 메서드 구현
  public void m3() {}
  
  // B가 상속 받은 A 인터페이스 메서드 구현
  public void m2() {}
  public void m1() {}
  
}
