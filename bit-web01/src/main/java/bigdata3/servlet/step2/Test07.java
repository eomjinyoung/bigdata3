/* 클라이언트가 보낸 데이터의 한글이 깨지는 이유
 * => GET 요청인 경우 톰캣 8부터 한글이 깨지지 않는다.
 *    그러나 그 이하 버전에서는 한글이 깨진다. 
 *    만약 깨진다면 톰캣 서버의 설정 파일 중에서 server.xml 파일을 다음과 같이 편집하라!
 *    <Connector 
 *      connectionTimeout="20000" 
 *      port="8080" 
 *      protocol="HTTP/1.1" 
 *      redirectPort="8443"
 *      URIEncoding="UTF-8"/>
 *    - 즉 connector 태그에 URIEncoding 속성을 추가한다. 
 * 
 * => POST 요청인 경우 getParameter()를 호출하여 값을 꺼내기 전에 
 *    클라이언트가 보낸 데이터가 어떤 인코딩으로 되어 있는지 서블릿 컨테이너에게 알려야 한다.
 *    req.setCharacterEncoding("UTF-8")
 *         ...    
 */
package bigdata3.servlet.step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step2/test07")
public class Test07 extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // GET 요청은 서블릿 컨테이너에서 자동으로 UTF-8을 자바 유니코드로 변환시키기 때문에
    // 따로 자바 코드를 작성할 필요는 없다.
    
    String name = req.getParameter("name");
    int age = Integer.parseInt(req.getParameter("age"));
    resp.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = resp.getWriter();
    out.println("GET 요청");
    out.printf("name=%s\n", name);
    out.printf("age=%d\n", age);
  }
  
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // POST 요청은 반드시 getParameter()를 최초로 호출하기 전에 
    // 클라이언트가 보낸 데이터가 어떤 인코딩으로 되어 있는지 알려줘야 한다.
    req.setCharacterEncoding("UTF-8");
    
    String name = req.getParameter("name");
    int age = Integer.parseInt(req.getParameter("age"));
    resp.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = resp.getWriter();
    out.println("POST 요청");
    out.printf("name=%s\n", name);
    out.printf("age=%d\n", age);
  }
}










