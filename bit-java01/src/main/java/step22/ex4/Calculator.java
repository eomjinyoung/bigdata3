package step22.ex4;

public class Calculator {
  public static int plus(int a, int b) {
    return a + b;
  }
  
  public static int minus(int a, int b) {
    return a - b;
  }
  
  public static int multiple(int a, int b) {
    return a * b;
  }
  
  public static int divide(int a, int b) throws Exception {
    // 예외 처리 문법 적용:
    // 예외 상황이 발생하면 Exception 객체에 예외 내용을 담아 호출자에게 전달한다.
    // 예외 상황이 발생했을 때 어떤 예외를 던지는지 메서드 선어부에 적어야 한다.  
    if (b == 0) 
      throw new Exception("0으로 나눌 수 없습니다.");
    
    return a / b;
  }
}









