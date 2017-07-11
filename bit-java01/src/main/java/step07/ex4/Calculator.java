package step07.ex4;

public class Calculator {
  // plus(), minus(), multiple(), divide() 메서드에서 사용할 변수도
  // 이 클래스에 둔다면 코드 관리가 수월할 것이다.
  // 이때 변수 선언 앞에 static을 붙여라!
  static float result = 0f; // 결과를 보관할 변수
  
  // result 변수가 같은 클래스에 있기 때문에 
  // 결과를 리턴할 필요가 없다. 바로 result 변수에 저장하면 된다.
  static void plus(float value) {
    result += value;
  }
  
  static void minus(float value) {
    result -= value;
  }
  
  static void multiple(float value) {
    result *= value;
  }
  
  static void divide(float value) {
    result /= value;
  }
}
