/* 인터페이스 사용 전 
 * => CarTester에서 Tesla도 테스트하게 만들어 보자!
 * => 방법?
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







