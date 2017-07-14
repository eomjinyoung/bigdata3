/* 다형성: 오버로딩(overloading)
 * => 파라미터의 타입과 개수가 다르더라도 
 *    같은 기능을 수행하는 메서드에 대해
 *    같은 이름을 부여함으로써 
 *    프로그래밍의 일관성을 유지하게 해주는 문법.
 */

package step12.ex4;

public class Test01 {

  public static void main(String[] args) {
    B obj = new B();
    
    System.out.println(obj.plus(10)); // plus(int)
    System.out.println(obj.plus(10, 20)); // plus(int, int)
    System.out.println(obj.plus("10", "20")); // plus(String, String)
    System.out.println(obj.plus(10.5f, 20)); // plus(float, float)

  }

}
