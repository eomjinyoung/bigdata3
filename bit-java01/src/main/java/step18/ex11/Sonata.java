package step18.ex11;

// 새로 추가하는 자동차는 변경한 Car 규칙에 따라 만들면 된다.
// 문제는 기존 자동차이다.
public class Sonata extends Engine implements Car {
  
  int kwh;
  int km;
  boolean light;
  boolean enableEngine;
  
  public void lightOn() {
    this.light = true;
  }
  
  public void lightOff() {
    this.light = false;
  }

  public void run() {
    if (km < 10) {
      this.enableEngine = true;
    }
  
    if (enableEngine) {
      System.out.println("엔진으로 간다!");
    } else {
      System.out.println("모터로 간다!");
    }
    
  }

}


