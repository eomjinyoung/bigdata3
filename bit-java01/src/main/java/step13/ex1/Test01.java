package step13.ex1;

public class Test01 {

  public static void main(String[] args) {
    // 1) 계산 결과를 저장할 메모리 준비
    Calculator calc = new Calculator();
    
    // 2) 결과를 다루는 연산자를 사용하여 작업을 수행한다.
    calc.plus(10);
    calc.plus(7);
    calc.minus(5);
    
    // 3) 결과를 출력한다.
    System.out.println(calc.result);

  }

}
