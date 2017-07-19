/* anonymous inner class
 * => 인스턴스를 딱 한 개만 만들어 사용할 경우 적합한 문법이다.
 * => 클래스를 정의하자마자 즉시 인스턴스를 생성한다.
 * => 문법
 *    new 부모클래스 또는 인터페이스 (생성자의 파라미터, ...) {
 *      익명클래스의 몸체 : 
 *        변수선언
 *        메서드 선언
 *    }
 * 
 */
package step15.ex5;

public class Test05_1 {
  public static void main(String[] args) {
    // anonymous(익명) inner class
    // => 클래스의 이름이 없기 때문에 클래스를 정의하는 동시에 인스턴스를 생성해야 한다.
    // => 클래스 이름이 없기 때문에 생성자를 만들 수 없다.
    // => 그래서 인스턴스를 만들 때 생성자를 호출할 수 없다.
    // => 그래서 익명 클래스에서 호출하는 생성자는 부모 클래스의 생성자이다.
    Object obj = new Object() {
      public String toString() {
        return "Hello";
      }
    };
    
    System.out.println(obj.toString());
    
  }
}
