/* 상속(Inheritance): Vehicle 클래스 + 새 인스턴스 변수 = Motor 클래스
 * => 요구사항
 *    - 운송 인원 정보 뿐만 아니라 운송 수단의 연료 종류를 다루고 싶다.
 * => 해결책
 *    - 상속 기법을 이용하면 기존의 Vehicle 클래스를 손대지 않고 새 인스턴스 변수를 덧 붙일 수 있다.
 * 
 * => 서브 클래스의 인스턴스 생성
 *    - 수퍼 클래스의 설계도를 참조하여 수퍼 클래스에 선언된 메모리를 먼저 만든다.
 *    - 그리고 서브 클래스의 설계도에 따라 메모리를 추가해서 만든다.
 *    - 예)
 *      new Motor();
 *      - Motor의 수퍼 클래스인 Vehicle 클래스 설계도에 따라 메모리를 만들고,
 *      - Motor 클래스의 설계도에 따라 메모리를 추가한다.
 *      - 그래서 Motor 인스턴스에는 Vehicle의 인스턴스 변수와 Motor의 인스턴스 변수가 모두 들어 있다.
 *     
 */
package step11.ex2;

public class Test02 {

  public static void main(String[] args) {
    // 승용차의 운송 인원 저장하기 
    Motor sedan = new Motor();
    sedan.capacity = 5;
    sedan.fuelType = 1;
    
    // 승합차의 운송 인원 저장하기 
    Motor bonggo = new Motor();
    bonggo.capacity = 9;
    bonggo.fuelType = 2;
    
    // 오토바이 운송 인원 저장하기
    Motor bike = new Motor();
    bike.capacity = 2;
    bike.fuelType = 1;
    
    // 트럭의 운송 인원 저장하기
    Motor truck = new Motor();
    truck.capacity = 3;
    truck.fuelType = 2;
    
    // 덤프트럭의 운송 인원 저장하기
    Motor dumpTruck = new Motor();
    dumpTruck.capacity = 3;
    dumpTruck.fuelType = 2;
    
    // 전기차 운송 인원 저장하기
    Vehicle elecCar = new Vehicle();
    elecCar.capacity = 5;
    
    // 자전거 운송 인원 저장하기
    Vehicle bicycle = new Vehicle();
    bicycle.capacity = 2;
  }

}









