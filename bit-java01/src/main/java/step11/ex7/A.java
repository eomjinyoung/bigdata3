package step11.ex7;

public class A {
  int v1;
  
  // A 클래스는 기본 생성자(파라미터가 없는 생성자)가 없다!
  // 예) A() {}
  
  A(int value) {
    this.v1 = value;
    System.out.println("A(int) 생성자 실행");
  }
  
  void m1() {
    System.out.println(this.v1);
  }
}
