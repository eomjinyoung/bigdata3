package step18.ex5;

public interface A {
  /* 1) 인터페이스의 모든 메서드는 추상 메서드이다.
   *    - 메서드를 구현할 수 없다.
   * 2) public 접근 제어를 갖는다. 왜? 규칙이니까. 규칙은 공개해야 하는 것이다.
   *    - private, protected, (default)는 안된다.
   * 3) public, abstract를 생략할 수 있다.
   */
  
  // 다음과 같이 public과 abstract를 생략하면 컴파일러가 자동으로 붙인다.
  /*public abstract*/ void m1();
  public abstract void m2(int a);
  public abstract void m3(String a, int b);
}
