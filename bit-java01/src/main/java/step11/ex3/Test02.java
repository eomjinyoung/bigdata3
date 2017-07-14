package step11.ex3;

public class Test02 {

  public static void main(String[] args) {
    // 1) Calculator2 설계도에 따라 메모리를 준비한다.
    Calculator2 calc = new Calculator2();
    
    // 2) Calculator2 설계도에 정의된 연산자를 사용하여 
    //    Calculator2 설계도에 따라 만든 메모리를 다룬다.
    calc.plus(10); // 수퍼 클래스의 메서드 호출 
    // 메서드 호출 과정
    // 1) 레퍼런스의 클래스에서 메서드를 찾는다.
    // 2) 없다면, 그 클래스의 수퍼 클래스에서 찾는다.
    // 3) 꼭대기에 있는 클래스까지 다 찾아보고 그래도 없다면 컴파일 오류가 발생한다.
    
    calc.plus(20); // 수퍼 클래스의 메서드 호출
    calc.minus(7); // 수퍼 클래스이 메서드 호출
    calc.multiple(2); // 자신의 메서드 호출
    calc.divide(3); // 자신의 메서드 호출
    
    System.out.println(calc.result);
    

  }

}
