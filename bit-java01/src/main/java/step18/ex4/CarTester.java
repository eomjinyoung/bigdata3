/* Car를 테스트하는 객체
 * 
 */
package step18.ex4;

public class CarTester {

  public static void test(Engine car) {
    // 자동차를 파라미터로 받아서 시험한다.
    car.start();
    car.run();
    car.stop();
    System.out.println("-----------------------");
  }

}
