package step18.ex10;

// Selector 규칙에 따라 만든 클래스이다.
// Factory 클래스가 사과를 고를 때 사용하는 클래스이다.
//
public class MySelector implements Selector {
  public boolean test(Apple apple) {
    // 이 클래스는 red 색상의 사과를 골라준다.
    if ("red".equals(apple.color))
      return true;
    return false;
  }
}
