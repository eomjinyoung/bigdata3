/* 인터페이스 사용 전 
 * => CarTester에서 Tesla 자동차도 테스트하게 만들어 보자!
 * => 방법?
 *    - CarTester에 Tesla를 테스트할 수 있는 메서드를 추가하기.
 * 
 */
package step18.ex2;

public class Test01 {

  public static void main(String[] args) {
    // 자동차 객체 준비
    Tico tico = new Tico();
    Truck truck = new Truck();
    
    // 자동차 시험소에서 자동차를 테스트한다.
    CarTester.test(tico);
    CarTester.test(truck);
    
    // 전기 자동차를 준비
    Tesla tesla = new Tesla();
    
    // 이제는 자동차 시험소에서 전기 자동차를 테스트 할 수 있다.
    // 어떻게? 전기 자동차를 테스트할 수 있는 메서드를 추가했기 때문이다.
    CarTester.test(tesla);
  }

}







