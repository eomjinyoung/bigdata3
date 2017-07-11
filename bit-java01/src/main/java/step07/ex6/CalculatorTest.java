/* 클래스 : 인스턴스 메서드의 사용
 * => 인스턴스 변수의 주소를 자동으로 받는 메서드이다.
 * => 메서드를 호출할 때 반드시 인스턴스 주소를 앞에 붙여야 한다.
 * => 인스턴스 메서드는 static을 붙이지 않는다.
 *    
 */
package step07.ex6;

public class CalculatorTest {


  public static void main(String[] args) {
    /* 계산기 기능을 구현하면서 클래스 문법을 활용하는 방법을 익혀보자!
     * 6단계: 인스턴스 주소를 메서드에 넘기는 또 다른 방법!
     */
    
    // 계산식1: 2 + 3 - 6 * 2 + 7 / 2 = 2.5
    // 계산식2: 5 * 2 - 3 + 14 / 3 = 7.0
    // 단 연산자 우선순위는 무시하고 앞에서 부터 계속 계산하라!
    
    Calculator obj1 = new Calculator(); 
    Calculator obj2 = new Calculator();  
    
    // 인스턴스 주소를 파라미터가 아닌 메서드 호출 앞 부분에 넘긴다. 
    obj1.plus(2);
    obj1.plus(3);
    obj1.minus(6);
    obj1.multiple(2);
    obj1.plus(7);
    obj1.divide(2);
    
    obj2.plus(5);
    obj2.multiple(2);
    obj2.minus(3);
    obj2.plus(14);
    obj2.divide(3);
    
    // 이제 obj1이 가리키는 객체의 result 값과
    // obj2가 가리키는 메모리의 result 값을 출력해 보자!
    System.out.println(obj1.result);
    System.out.println(obj2.result);
    
  }

}





