package step17.ex4;

// Car와 ElectCar의 공통점(capacity)를 추출하여 일반적인 기능을 갖는 Vehicle 클래스를 만들고,
// Car와 ElectCar는 Vehicle의 서브 클래스로 선언한다.
public class Car extends Vehicle {
  int fuelType; // 연료유형
  int liter; // 연료탱크 크기
  
  public void start() {
    System.out.println("시동 건다!");
  }
  
  public void stop() {
    System.out.println("시동 끈다!");
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