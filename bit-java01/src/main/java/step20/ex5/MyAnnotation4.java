package step20.ex5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 애노테이션의 유지 정책: RUNTIME
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation4 {
  String value();
}
