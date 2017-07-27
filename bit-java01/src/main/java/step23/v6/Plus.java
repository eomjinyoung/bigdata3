package step23.v6;

import java.io.PrintWriter;
import java.util.Map;

public class Plus implements Servlet {

  @Override
  public void service(Map<String, String> paramMap, PrintWriter out) throws Exception {
    int a = Integer.parseInt(paramMap.get("a"));
    int b = Integer.parseInt(paramMap.get("b"));
    
    out.println("<html>");
    out.println("<body>");
    out.println("<h1>계산 결과</h1>");
    out.printf("%d + %d = %d\n", a, b, (a + b));
    out.println("</body>");
    out.println("</html>");
  }

}
