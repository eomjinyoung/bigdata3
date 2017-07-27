package step23.v4;

import java.io.PrintWriter;

// MyWebServer와 웹 애플리케이션 사이의 호출 규칙을 정의한 인터페이스이다.
// 웹 애플리케이션을 만들 때 이 규칙에 따라 만들어야만 
// MyWebServer가 호출할 수 있을 것이다.
public interface Servlet {
  void service(PrintWriter out) throws Exception;
}
