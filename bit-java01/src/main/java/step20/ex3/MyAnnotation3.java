package step20.ex3;

public @interface MyAnnotation3 {
  String value(); // value 속성
  int value2() default 100;
}
