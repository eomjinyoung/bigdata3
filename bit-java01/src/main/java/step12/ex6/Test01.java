/* 다형성: 다형적 변수(polymorphic variable)
 * => 레퍼런스는 하위 클래스의 인스턴스 주소도 저장할 수 있다.
 *    즉 요구하는 것 보다 더 많은 것을 포함하고 있다면 OK!
 * => 의미?
 *    기능을 대체하기가 쉽다.
 */

package step12.ex6;

public class Test01 {

  public static void main(String[] args) {
    // 기능 대체의 예1) 나는 탈 것이 필요하다.
    Vehicle obj;
    obj = new Vehicle();
    obj = new Motor();
    obj = new Car();
    obj = new ElectCar();
    obj = new Truck();
    
    System.out.println(obj.capacity);
    
    
    // 기능 대체의 예2) 나는 연료탱크 정보가 있는 자동차가 필요하다.
    Car obj2;
    //obj2 = new Vehicle(); //컴파일오류! Vehicle은 Car 보다 기능이 적다. 왜? 수퍼 클래스이기 때문에.
    //obj2 = new Motor(); //컴파일오류! Motor는 Car 보다 기능이 적다. 왜? 수퍼 클래스이기 때문에.
    obj2 = new Car();
    obj2 = new Truck();
    //obj2 = new ElectCar(); //컴파일오류! ElectCar는 Car와 다른 종류이다.
    
    // 왜 수퍼 클래스의 인스턴스 주소를 담으면 안되는가?
    Truck obj3 = new Vehicle(); // 이 인스턴스는 capacity 변수만 있다.
    // 그런데 obj3 변수는 Truck의 레퍼런스이다.
    // Truck의 레퍼런스이니 Truck의 기능을 모두 사용하려 할 것이다.
    System.out.println(obj3.capacity);
    
    // 만약 obj3에 Vehicle 인스턴스 주소를 담을 수 있다면, 다음과 같이
    // Vehicle 인스턴스에 없는 변수를 사용할 때는 어떻게 할 것인가?
    // 그래서 자바는 처음부터 이런 경우가 발생하지 않도록 
    // 레퍼런스의 기능보다 작은 기능을 가진 수퍼 클래스의 인스턴스를 허락하지 않는다.
    System.out.println(obj3.fuelType);
    System.out.println(obj3.liter);
    System.out.println(obj3.ton);
    System.out.println(obj3.dump);
    

  }

}
