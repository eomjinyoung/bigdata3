package step22.ex3;

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
  
  public int divide(int a, int b) {
    // 0으로 나눌 수 없기에
    // 만약 파라미터 값이 0이면 호출자에게 나누기를 할 수 없다고 알려주자!
    return a / b;
  }
}









