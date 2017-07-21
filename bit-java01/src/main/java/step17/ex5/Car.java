package step17.ex5;

// Car 클래스에 abstract를 붙이면 추상 클래스가 된다.
// 추상 클래스는 직접 인스턴스를 생성할 수 없다.
// 단지 서브 클래스를 만들 때 수퍼 클래스로 사용할 뿐이다.
public abstract class Car extends Vehicle {
  int fuelType; // 연료유형
  int liter; // 연료탱크 크기
  
  public void start() {
    System.out.println("시동 건다!");
  }
  
  public void stop() {
    System.out.println("연료를 차단하여 시동 끈다!");
  }
  
  public void run() {
    System.out.println("달린다!");
  }
  
  public int getFuelType() {
    return fuelType;
  }
  public void setFuelType(int fuelType) {
    this.fuelType = fuelType;
  }
  public int getLiter() {
    return liter;
  }
  public void setLiter(int liter) {
    this.liter = liter;
  }
  
  
}