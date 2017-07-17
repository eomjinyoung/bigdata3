/* 캡슐화 적용 후 II
 * => 인스턴스 변수에 직접 접근하는 것을 막는 대신
 *    인스턴스 변수의 값을 다루는 메서드를 제공해야 한다. 
 */
package step13.ex1;

public class Test03 {

  public static void main(String[] args) {
    Calculator2 calc = new Calculator2();
    
    calc.plus(10);
    calc.plus(7);
    calc.minus(5);
    
    System.out.println(calc.getResult());
    
    // 결과 값을 초기화시키고 다시 계산하고 싶다!
    // => result 변수의 값을 0으로 설정해야 하는데,
    //    private으로 접근이 제한되어 직접 값을 0으로 바꿀 수 없다.
    // => 대신 결과 값을 초기화시켜주는 메서드가 필요하다.
    calc.reset();
    
    calc.plus(5);
    calc.minus(2);
    
    System.out.println(calc.getResult());

  }

}
