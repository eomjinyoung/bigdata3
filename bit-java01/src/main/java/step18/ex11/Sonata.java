package step18.ex11;

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


