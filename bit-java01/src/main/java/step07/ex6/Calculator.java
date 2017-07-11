package step07.ex6;

public class Calculator {
  
  float result = 0f; 

  // => 인스턴스 메서드는 static을 붙이지 않는다.
  // => 인스턴스 주소를 메서드를 호출할 때 앞 부분에서 받는다.
  //    따라서 파라미터로 받지 않는다.
  // => 메서드를 호출할 때 넘겨준 인스턴스 주소는 
  //    내부의 빌트인 변수 "this"에 보관된다.
  void plus(float b) {
    // this라는 변수는 인스턴스 주소를 저장하는 변수로서
    // static이 붙지 않은 인스턴스 메서드라면 모두 구비하고 있다.
    // 대신 인스턴스 메서드를 호출할 때 반드시 인스턴스 주소를 줘야 한다.
    this.result += b; 
  }
  
  void minus(float b) {
    this.result -= b; 
  }
  
  void multiple(float b) {
    this.result *= b; 
  }
  
  void divide(float b) {
    this.result /= b; 
  }
  
}
