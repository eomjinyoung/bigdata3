package step20.ex3;

public @interface MyAnnotation2 {
  String name() default "홍길동"; // 선택 속성
  int age() default 100; // 선택 속성
  boolean gender() default true; // 선택 속성
  float height() default 170.5f; // 선택 속성
}
