package step13.ex1;

public class Test02 {

  public static void main(String[] args) {
    // 1) 계산 결과를 저장할 메모리 준비
    Calculator2 calc = new Calculator2();
    
    // 2) 결과를 다루는 연산자를 사용하여 작업을 수행한다.
    calc.plus(10);
    calc.plus(7);
    calc.minus(5);
    
    // private modifier가 붙은 인스턴스 변수는 
    // 레퍼런스로 직접 접근할 수 없다.
    // => 그래서 이전에 문제가 되었던 부분,
    //    "직접 인스턴스 변수의 값을 바꾸는 문제"를 
    //    private을 통해 제약을 가한다.
    //calc.result = 3000f; // 직접 접근할 수 없다.
    
    // result 변수의 값을 직접 바꾸지 못하게 막은 것은 좋은데,
    // 문제는 result 변수의 값을 꺼낼 수도 없다.
    // 해결채? 값을 꺼내는 수단/방법(method)을 제공하면 된다.
    System.out.println(calc.result);

  }

}
