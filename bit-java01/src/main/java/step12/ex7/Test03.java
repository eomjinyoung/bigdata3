/* 다형성: 다형적 변수(polymorphic variable) III
 * => 레퍼런스는 하위 클래스의 인스턴스 주소도 저장할 수 있다.
 *    즉 요구하는 것 보다 더 많은 것을 포함하고 있다면 OK!
 * => 의미?
 *    기능을 대체하기가 쉽다.
 */

package step12.ex7;

public class Test03 {

  public static void main(String[] args) {
    // obj는 Object 뿐만 아니라 Object의 모든 기능을 포함하고 있는 자식 객체를 가리킬 수 있다.
    Object obj = new Car();
    
    // 컴파일러는 문법의 옳고 그름을 검사한다.
    // 그래서 obj에 Car 인스턴스가 들어 있다 할지라도,
    // obj에 무엇이 들어있는지는 고려대상이 아니다.
    // 그냥 문법 그대로 검사한다.
    //Car c = obj; // 컴파일 오류!
    
    // 개발자가 obj에 Car 인스턴스 주소가 들어 있다는 것을 확신하고,
    // 그 주소를 c 변수에 넣고 싶다면, 컴파일러에게 말하라!
    // obj에는 Car의 주소가 들어 있다고! => 형변환 문법을 이용한다.
    Car c = (Car)obj;
    // 컴파일러 왈:
    // - obj에 Car 인스턴스 주소가 들어 있다고? 알았어. 통과시킬게.
    // - 단 만약 실행할 때 obj에 Car 인스턴스 주소가 들어있지 않다면 오류가 발생할 것임을 알라!
    
    
    
  }

  
}






