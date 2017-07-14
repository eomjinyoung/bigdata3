/* 상속 : 인스턴스 생성
 * => 수퍼 클래스의 인스턴스 변수도 함께 생성한다.
 * => 수퍼 클래스의 메서드를 사용할 수 있다.
 */
package step11.ex4;

public class Test01 {

  public static void main(String[] args) {
    A obj1 = new A();
    obj1.v1 = 100;
    obj1.m1();
    
    System.out.println("-------------------------");
    
    B obj2 = new B();
    obj2.v1 = 200; // B의 인스턴스를 만들 때, A의 설계도도 참고하여 변수를 생성했기 때문에 v1을 사용할 수 있다.
    obj2.v2 = 300;
    obj2.m1(); // B는 수퍼 클래스 A에 정의된 메서드를 사용할 수 있다. 
    obj2.m2();

  }

}
