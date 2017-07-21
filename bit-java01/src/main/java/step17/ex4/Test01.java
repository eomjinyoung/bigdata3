/* 추상 클래스 : 적용 전
 * => Vehicle, Car 클래스는 상속의 기법 중 generalization을 통해 추가된 클래스이다.
 * => 이 클래스들은 직접 사용할 목적으로 만든 게 아니라,
 *    서브 클래스의 공통 변수와 공통 메서드를 한 클래스에 묶어 두고 
 *    향후 다른 서브 클래스를 만들 때 사용할 수 있도록 하기 위해
 *    만든 클래스들이다.
 *    
 *    
 */
package step17.ex4;

public class Test01 {

  public static void main(String[] args) {
    // 자동차를 다루기 위해 객체를 준비한다.
    Tico car1 = new Tico();
    car1.run();
    
    Truck car2 = new Truck();
    car2.run();
    
    ElectCar car3 = new ElectCar();
    car3.run();
    
    
    // 원래는 Tico, Truck, ElectCar 클래스를 사용해야 하는데,
    // Vehicle, Car는 다른 서버 클래스를 만들 때 사용하라고 만든 클래스인데
    // 어떤 개발자가 다음과 같이 Vehicle, Car 클래스를 사용하여 인스턴스를 만든다면?
    // => 물론 일반 클래스이니까 객체를 만들 수 있을 것이고,
    //    메서드가 있으니까 호출할 수 있을 것이다.
    // => 그러나, 이 클래스의 원래 목적은 직접 사용하려고 만들어진 클래스가 아니었다.
    //    그래서 사용해봐야 별 의미가 없는 코드를 작성하게 될 것이다.
    // => Vehicle이나 Car 클래스처럼 특히 generalization을 통해
    //    다른 서브 클래스를 만들 때 공통 변수나 공통 메서드를 상속 받으려고 만든 클래스인 경우
    //    직접 사용하지 못하게 막는 것이 필요하다!
    //    문법적으로 가능한가? 
    //    => 가능하다! 그런거 하라고 만든 문법이 "추상클래스(abstract class)" 이다.
    Vehicle car4 = new Vehicle();
    car4.run();
    
    Car car5 = new Car();
    car5.run();
    

  }

}








