package step17.ex7;

// Vehicle 클래스를 추상 클래스로 만들어 직접 인스턴스를 생성하지 못하도록 한다.
// 서브 클래스를 정의할 때 사용될 뿐이다.
public abstract class Vehicle {
  int capacity;
  
  // 서브 클래스에서 오버라이딩 할 수도 있고, 그대로 사용할 수도 있는 메서드는 일반 메서드로 만들라!
  public void breaking() {
    System.out.println("속도를 늦춘다.");
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }
}