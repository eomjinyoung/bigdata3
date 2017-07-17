package step13.ex1;

public class Calculator2 {
  // 레퍼런스로 직접 접근하지 못하게 막는다.
  // 원래의 특질을 변경한다. 
  // 이렇게 원래의 특질을 변경시켜주는 명령을 "modifier"라 부른다. 
  private float result;
  
  void plus(float value) {
    this.result += value;
  }
  void minus(float value) {
    this.result -= value;
  }
  float getResult() {
    return this.result;
  }
}
