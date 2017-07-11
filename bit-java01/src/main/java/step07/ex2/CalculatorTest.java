/* 클래스 문법의 용도: 유지보수 하기 좋게 관련된 메서드를 묶을 때
 * 1) 사용자 정의 데이터 타입을 만들 때
 *    예) class Score {...}
 * 2) 유지보수 하기 좋게 관련된 메서드를 묶을 때
 */
package step07.ex2;

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
     * 2단계: +, -, *, / 연산을 별도의 메서드로 분리하라!
     */
    
    float result = 0f; // 결과를 보관할 변수
    
    // 계산식: 2 + 3 - 6 * 2 + 7 / 2 = 2.5
    // 단 연산자 우선순위는 무시하고 앞에서 부터 계속 계산하라!
    
    result = plus(result, 2);
    result = plus(result, 3);
    result = minus(result, 6);
    result = multiple(result, 2);
    result = plus(result, 7);
    result = divide(result, 2);
    
    System.out.println(result);
    
  }

}





