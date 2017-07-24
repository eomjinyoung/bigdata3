package step18.ex10;

// Selector 규칙에 따라 만든 클래스이다.
// Factory 클래스가 사과를 고를 때 사용하는 클래스이다.
//
public class MySelector2 implements Selector {
  public boolean test(Apple apple) {
    // 이 클래스는 무게가 150g 이상되는 사과만 골라준다.
    if (apple.weight >= 150)
      return true;
    return false;
  }
}
