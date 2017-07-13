/* 운송 수단의 데이터 다루기: version 1
 * => 요구사항
 *    - 운송 수단의 인원 정보를 다루고 싶다.
 * => 해결책
 *    - 새 데이터 타입으로 Vehicle 클래스를 정의하여 사용한다. 
 */
package step11.ex1;

public class Test01 {

  public static void main(String[] args) {
    // 승용차의 운송 인원 저장하기 
    Vehicle sedan = new Vehicle();
    sedan.capacity = 5;
    
    // 승합차의 운송 인원 저장하기 
    Vehicle bonggo = new Vehicle();
    bonggo.capacity = 9;
    
    // 오토바이 운송 인원 저장하기
    Vehicle bike = new Vehicle();
    bike.capacity = 2;
    
    // 트럭의 운송 인원 저장하기
    Vehicle truck = new Vehicle();
    truck.capacity = 3;
    
    // 덤프트럭의 운송 인원 저장하기
    Vehicle dumpTruck = new Vehicle();
    dumpTruck.capacity = 3;
    
    // 전기차 운송 인원 저장하기
    Vehicle elecCar = new Vehicle();
    elecCar.capacity = 5;
  }

}






