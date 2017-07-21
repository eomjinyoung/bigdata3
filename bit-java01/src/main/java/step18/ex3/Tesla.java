package step18.ex3;

// 수퍼 클래스를 Engine으로 바꾸면,
// 대신 Motor의 모든 코드를 이 클래스에서 다시 구현해야 한다.
// Motor와 똑 같은 코드를 재작성해야 하는 불편함이 있다.
public class Tesla extends Engine {
  int kwh;
  int capacity;
  int km;

  public void on() {
    System.out.println("전원을 넣는다.");
  }
  
  public void off() {
    System.out.println("전원을 끊는다.");
  }
  
  public void charge() {
    System.out.println("충전한다.");
  }
  
  public void run() {
    System.out.println("스르륵 간다.");
  }
  
  // Engine 클래스에서 상속 받은 start()와 stop()은 
  // 전기 자동차를 고려한 메서드가 아니다.
  // 따라서 이 클래스의 역할 맞게 오버라이딩 해야 한다.
  public void start() {
    // 기존에 있는 on() 메서드 호출
    on();
  }
  
  public void stop() {
    // 기존에 있는 off() 메서드 호출
    off();
  }
}











