/* 상속(Inheritance): Motor 클래스 + 새 인스턴스 변수 = Car 클래스
 * => 요구사항
 *    - 연료 탱크의 크기 정보를 추가로 다루고 싶다.
 * => 해결책
 *    - 상속 기법을 이용하면 기존의 Motor 클래스를 손대지 않고 
 *      새 인스턴스 변수를 추가하여 새 데이터 타입을 정의할 수 있다.
 */
package step11.ex2;

public class Test03 {

  public static void main(String[] args) {
    // 승용차의 운송 인원 저장하기 
    // Car 인스턴스 생성
    // - Car의 수퍼 클래스인 Motor를 찾는다.
    // - 다시 Motor의 수퍼 클래스인 Vehicle 설계도를 찾는다.
    // - Vehicle 설계도에 따라 메모리를 준비한다.
    // - Motor 설계도에 따라 메모리를 덧 붙인다.
    // - Car 설계도에 따라 메모리를 덧 붙인다.
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
    Car truck = new Car();
    truck.capacity = 3;
    truck.fuelType = 2;
    truck.liter = 200;
    
    // 덤프트럭의 운송 인원 저장하기
    Car dumpTruck = new Car();
    dumpTruck.capacity = 3;
    dumpTruck.fuelType = 2;
    dumpTruck.liter = 200;
    
    // 전기차 운송 인원 저장하기
    Vehicle elecCar = new Vehicle();
    elecCar.capacity = 5;
    
    // 자전거 운송 인원 저장하기
    Vehicle bicycle = new Vehicle();
    bicycle.capacity = 2;
    
  }

}









