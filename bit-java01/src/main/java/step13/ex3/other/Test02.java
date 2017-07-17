/* 캡슐화 접근 제어
 * => private
 *    - 클래스의 멤버만 접근 가능
 * => (default)
 *    - modifier를 붙이지 않은 변수나 메서드.
 *    - 클래스 멤버 + 같은 패키지의 멤버
 * => protected
 *    - 클래스 멤버 + 같은 패키지의 멤버 + 자식 클래스
 * => public 
 *    - 모두 접근 가능 
 */
package step13.ex3.other;

public class Test02 {

  public static void main(String[] args) {
    // Test01 클래스는 MyClass와 같은 패키지에 있다.
    MyClass obj = new MyClass();
    //obj.v1 = 100; // private은 그 클래스의 멤버만 접근 가능하다!
    obj.v2 = 200; // (default)는 같은 패키지 멤버는 접근 가능하다. Test01은 MyClass와 같은 패키지 이다.
    obj.v3 = 300; // protected는 같은 패키지 또는 자식 클래스는 접근 가능.
                  // Test01은 MyClass의 자식 클래스는 아니지만 같은 패키지의 클래스이다.
    obj.v4 = 400; // public 모두 접근 가능
    

  }

}








