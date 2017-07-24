package step18.ex8;

public class Concrete implements C {
  // C 인터페이스에 선언된 메서드 구현
  public void m4() {}
  
  // C가 상속 받은 A 인터페이스의 모든 메서드 구현
  public void m1() {}
  
  // A와 B의 공통 메서드 구현 
  public void m2() {}
  
  // C가 상속 받은 B 인터페이스의 모든 메서드 구현
  public void m3() {}
}
