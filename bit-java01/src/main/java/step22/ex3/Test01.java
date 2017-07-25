/* 예외 처리 문법 사용 전
 * => 메서드의 리턴 값으로 예외 상황을 알리고 받아야 한다.
 */
package step22.ex3;

public class Test01 {

  public static void main(String[] args) {
    System.out.println(Calculator.plus(10, 20));
    System.out.println(Calculator.minus(10, 20));
    System.out.println(Calculator.multiple(10, 20));
    System.out.println(Calculator.divide(20, 10));
    
    // 만약 0으로 나눈다면
    System.out.println(Calculator.divide(20, 0));

  }

}
