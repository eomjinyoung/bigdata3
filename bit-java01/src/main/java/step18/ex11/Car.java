package step18.ex11;

public interface Car {
  // 기존 규칙
  void start();
  void run();
  void stop();
  
  // 새 규칙(Java 8 이상)
  // => 이 인터페이스를 구현한 기존 클래스에는 영향을 주지 않기 위해 
  //    새로 추가하는 메서드는 구현한다.
  //    메서드 앞에 default를 붙인다.
  // => 이제 기존 클래스들도 아래 메서드를 갖게 된다.
  //    물론 직접 구현하지 않았지만, 다음과 같이 구현된 메서드를 갖게 된다.
  // => 즉 규칙을 바꾸면 그 규칙에 따라 만든 모든 클래스를 변경해야 하는 부담을 없애준다.
  default void lightOn() {}
  default void lightOff() {}
  
  // 참고! 
  // 클래스처럼 인터페이스도 스태틱 메서드를 가질 수 있다. (Java 8 이상)
  static String version() {
    return "Car ver-1.1";
  }
}










