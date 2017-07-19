/* final의 사용법
 * 
 */
package step16;

import step16.other.MyClass3;

public class MySub3 extends MyClass3 {
  // final이 붙은 메서드는 오버라이딩 할 수 없다.
  /*
  public void m1() { 
    System.out.println("오호라... Hello!");
  }
  */
  
  // final 이 붙지 않은 메서드는 오버라이딩 할 수 있다.
  public void m2() {
    System.out.println("오호라... Hello2!");
  }
}
