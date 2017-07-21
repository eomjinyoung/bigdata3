package step17.ex5;

// Vehicle 클래스를 추상 클래스로 만들어 직접 인스턴스를 생성하지 못하도록 한다.
// 서브 클래스를 정의할 때 사용될 뿐이다.
public abstract class Vehicle {
  int capacity;
  
  public void breaking() {
    System.out.println("속도를 늦춘다.");
  }

  public void run() {
    System.out.println("움직인다!");
  }
  
  // 자동차는 시동을 거는 것과 끄는 것이 있다.
  // 그러나 운송 수단 자체는 그런 기능이 있어서는 안된다.
  // 어쩔 수 없이 서브 클래스의 공통점을 가져오다 보니 
  // 다음과 같이 start()와 stop()을 가지게 되었다.
  // 그래서 start()와 stop()을 기능을 정의해봐야 소용이 없기 때문에 
  // 그냥 메서드를 만들기만 하자!
  public void start() {}
  public void stop() {}
  
  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }
}