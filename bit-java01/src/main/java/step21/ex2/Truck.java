package step21.ex2;

public class Truck extends Engine {
  
  @Override
  public String toString() {
    return "Truck [capacity=" + capacity + ", fuelType=" + fuelType + ", liter=" + liter + "]";
  }

  public void run() {
    System.out.println("덜그럭 덜그럭 달린다.");
  }
  
  public void dumpUp() {
    System.out.println("덤프를 올린다.");
  }
  
  public void dumpDown() {
    System.out.println("덤프를 내린다.");
  }
  
  // 다음 메서드는 Class 도구를 이용하여 메서드를 추출할 때
  // 어떤 접근 범위의 메서드까지 추출 되는지 알아보기 위해 임의로 만든 메서드이다.
  // 큰 의미가 없으니, 고민하지 마시길...
  private void printSpeed() {
    System.out.println("빠릅니다.");
  }
  
  protected void speedUp() {
    System.out.println("속도를 높힌다.");
  }
  
  protected void speedDown() {
    System.out.println("속도를 낮춘다.");
  }
  
  String getCarInfo() {
    return "비트덤프트럭";
  }
  
}







