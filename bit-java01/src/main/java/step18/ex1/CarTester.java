/* Car를 테스트하는 객체
 * 
 */
package step18.ex1;

public class CarTester {

  public static void test(Car car) {
    // 자동차를 파라미터로 받아서 시험한다.
    car.start();
    car.run();
    car.stop();
    System.out.println("-----------------------");
  }

}
