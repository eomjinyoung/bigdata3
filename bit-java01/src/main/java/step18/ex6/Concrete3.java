package step18.ex6;

/* 여러 인터페이스를 동시에 구현하지 못하는 경우가 있다.
 * => 즉 메서드명과 파라미터 선언은 같지만 리턴 타입이 다른 메서드는 동시에 존재할 수 없다.
 * => 다음 클래스는 X와 Y 인터페이스를 동시에 구현할 수 없다.
 */
public class Concrete3 implements X, Y {
  // X 인터페이스에 선언된 메서드 구현
  public void m1() {}
  public void m2() {} // 리턴 타입만 다른 m2() 메서드를 만들 수 없다. 문법 오류!
  
  // Y 인터페이스에 선언된 메서드 구현
  public void m3() {}
  public int m2() {]
}
