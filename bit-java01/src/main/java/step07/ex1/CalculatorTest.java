/* 클래스 : 스태틱 메서드
 */
package step07.ex1;

public class CalculatorTest {

  static float plus(float a, float b) {
    return a + b;
  }
  
  static float minus(float a, float b) {
    return a - b;
  }
  
  static float multiple(float a, float b) {
    return a * b;
  }
  
  static float divide(float a, float b) {
    return a / b;
  }
  
  public static void main(String[] args) {
    /* 계산기 기능을 구현하면서 클래스 문법을 활용하는 방법을 익혀보자!
     * 1단계: +, -, *, / 연산을 수행하는 메서드를 사용하여 다음 계산을 수행하라
     */
    // 계산식: 2 + 3 - 6 * 2 + 7 / 2 = 2.5
    // 단 연산자 우선순위는 무시하고 앞에서 부터 계속 계산하라!
    
    // 계산 결과를 보관하기 위해 직접 로컬 변수를 준비한다.
    float result = 0f;
    
    result = plus(result, 2);
    result = plus(result, 3);
    result = minus(result, 6);
    result = multiple(result, 2);
    result = plus(result, 7);
    result = divide(result, 2);
    
    System.out.println(result);
    
  }

}





