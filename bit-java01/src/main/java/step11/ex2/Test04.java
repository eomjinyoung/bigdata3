/* 상속(Inheritance): Car 클래스 + 새 인스턴스 변수 = Truck 클래스
 * => 요구사항
 *    - 트럭인 경우 톤 정보를 추가로 저장할 수 있게 한다.
 *    - 덤프 트럭인 일반 트럭인지 여부도 저장할 수 있게 한다.
 * => 해결책
 *    - 상속 기법을 이용하면 기존의 Car 클래스를 손대지 않고 
 *      새 인스턴스 변수를 추가하여 새 데이터 타입을 정의할 수 있다.
 */
package step11.ex2;

public class Test04 {

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
    Vehicle elecCar = new Vehicle();
    elecCar.capacity = 5;
    
    // 자전거 운송 인원 저장하기
    Vehicle bicycle = new Vehicle();
    bicycle.capacity = 2;
  }

}









