package step17.ex7;

// 자동차라면 반드시 가져야 할 기능을 선언한다.
public interface Auto {
  // 기능을 선언하기 때문에 구현해서는 안된다.
  // 즉 추상 메서드만 선언할 수 있다.
  void start();
  void stop();
  void run();
  
  // 일반 메서드는 선언할 수 없다.
  //void breaking() {} // 컴파일 오류!
}
