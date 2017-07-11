/* 클래스 : 클래스 변수(class variable)
 * => 클래스의 모든 메서드에서 공유하는 변수
 * => 클래스 블록 안에 직접 변수를 선언한다.
 *    그리고 변수 선언 앞에 static을 붙인다.
 * => 클래스가 로딩될 때 Method Area라는 메모리 영역에 만들어지는 변수이다.
 *    JVM이 종료될 때까지 유지된다.
 *     
 */
package step07.ex2;

public class CalculatorTest {

  static float result = 0f; 

  // 계산 결과는 result라는 클래스 변수에 저장하면 되기 때문에
  // 계산 결과를 리턴할 필요가 없다.
  // 그리고 파라미터로 계산할 값만 받으면 된다.
  static void plus(float b) {
    result += b; // result = result + b;
  }
  
  static void minus(float b) {
    result -= b; // result = result - b;
  }
  
  static void multiple(float b) {
    result *= b; // result = result * b;
  }
  
  static void divide(float b) {
    result /= b; // result = result / b;
  }
  
  public static void main(String[] args) {
    /* 계산기 기능을 구현하면서 클래스 문법을 활용하는 방법을 익혀보자!
     * 2단계: plus(), minus(), multiple(), divide()의 계산 결과를 저장할 변수를 
     *       모든 메서드에서 직접 이용할 수 있도록 "클래스 변수(class variable)"로 만들어라!
     *       main() 메서드의 로컬 변수로 저장하는 것 보다 관리하기 편하다!
     */
    
    
    // 계산식: 2 + 3 - 6 * 2 + 7 / 2 = 2.5
    // 단 연산자 우선순위는 무시하고 앞에서 부터 계속 계산하라!
    
    plus(2);
    plus(3);
    minus(6);
    multiple(2);
    plus(7);
    divide(2);
    
    System.out.println(result);
    
  }

}





