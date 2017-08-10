import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.HttpJspPage;

/* JSP 엔진이 JSP 파일을 가지고 자바 서블릿 파일을 만드는 과정
 * 1) Servlet 인터페이스를 구현한다.
 *    => HttpServlet 상속 받는다.
 * 2) JSP를 가지고 서블릿을 만들 때는 반드시 HttpJspPage 인터페이스를 구현해야 한다.
 *    => HttpJspPage 인터페이스를 구현한다.
 *    => jspInit()는 반드시 서블릿 객체가 생성될 때 호출되어야 한다.
 *    => jspDestroy()는 웹애플리케이션이 종료되기 전에 반드시 호출되어야 한다.
 *    => _jspService()는 클라이언트 요청이 들어올 때 마다 호출되어야 한다.
 */
public class testA_jsp extends HttpServlet implements HttpJspPage {
  @Override
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    jspInit();
  }
  
  @Override
  public void jspInit() {
  }
  
  @Override
  public void destroy() {
    super.destroy();
    jspDestroy();
  }

  @Override
  public void jspDestroy() {
  }
  
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    _jspService(req, resp);
  }
  
  @Override
  public void _jspService(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
  }

}






