/* 클래스 : 인스턴스 변수의 사용
 * => new 명령을 사용하여 클래스 설계도 따라 인스턴스 변수를 준비한다.
 *    인스턴스 변수는 Heap 영역에 생성된다.
 *    
 */
package step07.ex5;

public class CalculatorTest {


  public static void main(String[] args) {
    /* 계산기 기능을 구현하면서 클래스 문법을 활용하는 방법을 익혀보자!
     * 5단계: 인스턴스 변수를 사용하여 결과 값을 개별적으로 관리해 보자!
     */
    
    // 계산식1: 2 + 3 - 6 * 2 + 7 / 2 = 2.5
    // 계산식2: 5 * 2 - 3 + 14 / 3 = 7.0
    // 단 연산자 우선순위는 무시하고 앞에서 부터 계속 계산하라!
    
    // 계산식1의 결과를 담을 result 변수를 준비한다.
    Calculator obj1 = new Calculator(); // Calculator 설계도에 따라 float 변수가 한 개 생성된다.
    
    // 계산식2의 결과를 담을 result 변수를 준비한다.
    Calculator obj2 = new Calculator(); // Calculator 설계도에 따라 float 변수가 한 개 생성된다. 
    
    // 메서드를 호출할 때 어떤 메모리의 result 변수를 사용할 것인지 
    // 파라미터에 그 객체 주소를 넘겨줘야 한다.
    // 다음 메서들은 obj1에 저장된 객체 주소를 넘겨준다.
    Calculator.plus(2, obj1);
    Calculator.plus(3, obj1);
    Calculator.minus(6, obj1);
    Calculator.multiple(2, obj1);
    Calculator.plus(7, obj1);
    Calculator.divide(2, obj1);
    
    // 다음 메서드들은 obj2가 가리키는 객체의 result 변수를 사용하여 계산할 것이다.
    Calculator.plus(5, obj2);
    Calculator.multiple(2, obj2);
    Calculator.minus(3, obj2);
    Calculator.plus(14, obj2);
    Calculator.divide(3, obj2);
    
    // 이제 obj1이 가리키는 객체의 result 값과
    // obj2가 가리키는 메모리의 result 값을 출력해 보자!
    System.out.println(obj1.result);
    System.out.println(obj2.result);
    
  }

}





