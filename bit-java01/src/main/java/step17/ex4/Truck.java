package step17.ex4;

// generalization(일반화)
// => Truck과 Tico의 공통점(capacity, fuelType, liter)를 추출하여 
//    별도의 Car 클래스로 만든 다음, Car 클래스를 상속 받는다.
// => Car는 Truck과 Tico의 일반적인 기능을 담고 있다.
public class Truck extends Car {
  float weight;
  boolean dump;
}
