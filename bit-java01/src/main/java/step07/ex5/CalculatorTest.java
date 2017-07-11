/* 클래스 : 클래스 변수의 문제점! 
 * => 개별적으로 관리해야 하는 값이라면 클래스 변수가 아니라 인스턴스 변수에 저장하라.
 * => 클래스 변수: 클래스를 로딩할 때 Method Area 영역에 만드는 변수
 * => 로컬 변수: 메서드를 실행할 때 Stack 영역에 만드는 변수
 * => 인스턴스 변수: new 명령을 이용하여 메모리를 만들 때 Heap 영역에 만드는 변수
 *    
 */
package step07.ex5;

public class CalculatorTest {


  public static void main(String[] args) {
    /* 계산기 기능을 구현하면서 클래스 문법을 활용하는 방법을 익혀보자!
     * 4단계: 클래스 변수는 계산 결과를 개별적으로 관리할 수 없다.
     */
    
    // 계산식1: 2 + 3 - 6 * 2 + 7 / 2 = 2.5
    // 계산식2: 5 * 2 - 3 + 14 / 3 = 7
    // 단 연산자 우선순위는 무시하고 앞에서 부터 계속 계산하라!
    
    // 클래스 변수를 사용하면 두 개의 계산식을 동시에 진행할 수 없다.
    // 왜? 모든 메서드가 한 개의 클래스 변수(result)를 공유하기 때문이다.
    Calculator.plus(2);
    Calculator.plus(3);
    Calculator.minus(6);
    Calculator.multiple(2);
    Calculator.plus(7);
    Calculator.divide(2);
    
    // 안타깝게도 기존 결과에 이어서 계산을 수행할 것이다.
    Calculator.plus(5);
    Calculator.multiple(2);
    Calculator.minus(3);
    Calculator.plus(14);
    Calculator.divide(3);
    
    // 그래서 각각의 계산식의 결과를 구분할 수 없다.
    System.out.println(Calculator.result);
    
  }

}





