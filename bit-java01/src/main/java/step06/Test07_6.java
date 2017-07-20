/* import 와 static 멤버
 * 
 */
package step06;

// 어떤 클래스의 스태틱 멤버를 사용할 것인 컴파일러에게 미리 일러두면,
// 스태틱 멤버를 사용할 때 마다 클래스이름을 명시해야 하는 불편함이 사라진다.
import static step06.MyClass.*;

public class Test07_6 {

  public static void main(String[] args) throws Exception {
    // 클래스 멤버(변수, 메서드)를 사용하려면 다음과 같이 항상 클래스 이름을 지정해야 한다.
    MyClass.m1();
    MyClass.m2();
    MyClass.m3();
    System.out.println("----------------------");
    
    // 그런데 import 문을 사용하여 클래스 멤버(즉 스태틱 멤버)를 미리 지정할 수 있다.
    // 그러면 다음과 같이 클래스 이름 없이 마치 자신의 메서드인양 사용할 수 있다.
    m1();
    m2();
    m3();
  }

}
