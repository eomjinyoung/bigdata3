package step23.v7;

import java.io.PrintWriter;
import java.util.Map;

@WebServlet("/hello")
public class Hello implements Servlet {

  @Override
  public void service(Map<String,String> paramMap, PrintWriter out) throws Exception {
    out.printf("<html><body><h1 style='color:blue;'>%s님 반갑습니다!</h1></body></html>",
        paramMap.get("name"));
  }
  
}
