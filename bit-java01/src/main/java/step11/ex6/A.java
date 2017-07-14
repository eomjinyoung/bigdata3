package step11.ex6;

public class A {
  int v1;
  
  A() {
    System.out.println("A() 생성자 실행");
  }
  
  void m1() {
    System.out.println(this.v1);
  }
}
