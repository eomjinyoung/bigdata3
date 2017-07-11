/* 클래스 : 클래스 변수(class variable)
 * => 클래스의 모든 메서드에서 공유하는 변수
 * => 클래스 블록 안에 직접 변수를 선언한다.
 *    그리고 변수 선언 앞에 static을 붙인다.
 *    그래서 "클래스 변수"를 "스태틱 변수"라고도 부른다.
 * => 클래스가 로딩될 때 Method Area라는 메모리 영역에 만들어지는 변수이다.
 *    JVM이 종료될 때까지 유지된다.
 *    
 * => Method Area라는 메모리 영역
 *    - 클래스를 정의한 코드를 보관하는 메모리다.
 *    - JVM이 클래스를 실행하려면 해당 클래스 파일(ex: CalculatorTest.class 파일)을 
 *      HDD에서 찾아서 내부 RAM으로 읽어 와야 한다.
 *      이것을 "로딩(loading)"이라고 표현한다.
 * 
 * => 변수와 메모리 영역의 관계
 *    1) 로컬 변수 
 *       - 메서드가 호출될 때 Stack 메모리 영역에 만들어지고, 
 *       - 메서드 호출이 끝나면 제거된다.
 *    2) 클래스 변수 
 *       - 클래스가 Method Area 메모리 영역에 로딩될 때 만들어진다.
 *       - JVM이 종료될 때까지 유지된다.
 *       - 클래스 변수는 가비지 컬렉터의 관리 대상이 아니다.
 *       - 가비지 컬렉터는 Heap 영역의 메모리만 관리한다.
 *    3) 배열 및 객체
 *       - new 명령을 실행할 때 Heap 메모리 영역에 만들어진다.
 *       - 가비지 컬렉터가 수집하거나 JVM이 종료될 때 제거된다.
 *    
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





