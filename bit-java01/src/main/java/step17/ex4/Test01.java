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
    
    

  }

}








