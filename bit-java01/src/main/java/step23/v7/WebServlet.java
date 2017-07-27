package step23.v7;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 이제 서블릿 클래스를 작성할 때
// 이 애노테이션을 붙여서 URL을 지정하라!
// 이 애노테이션은 RUNTIME 유지 정책으로 관리되기 때문에,
// 컴파일 된 후에도 .class 파일에 남아있고,
// 실행 중에 이 애노테이션 값을 꺼낼 수 있다.
@Retention(RetentionPolicy.RUNTIME)
public @interface WebServlet {
  String value(); // 필수 항목으로 서블릿의 URL을 저장한다.
}
