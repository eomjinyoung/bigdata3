/* 인터페이스 : 문법
 * - 호출자와 피호출자 사이의 사용 규칙을 정의한 것이다.
 * - 피호출자를 사용할 때 호출할 메서드를 선언한다.
 * - 규칙이기 때문에 추상 메서드만 가능하다.
 * - 규칙에 따라 클래스에서 그 메서드를 구현한다.
 */
package step18.ex5;

public class Test01 {
  
  public static void main(String[] args) {
    // 인터페이스 레퍼런스 변수는 그 인터페이스를 구현한 클래스의 객체를 가리킬 수 있다.
    A obj;
    
    //obj = new A(); // 인터페이스는 객체를 만들 수 없다! 컴파일 오류!
    obj = new Concrete(); // Concrete는 A 인터페이스를 구현하였다. OK!
    //obj = new Concrete2(); // Concrete2는 추상 클래스이다. 인스턴스를 생성할 수 없다. 컴파일 오류!
    obj = new Concrete3(); // Concrete3도 A 인터페이스를 구현하였다. OK!
    
    obj = new ChildConcrete(); // 당연히 자식 클래스의 객체도 가리킬 수 있다. OK!
  }

}








