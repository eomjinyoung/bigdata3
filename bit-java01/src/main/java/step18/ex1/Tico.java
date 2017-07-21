package step18.ex1;

public class Tico extends Car {
  public void start() {
    System.out.println("모터를 돌려 시동을 건다.");    
  }
  
  public void stop() {
    System.out.println("연료를 끊어 시동을 끈다.");
  }
  
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
