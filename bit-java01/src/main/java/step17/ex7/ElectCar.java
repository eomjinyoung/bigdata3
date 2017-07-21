package step17.ex7;

public class ElectCar extends Vehicle {
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
