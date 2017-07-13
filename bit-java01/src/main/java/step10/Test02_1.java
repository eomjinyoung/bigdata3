/* 인스턴스 멤버 : 생성자(constructor)
 * => 인스턴스를 생성한 후 자동으로 호출되는 메서드이다.
 *    단 인스턴스 블록을 먼저 실행한 후에 생성자가 호출된다.
 * => 생성자를 정의하는 문법
 *    - 생성자는 일반 메서드에 달리 다음의 규칙에 따라 만들어야 한다.
 *    [리턴타입을 선언하지 않는다] 클래스명(파라미터,...) {...}
 * => 인스턴스 블록은 여러 개 만들 수 있고, 인스턴스를 생성한 후 순서대로 모두 실행한다.
 *    생성자도 여러 개 만들 수 있지만, 그 중 한 개만 호출할 수 있다.
 * => 생성자를 호출하는 문법
 *    new 클래스명(아규먼트,...);
 *    
 *    즉, 아규먼트 값으로 무엇을 주는냐에 따라 호출될 생성자가 결정된다.
 */
package step10;

class MyClass4 {
  String name;
  int age;
  
  MyClass4() {
    System.out.println("생성자 호출됨!");
  }
}

public class Test02_1 {
  public static void main(String[] args) {
    new MyClass4();
    new MyClass4();
    new MyClass4();
    
  }
}










