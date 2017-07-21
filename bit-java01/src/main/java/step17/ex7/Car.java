package step17.ex7;

// Car 클래스는 Vehicle을 상속 받아 운송 수단으로서 필요한 능력을 확보하고,
// 또한 자동수송 장치의 기능을 구현한다.
public abstract class Car extends Vehicle implements Auto {
  int fuelType; // 연료유형
  int liter; // 연료탱크 크기
  
  // Auto에 선언된 기능 중 일부 기능은 필요하다면 이 클래스에서 구현한다.
  // 나머지 기능은 서브 클래스에서 구현해야 할 것이다.
  public void stop() {
    System.out.println("연료를 차단하여 시동 끈다!");
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