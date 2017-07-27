package step23.v3;

import java.io.PrintWriter;

// MyWebServer가 사용할 클래스이기 때문에
// 반드시 Servlet 규칙(인터페이스)에 따라 작성하라!
public class Hello implements Servlet {

  @Override
  public void service(PrintWriter out) throws Exception {
    out.println("Hello!!!!!");
  }
  
}
