/* 클래스 문법의 용도: 유지보수 하기 좋게 관련된 메서드를 묶을 때
 * 1) 사용자 정의 데이터 타입을 만들 때
 *    예) class Score {...}
 * 2) 유지보수 하기 좋게 관련된 메서드를 묶을 때
 */
package step07.ex4;

public class CalculatorTest {

  public static void main(String[] args) {
    /* 계산기 기능을 구현하면서 클래스 문법을 활용하는 방법을 익혀보자!
     * 4단계: 계산기 기능과 관련된 메서드들이 사용하는 변수(예: result 변수)도
     *       그 메서드가 있는 클래스에 두는 것이 유지보수에 좋다.
     */
    
    // 계산식: 2 + 3 - 6 * 2 + 7 / 2 = 2.5
    // 단 연산자 우선순위는 무시하고 앞에서 부터 계속 계산하라!
    
    // 이제 계산 결과는 Calculator 클래스에 보관되기 때문에 
    // 여기에서는 따로 계산 결과를 관리할 필요가 없다.
    // 코드 관리가 쉬워진다.
    Calculator.plus(2);
    Calculator.plus(3);
    Calculator.minus(6);
    Calculator.multiple(2);
    Calculator.plus(7);
    Calculator.divide(2);
    
    System.out.println(Calculator.result);
    
  }

}





