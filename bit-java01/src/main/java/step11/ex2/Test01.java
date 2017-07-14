/* 상속
 * => 기존에 작성된 코드를 재활용하여 기능을 확장시키는 문법이다.
 * => 기존의 소스 코드는 필요 없다. 
 *    .class 파일만 있으면 된다.
 *    즉 기존 코드를 손대지 않고 기능을 확장하기 때문에
 *    기존 시스템의 안정성을 크게 해치지 않는다.
 * => 기존 코드에 새 기능을 덧붙이기 때문에 기능확장이 쉽다.
 * => 상속어 깊어 질 수록 점점 더 기능이 불어나는 문제는 있다. 
 *    이런 문제는 상속 대신 특별한 설계 기법을 통해 해결하면 된다.
 * => 종류
 *    1) specialization
 *       - 기존 코드를 상속 받아 기능을 덧 붙이는 방법.
 *    2) generalization 
 *       - 여러 클래스에 중복된 기능을 찾아서 별도의 클래스로 묶은 다음, 상속 받는 방법. 
 *       
 * => 문법
 *    class 새클래스 extends 기존클래스 {...}
 */
package step11.ex2;

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






