/* 운송 수단의 데이터 다루기: version 5
 * => 요구사항
 *    - 전기차의 배터리 용량과 전력량을 저장할 수 있게 한다.
 * => 해결책
 *    1) 기존의 Vehicle 클래스를 변경하는 방법.
 *       - 이 방식의 문제는 기존 코드를 변경함으로써 기존에 작성했던 코드들이 영향을 받을 수 있다는 것이다.
 *       - 즉 이미 배포해서 버그를 수정해 잘 사용하고 있는 시스템에 기능을 추가하게 되면
 *         새로운 버그가 발생할 가능성이 높다.
 *    2) 새 클래스를 정의하는 방법.
 *       - 기존 코드에 영향을 끼치지 않기 때문에 시스템 안정성이 좋다.
 *       - 다만 기존 코드를 복사/붙여넣기 해야 한다는 점이 불편하다.
 *       - 새 데이터 타입으로 Vehicle 클래스의 기능을 포함한 ElectCar를 정의하여 사용한다. 
 */
package step11.ex1;

public class Test05 {

  public static void main(String[] args) {
    // 승용차의 운송 인원 저장하기 
    Car sedan = new Car();
    sedan.capacity = 5;
    sedan.fuelType = 1;
    sedan.liter = 60;
    
    // 승합차의 운송 인원 저장하기 
    Car bonggo = new Car();
    bonggo.capacity = 9;
    bonggo.fuelType = 2;
    bonggo.liter = 80;
    
    // 오토바이 운송 인원 저장하기
    Car bike = new Car();
    bike.capacity = 2;
    bike.fuelType = 1;
    bike.liter = 5;
    
    // 트럭의 운송 인원 저장하기
    Truck truck = new Truck();
    truck.capacity = 3;
    truck.fuelType = 2;
    truck.liter = 200;
    truck.ton = 10;
    
    // 덤프트럭의 운송 인원 저장하기
    Truck dumpTruck = new Truck();
    dumpTruck.capacity = 3;
    dumpTruck.fuelType = 2;
    dumpTruck.liter = 200;
    dumpTruck.ton = 20;
    dumpTruck.dump = true;
    
    // 전기차 운송 인원 저장하기
    ElectCar electCar = new ElectCar();
    electCar.capacity = 5;
    electCar.kwh = 18.5f;
    electCar.km = 128;
    
    // 자전거 운송 인원 저장하기
    Vehicle bicycle = new Vehicle();
    bicycle.capacity = 2;
  }

}









