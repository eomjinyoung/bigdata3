/* 상속 : instanceof 연산자
 * => 레퍼런스에 저장된 주소가 특정 클래스의 타입과 같은지 비교하는 연산자.
 * => 상속 계층도
 *    Vehicle
 *      -> Motor
 *         -> Car
 *            -> Truck
 *      -> ElectCar
 */
package step11.ex8;

public class Test01 {

  public static void main(String[] args) {
    // obj는 다형적 변수이다.
    // 표현1)
    //   - obj는 Object의 인스턴스 주소를 저장할 수 있고,
    //     또한 그 자손 클래스의 인스턴스 주소도 저장할 수 있다.
    // 표현2)
    //   - Object 기능을 포함하는 모든 클래스의 인스턴스 주소를 저장할 수 있다.
    // 표현3)
    //   - Object 기능을 포함하는 모든 인스턴스를 가리킬 수 있다.
    // 
    // 예) 자동차 obj; <== obj가 가리킬 수 있는 것은? Car 기능을 포함하는 모든 객체를 가리킬 수 있다.
    // 예) 볼펜 obj; <== 볼펜 기능을 포함하는 모든 객체를 가리킬 수 있다.
    // 예) 컴퓨터 ojb; <== 컴퓨터 기능을 포함하는 모든 객체를 가리킬 수 있다.
    //Object obj = new Truck();
    Object obj = new Motor();
    
    // 어떤 레퍼런스에 들어있는 주소가 
    // 특정 클래스의 인스턴스이거나 그 클래스의 자손인지 알아보고 싶을 때 
    // instanceof 연산자를 사용하면 된다.
    if (obj instanceof Truck) System.out.println("obj은 Truck의 인스턴스이다.");
    if (obj instanceof Car) System.out.println("obj은 Car의 인스턴스이다.");
    if (obj instanceof Motor) System.out.println("obj은 Motor의 인스턴스이다.");
    if (obj instanceof Vehicle) System.out.println("obj은 Vehicle의 인스턴스이다.");
    if (obj instanceof ElectCar) System.out.println("obj은 ElectCar의 인스턴스이다.");
  }

}






