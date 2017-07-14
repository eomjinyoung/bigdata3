package step12.ex4;

public class A {
  int plus(int a) {
    return a + a;
  }
  
  // 오버로딩 예)
  // 기존의 메서드와 이름 같다. 
  // 대신 파라미터의 개수가 다르다.
  int plus(int a, int b) {
    return a + b; 
  }
  
  // 오버로딩 예)
  // 기존의 메서드의 이름도 같고 파라미터 개수도 같다.
  // 그러나 파라미터의 타입이 다르다.
  int plus(String s1, String s2) {
    int a = Integer.parseInt(s1);
    int b = Integer.parseInt(s2);
    return a + b;
  }
}
