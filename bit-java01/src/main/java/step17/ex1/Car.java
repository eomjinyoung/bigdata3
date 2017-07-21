package step17.ex1;

// Vehicle에 기능을 덧붙여 더 특화된 역할을 수행한다.
// 그래서 "specialization"이라고 한다.
// => 서브 클래스는 항상 수퍼 클래스에 기능을 덧 붙이는 것이기 때문에
//    더 특화된 일을 수행한다.
public class Car extends Vehicle {
  int fuelType;
  int liter;
}
