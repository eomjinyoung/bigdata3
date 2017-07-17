package step13.ex3;

public class MyClass {
  private int v1;
  int v2;
  protected int v3;
  public int v4;
  
  void m1() {
    // 클래스 멤버는 modifier와 상관없이 접근할 수 있다.
    this.v1 = 100;
    this.v2 = 200;
    this.v3 = 300;
    this.v4 = 400;
  }
}
