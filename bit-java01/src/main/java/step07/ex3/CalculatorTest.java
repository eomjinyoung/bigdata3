/* 클래스 : 서로 관련된 기능을 수행하는 메서드와 변수를 별도의 클래스로 분리하기 
 * => 서로 관련된 기능을 적절하게 분리해 두면 유지보수가 쉬워진다.
 * => 클래스 문법의 용도 중 하나가,
 *    이렇게 관련된 기능을 유지보수 하기 쉽도록 별도의 그룹으로 묶어 놓기 위함이다.
 *    
 */
package step07.ex3;

public class CalculatorTest {


  public static void main(String[] args) {
    /* 계산기 기능을 구현하면서 클래스 문법을 활용하는 방법을 익혀보자!
     * 3단계: plus(), minus(), multiple(), divide()와 
     *       이 메서드들이 사용하는 result 변수를 별도의 클래스로 분리한다.
     */
    
    // 계산식: 2 + 3 - 6 * 2 + 7 / 2 = 2.5
    // 단 연산자 우선순위는 무시하고 앞에서 부터 계속 계산하라!
    
    // plus(), minus(), multiple(), divide()를 별도의 클래스로 묶어 두었기 때문에
    // 사용하려면 반드시 클래스 이름을 명시해야 한다.
    Calculator.plus(2);
    Calculator.plus(3);
    Calculator.minus(6);
    Calculator.multiple(2);
    Calculator.plus(7);
    Calculator.divide(2);
    
    System.out.println(Calculator.result);
    
  }

}





