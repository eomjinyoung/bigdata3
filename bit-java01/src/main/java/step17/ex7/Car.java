package step17.ex7;

// Car 클래스에 abstract를 붙이면 추상 클래스가 된다.
// 추상 클래스는 직접 인스턴스를 생성할 수 없다.
// 단지 서브 클래스를 만들 때 수퍼 클래스로 사용할 뿐이다.
public abstract class Car extends Vehicle {
  int fuelType; // 연료유형
  int liter; // 연료탱크 크기
  
  // 수퍼 클래스로부터 상속 받은 추상 메서드 중에서 
  // 수퍼 클래스가 구현해도 되는 메서드는 여기 구현한다.
  public void stop() {
    System.out.println("연료를 차단하여 시동 끈다!");
  }
  
  // 그러나 서브 클래스에서 구현되도록 강제하고 싶담면,
  // 여기서 구현하지 말라!
  // start()와 run()은 구현하지 말고 그냥 둬라!
  // 이렇게 서브 클래스에서 상속 받은 추상 클래스를 구현하지 않으면
  // 계속 추상 메서드가 된다.
  
  
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