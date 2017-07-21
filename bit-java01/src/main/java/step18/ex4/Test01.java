/* 인터페이스 사용 후
 * => CarTester는 Car라는 특정 클래스 계열에 한해서 테스트를 하는 게 아니라,
 *    내연기관, 전기자동차, 앞으로 양산될 수소 자동차까지 상관없이
 *    "자동차"로서 기능을 갖고 있다면 모두 테스트 하도록 바꾼다.
 * => 어떻게?
 *    엔진을 이용하는 차든 모터를 이용하는 차든 모두 자동차의 기능을 갖고 있다.
 *    바로 이 기능을 따로 추상화시켜라!
 *    Car라는 이름을 자동차가 가져야하는 기능을 추상화시켜라.
 *    그리고 자동차라고 주장하는 객체들은 이 기능을 갖추면 되는 것이다.
 * 
 * => 코드
 *    - 자동차 기능을 정의한 Car 인터페이스 생성
 *    - Tico, Truck, Tesla 모두 자동차임을 선언하기 위해 
 *      Car 규칙에 따라 자동차 기능을 구현한다.
 *    - 그리고 CarTester.test() 메서드도 특정 클래스에 종속되지 말고,
 *      Car 규칙에 따라 만든 클래스라면 어떤 객체든지 테스트할 수 있게 만든다.
 *     
 *    
 */
package step18.ex4;

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
    
    // 자동차 시험소에서 전기 자동차르르 테스트 할 수 있을까?
    // test(Car) 메서드는 오직 Car 객체만 파라미터로 받을 수 있다.
    // Tesla 객체는 Car의 서브 클래스가 아니다. 
    // 그래서 현재의 CarTester에서는 Tesla를 테스트 할 수 없다.
    //CarTester.test(tesla); // 컴파일 오류!
    
    // 새로운 요구!
    // => CarTester가 ElectCar를 상속 받은 전기 자동차도 테스트 하고 싶다!
    // => 해결책? 다음 패키지를 보라!
  }

}







