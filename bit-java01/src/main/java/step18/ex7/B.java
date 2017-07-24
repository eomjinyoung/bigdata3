package step18.ex7;

/* 인터페이스도 상속 받을 수 있다.
 * => 서브(자식) 인터페이스는 부모 인터페이스의 메서드를 상속 받는다. 
 */
public interface B extends A {
  void m3();
}
