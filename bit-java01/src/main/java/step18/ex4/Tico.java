package step18.ex4;

// Tico는 Engine으로 만들었다.
// 또한 Car 규칙에 따라 세 개의 기능(start(), stop(), run())을 갖고 있다.
public class Tico extends Engine implements Car {
  // Engine 클래스에서 Car의 두 개 메서드를 미리 구현하는 바람에 
  // Tico에서는 run() 만 구현하면 된다. 
  public void run() {
    System.out.println("사방사방 달린다.");
  }
  
  public void openSunroof() {
    System.out.println("썬루프를 연다.");
  }
  
  public void closeSunroot() {
    System.out.println("썬루프를 닫는다.");
  }
}
