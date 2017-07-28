package step24;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/plus")
public class Plus implements Servlet {

  @Override
  public void service(ServletRequest req, ServletResponse res) 
      throws ServletException, IOException {
    int a = Integer.parseInt(req.getParameter("a"));
    int b = Integer.parseInt(req.getParameter("b"));
    
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    
    out.println("<html>");
    out.println("<body>");
    out.println("<h1>계산 결과</h1>");
    out.printf("%d + %d = %d\n", a, b, (a + b));
    out.println("</body>");
    out.println("</html>");
  }

  @Override
  public void init(ServletConfig config) throws ServletException {
    // TODO Auto-generated method stub
    
  }

  @Override
  public ServletConfig getServletConfig() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getServletInfo() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void destroy() {
    // TODO Auto-generated method stub
    
  }

}
