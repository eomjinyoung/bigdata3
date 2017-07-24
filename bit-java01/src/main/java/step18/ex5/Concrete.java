package step18.ex5;

/* 보통 인터페이스 규칙에 따라 만든 일반 클래스를 
 * "콘크리트(concrete) 클래스"라 부른다.
 * 추상 클래스는 concrete 클래스라 부르지 않는다.
 * 인터페이스 구현하기
 * => class 클래스명 implements 규칙1, 규칙2, ... {
 *      규칙1, 규칙2 등에 선언된 모든 메서드를 구현한다.
 *    }
 * 
 */ 
public class Concrete implements A {

  public void m1() {}
  public void m2(int a) {}
  public void m3(String a, int b) {}

}
