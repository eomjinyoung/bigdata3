package step18.ex8;

/* 인터페이스는 다중 상속이 가능하다.
 * 왜? 어차피 구현되지 않은 메서드이기 때문이다.
 */
public interface C extends A, B {
  void m4();
}
