/* 문자열
 * => 여러 개의 유니코드 문자를 가리킨다.
 *    물론 한 개의 문자를 문자열로 표현할 수 있다.
 */
package step01;

public class Test06_1 {
  public static void main(String[] args) {
    System.out.println('A'); // 문자
    System.out.println("A"); // 단 한 개의 문자라도 이 경우는 문자열이 된다.
    // 즉 큰 따옴표를 사용하여 문자를 표현하면 문자열이 된다.

    // 보통 문자열은 여러 개의 문자로 구성된다.
    System.out.println("Hello");

    // 문자열 중간에 이스케이프 문자를 넣을 수 있다.
    System.out.println("Hello\nworld!");


  }

}
 