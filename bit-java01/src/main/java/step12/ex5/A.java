package step12.ex5;

public class A {
  int plus(int a) {
    return a + a;
  }
  
  // 오버로딩은 파라미터의 개수와 타입이 달라야 한다.
  // 리턴 타입이 다른 것은 의미없다.
  // 왜?
  // 같은 이름의 메서드가 여러 개 있을 때 
  // 아규먼트의 데이터 타입과 개수에 따라서 
  // 호출할 메서드를 결정하기 때문이다.
  /* 컴파일 오류!
  String plus(int a) {
    return a + b; 
  }*/
}
