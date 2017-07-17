package step13.ex1;

public class Test01 {

  public static void main(String[] args) {
    // 1) 계산 결과를 저장할 메모리 준비
    Calculator calc = new Calculator();
    
    // 2) 결과를 다루는 연산자를 사용하여 작업을 수행한다.
    calc.plus(10);
    calc.plus(7);
    calc.minus(5);
    
    // 계산을 수행할 때 Calculator 개발자의 의도와 다르게
    // 직접 result라는 인스턴스 변수에 접근하여 값을 바꾼다면?
    // Calculator를 만든 개발자의 생각과 다르게 계산 결과가 나올 수 있다.
    // 원래 result는 plus()나 minus() 연산을 수행한 결과를 담고 있어야 한다.
    // 아래와 같은 식으로 result 변수에 맘대로 접근하여 값을 바꾼다면,
    // 제대로 계산된 값이 나오지 않을 가능성이 있다.
    // 해결책? 레퍼런스로 직접 인스턴스 변수에 접근하지 못하게 막는다. 
    calc.result = 3000f;
    
    // 3) 결과를 출력한다.
    System.out.println(calc.result);

  }

}
