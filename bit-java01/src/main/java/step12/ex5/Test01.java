/* 다형성: 오버로딩(overloading) II
 * => 파라미터의 타입과 개수가 달라야지,
 *    리턴 타입이 다른 것은 오버로딩이 아니다.
 */

package step12.ex5;

public class Test01 {

  public static void main(String[] args) {
    A obj = new A();
    System.out.println(obj.plus(10));

  }

}
