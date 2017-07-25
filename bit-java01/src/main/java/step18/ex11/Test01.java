/* 인터페이스: default 메서드
 * => 인터페이스를 정의하고, 
 *    그 인터페이스(규칙)에 따라 클래스를 만들어 사용할 것이다.
 *    예를 들면 Tico, Truck, Tesla 클래스들은 Car 규칙(인터페이스)에 따라 작성하였다.
 * => 어느 정도 시간이 지나,
 *    인터페이스(규칙)에 새 기능(항목)을 추가할 필요성이 생기게 되었다고 가정하자!
 *    새 규칙을 추가하는 순간,
 *    이전 규칙(인터페이스)에 따라 작성된 모든 클래스들을 변경해야 하는 문제가 발생한다.
 *    그렇다고 새 규칙을 정의하자니 유지보수에 좋지 않고,
 *    이전 규칙을 바꾸자니 그 규칙에 따라 작성된 클래스를 모두 변경해야 하는 문제가 있다.
 * => 해결책?
 *    이런 문제를 해결하고자 나온 문법이 default 메서드이다.
 *    기존 규칙(인터페이스)에 새 항목(메서드)를 추가하되,
 *    기존 클래스를 바꾸지 않아도 되게 만드는 것이다.
 * => Car 인터페이스에 전조등을 켜는 메서드를 추가해 보자!
 *  
 */
package step18.ex11;

public class Test01 {

  public static void main(String[] args) {
    // 자동차 객체 준비
    Tico tico = new Tico();
    Truck truck = new Truck();
    Tesla tesla = new Tesla();
    
    // 자동차 시험소에서 자동차를 테스트한다.
    // CarTester는 Engine을 갖고 있든 Motor을 갖고 있든 상관하지 않는다.
    // 다만 Car 규칙에 따라 만든 클래스여야 한다.
    // 그런 객체라면 언제든 테스트를 할 수 있다.
    // Tico, Truck과 Tesla가 비록 서로 부모 클래스가 다르더라도
    // 모두 Car 인터페이스(규칙)를 구현했기(따라 만들었기) 때문에
    // CarTester.test() 메서드에 파라미터 값으로 넘길 수 있다.
    CarTester.test(tico); // OK!
    CarTester.test(truck); // OK!
    CarTester.test(tesla); // OK!
    
  }

}







