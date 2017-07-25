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
  
  public static int divide(int a, int b) {
    // 예외 처리 문법이 없던 시절: 
    // 0으로 나눌 수 없기에
    // 만약 파라미터 값이 0이면 호출자에게 나누기를 할 수 없다고 리턴 값으로 알려 줬다.
    if (b == 0) 
      return -989898; // 나눗셈의 결과로 잘 나올 수 없는 수를 리턴한다.
    
    return a / b;
  }
}









