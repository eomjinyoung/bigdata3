package step18.ex5;

/* 인터페이스의 선언된 메서드를 구현하지 않으면,
 * 추상 메서드로 남게 된다.
 * 일반 클래스는 추상 메서드를 가질 수 없기 때문에,
 * 추상 클래스로 선언해야 한다.
 */ 

public abstract class Concrete2 implements A {

  //public void m1() {} // 이 메서드를 구현하지 않으면 추상 메서드로 남게 된다.
                        // 따라서 클래스를 추상 클래스로 선언해야 한다.
  public void m2(int a) {}
  public void m3(String a, int b) {}

}
