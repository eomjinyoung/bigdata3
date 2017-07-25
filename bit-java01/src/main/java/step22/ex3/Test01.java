/* 예외 처리 문법 사용 전
 * => 메서드의 리턴 값으로 예외 상황을 알리고 받아야 한다.
 */
package step22.ex3;

public class Test01 {

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    calc.plus(10);
    calc.minus(2);
    calc.multiple(3);
    calc.divide(0);
    
    System.out.println(calc.result);

  }

}
