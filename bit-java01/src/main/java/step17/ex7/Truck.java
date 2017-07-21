package step17.ex7;

// Truck은 Car 클래스를 상속 받고, 트럭으로서 필요한 변수나 메서드를 추가한다.
// 또한 Car가 미처 구현하지 않은 start()와 run()도 마저 구현해야 한다.
public class Truck extends Car {
  float weight;
  boolean dump;
  
  // Car는 자동으로 움직이는 운송 수단임을 선언하기 위해 Auto를 구현한다고 했다.
  // 그런 후 Auto의 3개 기능 중에서 한 개 기능인 stop()을 구현했다.
  // 그렇다면 Truck에서는 나머지 두 개 기능을 구현해야 한다.
  public void run() {
    System.out.println("덜그덕 덜그덕 달린다.");
  }
  
  public void start() {
    System.out.println("연료를 분사한다.");
    System.out.println("압력으로 폴발시킨다.");
  }
  
  public void dumpUp() {
    System.out.println("덤프를 올린다.");
  }
  
  public void dumpDown() {
    System.out.println("덤프를 내린다!");
  }
}
