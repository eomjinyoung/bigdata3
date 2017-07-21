package step17.ex5;

// generalization(일반화)
// => Truck과 Tico의 공통점(capacity, fuelType, liter)를 추출하여 
//    별도의 Car 클래스로 만든 다음, Car 클래스를 상속 받는다.
// => Car는 Truck과 Tico의 일반적인 기능을 담고 있다.
public class Truck extends Car {
  float weight;
  boolean dump;
  
  // 수퍼 클래스로부터 상속 받은 run()을 
  // 트럭에 맞게 재정의한다. => overriding
  public void run() {
    System.out.println("덜그덕 덜그덕 달린다.");
  }
  
  //상속 받은 start()를 디젤차에 맞게 재정의 한다. => overring
  public void start() {
    System.out.println("연료를 분사한다.");
    System.out.println("압력으로 폴발시킨다.");
  }
  
  public void dumpUp() {
    System.out.println("덤프를 올린다.");
  }
  
  public void dumpDown() {
    System.out.println("덤프를 내린다!");
  }
}
