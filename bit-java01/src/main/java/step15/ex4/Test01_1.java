/* local class
 * => 메서드 안에 선언된 중첩 클래스.
 * => 특정 메서드에서만 사용되는 클래스는 그 메서드 안에 선언하는 것이 
 *    유지보수에 좋다.
 * => 로컬 변수처럼 메서드에 안에 선언되었기 때문에
 *    private, protected, (default), public 으로 접근을 제어할 수 없다.
 * => 사용되는 범위가 좁을 경우, 그 만큼 사용 범위를 문법적으로 제약하는 것이 유지보수에 좋다.
 *    즉 객체 지향 프로그래밍을 할 때 가능한 
 *    코드의 사용 범위를 가능한 제한하여 폐쇄적으로 관리(encapsulation)하는 것이 유지보수에 좋다.
 *    그런 후 사용 범위에 따라 그 제한을 풀어주는 방식으로 코딩하라!
 *    코드의 사용 범위를 공개하면 할 수록 외부로부터 영향을 더 많이 받게 된다.
 *     
 */
package step15.ex4;

public class Test01_1 {
  public static void main(String[] args) {
    // local class 
    class MyClass {
      
    }
  }
}
