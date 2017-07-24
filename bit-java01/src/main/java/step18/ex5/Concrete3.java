package step18.ex5;

/* 인터페이스에 선언된 메서드 보다 공개 범위를 좁힐 수 없다.
 * => 인터페이스의 메서드와 동일하게 public으로 선언해야 한다.
 */ 

public class Concrete3 implements A {

  //void m1() {} // 인터페이스 메서드는 무조건 public이다. public 보다 공개 범위를 좁힐 수 없다. 컴파일 오류!
  public void m1() {} // OK!
  
  public void m2(int a) {}
  public void m3(String a, int b) {}

}
