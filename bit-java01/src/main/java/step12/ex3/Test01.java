/* 다형성 : 오버라이딩(overriding)과 super 명령어    
 * => this.메서드()
 *    - 현재 클래스부터 최상위 클래스까지 호출할 메서드를 찾아 올라간다. 
 * => super.메서드()
 *    - 수퍼 클래스부터 최상위 클래스까지 호출할 메서드를 찾아 올라간다.
 */
package step12.ex3;

public class Test01 /* extends Object */{

  public static void main(String[] args) {
    C obj = new C(); 
    obj.test();
  }

}







