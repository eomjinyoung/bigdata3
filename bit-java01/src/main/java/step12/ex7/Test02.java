/* 다형성: 다형적 변수(polymorphic variable) II
 * => 레퍼런스는 하위 클래스의 인스턴스 주소도 저장할 수 있다.
 *    즉 요구하는 것 보다 더 많은 것을 포함하고 있다면 OK!
 * => 의미?
 *    기능을 대체하기가 쉽다.
 */

package step12.ex7;

public class Test02 {

  public static void main(String[] args) {
    Car obj = null;
    
    // Truck은 Car의 자식 클래스이기 때문에, Car의 모든 기능을 갖고 있다.
    obj = new Truck();
    
    // 그러나 obj의 타입보다 작은 기능의 인스턴스는 가리킬 수 없다.
    // 만약 그것을 허락한다면, obj를 사용할 때 오류가 발생할 것이다.
    //obj = new Motor();
    
    
    // obj 레퍼런스를 사용할 때 그 범위는?
    // => obj가 Car 클래스의 변수이기 때문에 Car 클래스의 기능은 모두 사용할 수 있어야 한다.
    //    당연히 Car의 부모로부터 상속받은 기능도 모두 사용할 수 있어야 한다.
    // => 즉 obj를 통해 Car의 클래스 변수나 인스턴스 변수, 클래스 메서드, 인스턴스 메서드는
    //    모두 사용할 수 있어야 한다.
    obj.capacity = 100; // Car의 조부모인 Vehicle로부터 상속 받은 변수
    obj.fuelType = 1; // Car의 부모인 Motor로부터 상속 받은 변수
    obj.liter = 60; // Car의 변수 
    
    
  }

  
}






