package step17.ex6;

public class Tico extends Car {
  boolean sunroof; // 썬루프 여부
  boolean autoTrans; // 자동변속장치 여부
  
  public void openSunroof() {
    System.out.println("썬루프를 연다!");
  }
  
  public void closeSunroof() {
    System.out.println("썬루프를 닫는다.");
  }
  
  // Car에서 상속 받은 추상 메서드를 이 클래스의 역할에 맞게 구현한다.
  // => 추상 메서드가 단 한개라도 있으면 일반 클래스가 될 수 없다.
  // => 오직 추상 클래스만이 추상 메서드를 가질 수 있다.
  // => 이건 당연하다. 메서드가 구현되지 않았는데 일반 클래스처럼 인스턴스를 만들 수 있다면,
  //    그 인스턴스를 통해 구현되지 않은 추상 메서드를 호출하려 할 것 아닌가!
  //    그래서 일반 클래스는 추상 메서드를 가질 수 없다.
  public void run() {
    System.out.println("속도가 높으면 기어를 올리고 속도가 낮으면 기어를 낮춘다.");
    System.out.println("쌩쌩 달린다.");
  }
  
  public void start() {
    System.out.println("연료를 분사한다.");
    System.out.println("점화플러그에 전기를 흘려 연료에 불을 붙인다.");
  }
}







