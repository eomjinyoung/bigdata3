package step17.ex7;

public class Tico extends Car {
  boolean sunroof; // 썬루프 여부
  boolean autoTrans; // 자동변속장치 여부
  
  public void openSunroof() {
    System.out.println("썬루프를 연다!");
  }
  
  public void closeSunroof() {
    System.out.println("썬루프를 닫는다.");
  }
  
  // Car는 Auto의 기능을 구현하겠다고 선언했고, 그 중 stop()을 구현했다.
  // 나머지 start()와 run()은 이 클래스에서 구현해야 한다.
  // 구현하지 않으면 추상 메서드로 남아 있기 때문에 이 클래스는 일반 클래스가 될 수 없다.
  public void run() {
    System.out.println("속도가 높으면 기어를 올리고 속도가 낮으면 기어를 낮춘다.");
    System.out.println("쌩쌩 달린다.");
  }
  
  public void start() {
    System.out.println("연료를 분사한다.");
    System.out.println("점화플러그에 전기를 흘려 연료에 불을 붙인다.");
  }
  
}







