/* 인터페이스
 * => 사용하는 객체와 사용되는 객체 사이의 호출 규칙을 정의한 것. 
 * => 클래스가 가져야할 기능을 선언하는데 사용한다.
 * => 예)
 *    - Car와 ElectCar는 start(), stop(), run() 기능을 반드시 갖춰야 한다.
 *    - 이것을 강제하려고 두 클래스의 수퍼 클래스인 Vehicle 클래스에 이 메서드를 선언하였다.
 *    - 그런데 의미상 Vehicle은 "운송수단"의 역할을 표현하는 클래스이다.
 *      자동차에게나 필요한 기능인 start(), stop(), run() 메서드를 가질 이유가 없다.
 *      하지만 서브 클래스에서 이런 메서드를 가지게 하려고 Vehicle 클래스에 이들 메서드를 정의한 것이다.
 *    - 현재 구조를 좀 더 관리하기 좋게 하는 방법으로 "인터페이스(interface)"를 사용하여 
 *      구조를 바꿔보자!
 * => 작업
 *    1) Vehicle 클래스는 원래의 의도대로 운송 수단으로서 필요한 변수나 메서드만 갖게 하자!
 *       즉 start(), stop(), run() 메서드를 제거하라!
 *    2) 자동으로 움직이는 운송 수단이라면, 반드시 가져야할 기능을 
 *       별도로 정의한다.
 *       즉 Auto 인터페이스를 만든다. 그 인터페이스에 기능을 선언한다.
 *    3) 운송 수단이면서 전기나 연료를 이용하여 자동으로 움직이는 장치에 대해서는
 *       Auto 기능을 구현하도록 강제한다.
 *       즉 Car와 ElectCar 클래스는 Auto 기능을 구현하도록 선언한다.
 */
package step17.ex7;

public class Test01 {

  public static void main(String[] args) {
    // 우리에게 자동차가 필요하다.
    // 그것이 내연기관 자동차든 아니면 전기 자동차든 
    // 자동으로 움직이는 자동차가 필요하다.
    
    Auto car1 = new Tico(); // Tico도 Auto의 기능을 갖고 있고,
    Auto car2 = new Truck(); // Truck도 Auto의 기능을 갖고 있고,
    Auto car3 = new ElectCar(); // ElectCar도 Auto의 기능을 갖고 있다.

    // Auto라면 start(), run(), stop() 기능을 수행할 수 있을 것이다.
    car1.start();
    car1.run();
    car1.stop();
    System.out.println("-----------------------------");
    
    car2.start();
    car2.run();
    car2.stop();
    System.out.println("-----------------------------");
    
    car3.start();
    car3.run();
    car3.stop();
  }

}








