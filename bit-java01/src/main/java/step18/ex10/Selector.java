package step18.ex10;

// Factory와 사과를 고르는 객체 사이의 호출 규칙을 정의한다.
public interface Selector {
  boolean test(Apple apple);
}
