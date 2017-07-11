package step07.ex5;

public class Calculator {
  
  // 개별적으로 관리해야 할 데이터는 인스턴스 변수에 보관하라!
  // => static을 붙이지 않으면 인스턴스 변수가 된다.
  // => 단 인스턴스 변수는 클래스가 로딩될 때 만들어지지 않는다.
  //    반드시 new 명령을 사용하여 명시적으로 만들어야 한다.
  // => 그리고 만들어지는 메모리 영역도 Method Area가 아니라 Heap이다.
  float result = 0f; 

  // 메서드에서 인스턴스 변수에 접근하려면
  // 인스턴스 주소를 알아야 한다.
  // 메서드에 인스턴스 주소를 받을 변수를 선언하라!
  static void plus(float b, Calculator obj) {
    obj.result += b; 
  }
  
  static void minus(float b, Calculator obj) {
    obj.result -= b; 
  }
  
  static void multiple(float b, Calculator obj) {
    obj.result *= b; 
  }
  
  static void divide(float b, Calculator obj) {
    obj.result /= b; 
  }
  
}
