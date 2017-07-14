package step11.ex3;

// 상속은 기존 코드를 손대지 않고 기능을 확장할 수 있다.
public class Calculator2 extends Calculator {
  void multiple(float value) {
    this.result *= value;
  }
  
  void divide(float value) {
    this.result /= value;
  }
}
