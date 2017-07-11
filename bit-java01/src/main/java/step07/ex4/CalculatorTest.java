/* 클래스 : 개별적으로 관리해야 하는 값이라면 클래스 변수가 아니라 인스턴스 변수에 저장하라!
 * => 클래스 변수: 클래스를 로딩할 때 Method Area 영역에 만드는 변수
 * => 로컬 변수: 메서드를 실행할 때 Stack 영역에 만드는 변수
 * => 인스턴스 변수: new 명령을 이용하여 메모리를 만들 때 Heap 영역에 만드는 변수
 *    
 */
package step07.ex4;

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





