package step11.ex3;

public class Test03 {

  public static void main(String[] args) {
    // 1) Calculator3 설계도에 따라 메모리를 준비한다.
    Calculator3 calc = new Calculator3();
    
    // 2) Calculator3 설계도에 정의된 연산자를 사용하여 
    //    Calculator3 설계도에 따라 만든 메모리를 다룬다.
    calc.plus(10); // 수퍼 클래스 Calculator.plus()
    calc.plus(20); // 수퍼 클래스 Calculator.plus() 
    calc.minus(7); // 수퍼 클래스 Calculator.minus()
    calc.multiple(2); // 수퍼 클래스 Calculator2.multiple()
    calc.divide(3);  // 수퍼 클래스 Calculator2.divide()
    calc.mod(12); // 자신의 메서드 Calculator3.mod()
    
    System.out.println(calc.result);
    

  }

}
