package step18.ex4;

//Tesla는 Motor로 만들었다.
//또한 Car 규칙에 따라 세 개의 기능(start(), stop(), run())을 갖고 있다.
public class Tesla extends Motor implements Car {
  int capacity;
  int km;
  
  public void start() {
    // Motor의 기능을 이용하여 start()를 구현한다.
    this.on();
  }
  
  public void stop() {
    // Motor의 기능을 이용하여 stop()을 구현한다.
    this.off();
  }
  
  public void run() {
    System.out.println("스르륵 간다.");
  }
}
