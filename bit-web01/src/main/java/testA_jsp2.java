import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.HttpJspPage;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;

import bigdata3.domain.Lecture;

/* JSP 엔진이 JSP 파일을 가지고 자바 서블릿 파일을 만드는 과정
 * 1) Servlet 인터페이스를 구현한다.
 *    => HttpServlet 상속 받는다.
 * 2) JSP를 가지고 서블릿을 만들 때는 반드시 HttpJspPage 인터페이스를 구현해야 한다.
 *    => HttpJspPage 인터페이스를 구현한다.
 *    => jspInit()는 반드시 서블릿 객체가 생성될 때 호출되어야 한다.
 *    => jspDestroy()는 웹애플리케이션이 종료되기 전에 반드시 호출되어야 한다.
 *    => _jspService()는 클라이언트 요청이 들어올 때 마다 호출되어야 한다.
 * 3) JSP 기본 객체(build-in 객체) 9개를 준비해야 한다.
 *    => _jspService()에서 9개의 기본 객체를 생성하거나 준비한다.
 *    => request, response, application, session, config, pageContext, page, error, out
 * 4) JSP 지시어 태그에 해당하는 자바 코드 생성
 *    => <%@ %> 태그를 처리한다.
 * 5) JSP 선언문 태그 처리
 *    => <%! %> 태그에 들어 있는 코드를 클래스 블록 안에 복사한다.
 * 6) 다음은 작성한 순서대로 그대로 _jspService() 메서드 안에 놓는다. 
 *    => 템플릿 데이터는 출력문으로 만들어 _jspService()에 순서대로 놓는다.
 *       - 그냥 작성한 것.
 *    => JSP 표현식(<%= %>) 
 *       - 출력문을 만들어 파라미터 부분에 복사한다.
 *    => 스크립트릿(<% %>)
 *       - 안에 있는 코드를 그대로 복사한다.
 *    
 */
public class testA_jsp2 extends HttpServlet implements HttpJspPage {
  
  String name = "홍길동";
  int age = 20;
  public int result;
  void plus(int a, int b) {
    this.result = a + b;
  }
  
  
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
    ServletContext application = this.getServletContext();
    HttpSession session = request.getSession();
    PageContext pageContext = null; // 객체 생성하는 코드는 생략한다.
    JspWriter out = null;// 객체 생성하는 코드는 생략한다.
    Object page = this;
    ServletConfig config = this.getServletConfig();
    Throwable error = (Throwable)request.getAttribute("error");
    
    try {
      response.setContentType("text/html; charset=UTF-8");
      out.write("<!DOCTYPE html>");
      out.write("<html><!-- HTML 주석은 JSP 입장에서 일반 텍스트로 취급된다. -->");
      out.write("<head>");
      out.write("  <meta charset=\"UTF-8\">");
      out.write("  <title>JSP</title>");
      out.write("</head>");
      out.write("<body>");
      out.write("<h1>Declaration 엘리먼트</h1>");
      out.write("name: ");
      out.write(name);
      out.write("<br> ");
      out.write("age: ");
      out.write(age);
      out.write("<br>");
      plus(10, 20);
      out.write("10 + 20 = ");
      out.write(result );
      
      out.write("<script>");
      out.write("function doDelete() {");
      out.write("  location.href = 'delete.do?no=");
      Lecture lecture = (Lecture)request.getAttribute("lecture");
      out.write(lecture.getLectureNo());
      out.write("'");
      out.write("}");
      out.write("function doList() {");
      out.write("  location.href = 'list.do'");
      out.write("");
      out.write("}");
      out.write("");
      out.write("alert(\"Hello!-");
      out.write(lecture.getClassroomNo());
      out.write("\")");
      out.write("</script>");
      out.write("");
      out.write("");
      out.write("</body>");
      out.write("</html>");
      
    } catch (Throwable e) {
      
    }
    
  }

}










