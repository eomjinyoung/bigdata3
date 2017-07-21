package step17.ex7;

// ElectCar 클래스도 운송 수단(Vehicle)이면서 자동으로 움직이는 장치(Auto)임을 선언한다.
// Auto에 선언된 세 개의 메서드를 모두 구현했다.
// 그래서 ElectCar도 자동차라 볼 수 있다.
public class ElectCar extends Vehicle implements Auto {
  int kwh;
  float km;
  
  public void start() {
    System.out.println("전원을 넣는다.");
  }
  
  public void stop() {
    System.out.println("전원을 끊는다.");
  }
  
  public void run() {
    System.out.println("모터를 돌려서 달린다!");
  }
}
