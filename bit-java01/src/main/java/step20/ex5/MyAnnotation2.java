package step20.ex5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 애노테이션의 유지 정책: SOURCE
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation2 {
  String value();
}
