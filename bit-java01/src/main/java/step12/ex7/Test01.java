/* 다형성: 다형적 변수(polymorphic variable)
 * => 레퍼런스는 하위 클래스의 인스턴스 주소도 저장할 수 있다.
 *    즉 요구하는 것 보다 더 많은 것을 포함하고 있다면 OK!
 * => 의미?
 *    기능을 대체하기가 쉽다.
 */

package step12.ex7;

public class Test01 {

  public static void main(String[] args) {
    // 다형적 변수를 사용하여 기능 대체를 쉽게 하는 예:
    //go(new Vehicle());
    //go(new Car());
    //go(new Truck());
    go(new ElectCar());
  }

  static void go(Vehicle obj) {
    obj.move(); // obj에 대해 move() 호출할 때, 
                // 실제로 obj 파라미터에 넘겨준 객체를 조사하여
                // 만약 그 클래스가 move()를 오버라이딩 하였다면 
                // 그 오버라이딩 한 메서드를 호출한다.
  }
  
  
}






