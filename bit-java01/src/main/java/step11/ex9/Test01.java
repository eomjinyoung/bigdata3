/* 다형성 : 오버라이딩(overriding) 적용 후
 * => 오버라이딩은 다형성(polymorphism)의 특징 중 하나이다.
 * => 의미
 *    - 상속 받은 메서드를 서브클래스의 역할에 맞게끔 재정의하는 것. 
 * => 문법
 *    - 상속 받은 메서드와 이름과 파라미터, 리턴 타입이 같아야 한다.
 * => 오버라이딩이 없다면, 
 *    서브 클래스에서 같은 기능을 수행하는 메서드를 만들 때 마다 이름을 달리해야 한다.    
 */
package step11.ex9;

public class Test01 /* extends Object */{

  public static void main(String[] args) {
    B obj = new B(); 
    obj.v1 = 100;
    obj.v2 = 200;
    
    // B 클래스에서 A 클래스와 똑 같은 이름과 형식을 가진 메서드가 있다.
    // 그래서 일관된 방식으로 메서드를 호출할 수 있어서 유지보수에 좋다.
    obj.print(); // B 클래스에 재정의한 print() 호출!
    
  }

}







