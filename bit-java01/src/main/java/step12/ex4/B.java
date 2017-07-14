package step12.ex4;

public class B extends A {
  // 기존의 메서드와 시그너처(signature)가 다르기 때문에
  // 오버로딩에 해당한다.
  // 메서드 시그너처(signature)?
  // => 메서드의 형식. 즉 리턴 타입, 이름, 파라미터의 형식을 말한다.
  // => C/C++에서는 function prototype이라 부른다.
  float plus(float a, float b) {
    return a + b;
  }
}
