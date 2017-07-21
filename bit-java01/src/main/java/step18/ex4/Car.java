package step18.ex4;

/* Car 인터페이스
 * => 자동차가 반드시 가져야 하는 기능을 선언하고 있다.
 * => 구현하는 것은 클래스의 몫이다.
 * => 즉 인터페이스의 모든 메서드는 추상 클래스이다.
 * => 호출자(사용하는자)와 피호출자(사용되는자) 사이의 사용 규칙이다.
 * => 여기서 Car는
 *    호출자(사용하는 자): CarTester
 *    피호출자(사용되는 자): Tico, Truck, Tesla
 * => CarTester는 Car 규칙에 따라 Tico나 Truck, Tesla를 사용할 것이다. 
 */
public interface Car {
  // 모든 메서드는 public이고 abstract이다.
  // 붙여도 되지만 생략해도 된다. 보통 생략한다.
  void start();
  void run();
  void stop();
}










