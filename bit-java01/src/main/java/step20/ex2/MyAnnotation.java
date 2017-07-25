package step20.ex2;

public @interface MyAnnotation {
  // 속성(attribute) 선언
  // => 속성의 이름은 변수처럼
  // => 선언은 메서드처럼
  String name();
  int age();
}
