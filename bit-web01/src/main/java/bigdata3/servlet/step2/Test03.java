/* 클라이언트가 보낸 값 꺼내기
 */
package bigdata3.servlet.step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step2/test03")
public class Test03 extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // 클라이언트가 다음과 같이 요청할 때, 데이터를 꺼내는 방법
    // 예) http://localhost:8080/web01/step2/test03?name=aaa&age=20
    
    // => 클라이언트가 보낸 값 꺼내기
    String name = req.getParameter("name");
    
    // getParameter()가 리턴하는 것은 무조건 문자열이다.
    // 숫자로 바꾸고 싶다면 다음과 같이 변환 도구를 사용하라!
    int age = Integer.parseInt(req.getParameter("age"));
    
    resp.setContentType("text/plain;charset=UTF-8");
    
    PrintWriter out = resp.getWriter();
    out.printf("name=%s\n", name);
    out.printf("age=%d\n", age);
  }
}










