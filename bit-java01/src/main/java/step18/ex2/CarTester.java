/* Car를 테스트하는 객체
 * 
 */
package step18.ex2;

public class CarTester {

  public static void test(Engine car) {
    // 자동차를 파라미터로 받아서 시험한다.
    car.start();
    car.run();
    car.stop();
    System.out.println("-----------------------");
  }

  // 파라미터는 다르더라도 같은 기능을 수행하는 메서드에 대해서
  // 같은 이름을 부여함으로써 프로그래밍을 일관성 있게 작성하게 하는 문법 => "overloading
  public static void test(Tesla car) {
    car.on();
    car.run();
    car.off();
    System.out.println("-----------------------");
  }
}




