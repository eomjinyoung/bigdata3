/* nested class와 상관 관계
 * => 자식 클래스를 통해 부모 클래스의 nested 클래스를 사용할 수 있다. 
 */
package step15.ex6;

public class Test01 {

  public static void main(String[] args) {
    // MyClass는 View의 nested class이다.
    View.MyClass obj = new View.MyClass();
    
    // Button은 View의 자식 클래스이다.
    // 그래서 Button을 통해 부모의 nested class를 사용할 수 있다.
    Button.MyClass obj2 = new Button.MyClass();
    
    // Button.MyClass는 View.MyClass와 같다.
    // 왜? Button은 View의 자식 클래스이기 때문이다.
    // 즉 Button을 통해 사용하는 MyClass는 결국 View의 MyClass이기 때문이다.
    Button.MyClass obj3 = new View.MyClass();

  }

}






