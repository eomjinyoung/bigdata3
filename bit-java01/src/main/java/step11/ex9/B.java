package step11.ex9;

public class B extends A {
  int v2;
  
  // 상속 받은 메서드를 오버라이딩 하려면 
  // 리턴 타입, 메서드명, 파라미터 선언이 같아야 한다.
  void print() {
    super.print(); // 재정의하기 전의 원래 메서드를 호출하고 싶다면, super를 사용하라!
                   // 이때 super는 수퍼클래스의 인스턴스를 의미하는 것이 아니다!
                   // 단순히 재정의하기 전에 상태를 가리키는 특별한 명령어이다.
    System.out.printf("v2 = %d\n", this.v2);
  }
}
