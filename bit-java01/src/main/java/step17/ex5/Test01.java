/* 추상 클래스 : 적용 후
 * => Vehicle, Car 클래스처럼 단순히 서브 클래스에게 공통 변수나 공통 메서드를 상속해 줄 요량으로 
 *    만든 클래스들은 직접 사용하지 못하게 막아야 한다.
 * => 어떻게?
 *    - 추상클래스로 선언하라!
 *    - 추상클래스는 인스턴스를 만들 수 없다.
 * => 문법
 *    abstract class 클래스명 {...}
 *
 * 추상 클래스?
 * - 서브클래스에게 공통 변수나 공통 메서드를 상속해주기 위해 만든 클래스.
 * - 직접 사용하지 못한다.
 * - 보통 generalization 과정에서 추출한 수퍼 클래스를 추상 클래스로 선언한다.   
 */
package step17.ex5;

public class Test01 {

  public static void main(String[] args) {
    // 자동차를 다루기 위해 객체를 준비한다.
    Tico car1 = new Tico();
    car1.run();
    
    Truck car2 = new Truck();
    car2.run();
    
    ElectCar car3 = new ElectCar();
    car3.run();
    
    
    // 추상 클래스를 인스턴스를 만들어 직접 사용할 수 없다!
    //Vehicle car4 = new Vehicle(); // 컴파일 오류!
    //car4.run();
    
    //Car car5 = new Car();
    //car5.run();
    

  }

}








