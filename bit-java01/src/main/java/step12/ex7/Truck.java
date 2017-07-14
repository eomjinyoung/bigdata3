package step12.ex7;

public class Truck extends Car {
  float ton; // 트럭의 적재량
  boolean dump; // 덤프 여부 

  void move() {
    System.out.println("짐을 싣고, 움직이다.");
  }
}
