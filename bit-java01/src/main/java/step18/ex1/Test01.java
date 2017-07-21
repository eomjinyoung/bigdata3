package step18.ex1;

public class Test01 {

  public static void main(String[] args) {
    // 자동차 객체 준비
    Tico tico = new Tico();
    Truck truck = new Truck();
    
    // 자동차 시험소에서 자동차를 테스트한다.
    CarTester.test(tico);
    CarTester.test(truck);
    
  }

}
