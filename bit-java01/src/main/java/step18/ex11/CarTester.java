/* Car를 테스트하는 객체
 * 
 */
package step18.ex11;

public class CarTester {

  // 이전 예제에서는 Engine과 같이 특정 클래스를 받았다.
  // 그러다 보니 자동차이지만 Engine이 아닌 경우 테스트를 하지 못하는 상황이 발생했다.
  // 진즉에 이처럼 특정 클래스가 아닌 특정 규칙으로 파라미터를 받았더라면,
  // 좀더 다양한 자동차 객체를 테스트 할 수 있었으리라!
  public static void test(Car car) {
    // Engine을 상속 받든 Motor를 상속 받든 아니면 다른 클래스를 상속 받든 상관없이
    // 자동차로서 Car 규칙을 준수한다면 어떤 객체든 테스트 할 것이다. 
    car.start();
    car.run();
    car.stop();
    System.out.println("-----------------------");
  }

}
