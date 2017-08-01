/* 클라이언트로 출력하기
 * 
 */
package bigdata3.servlet.step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step2/test01")
public class Test01 extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // 출력 도구를 얻는다.
    PrintWriter out = resp.getWriter();
    
    // 출력한다.
    out.println("Hello!");
    out.println("안녕하세요!");
    out.println("こんにちは!");
  }
}










