/* 클래스 문법의 용도: 유지보수 하기 좋게 관련된 메서드를 묶을 때
 * 1) 사용자 정의 데이터 타입을 만들 때
 *    예) class Score {...}
 * 2) 유지보수 하기 좋게 관련된 메서드를 묶을 때
 */
package step07.ex4;

public class CalculatorTest {

  public static void main(String[] args) {
    /* 계산기 기능을 구현하면서 클래스 문법을 활용하는 방법을 익혀보자!
     * 3단계: 계산기 기능과 관련된 메서드를 별도의 클래스로 분리하라!
     */
    
    float result = 0f; // 결과를 보관할 변수
    
    // 계산식: 2 + 3 - 6 * 2 + 7 / 2 = 2.5
    // 단 연산자 우선순위는 무시하고 앞에서 부터 계속 계산하라!
    
    // 다른 클래스에 묶은 메서드를 호출할 때는
    // 메서드 이름 앞에 클래스 이름을 지정해야 한다.
    result = Calculator.plus(result, 2);
    result = Calculator.plus(result, 3);
    result = Calculator.minus(result, 6);
    result = Calculator.multiple(result, 2);
    result = Calculator.plus(result, 7);
    result = Calculator.divide(result, 2);
    
    System.out.println(result);
    
  }

}





