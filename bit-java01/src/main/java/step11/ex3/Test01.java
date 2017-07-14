package step11.ex3;

public class Test01 {

  public static void main(String[] args) {
    // 1) Calculator 설계도에 따라 메모리를 준비한다.
    Calculator calc = new Calculator();
    
    // 2) Calculator 설계도에 정의된 연산자를 사용하여 
    //    Calculator 설계도에 따라 만든 메모리를 다룬다.
    calc.plus(10);
    calc.plus(20);
    calc.minus(7);
    
    System.out.println(calc.result);
    

  }

}
