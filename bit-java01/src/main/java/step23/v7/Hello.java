package step23.v7;

import java.io.PrintWriter;
import java.util.Map;

// MyWebServer가 사용할 클래스이기 때문에
// 반드시 Servlet 규칙(인터페이스)에 따라 작성하라!
public class Hello implements Servlet {

  @Override
  public void service(Map<String,String> paramMap, PrintWriter out) throws Exception {
    out.printf("<html><body><h1 style='color:blue;'>%s님 반갑습니다!</h1></body></html>",
        paramMap.get("name"));
  }
  
}
