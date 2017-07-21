package step18.ex4;

//Truck은 Engine으로 만들었다.
//또한 Car 규칙에 따라 세 개의 기능(start(), stop(), run())을 갖고 있다.
public class Truck extends Engine implements Car {
  
  // Engine 클래스에서 Car의 두 개 메서드를 미리 구현하는 바람에 
  // Truck에서는 run() 만 구현하면 된다.
  public void run() {
    System.out.println("덜그럭 덜그럭 달린다.");
  }
  
  public void dumpUp() {
    System.out.println("덤프를 올린다.");
  }
  
  public void dumpDown() {
    System.out.println("덤프를 내린다.");
  }
}
