package bigdata3.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bigdata3.control.Controller;

@WebServlet(urlPatterns="*.do")
public class DispatcherServlet  extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    try {
      //요청 URL 예) http://localhost:8080/web01/member/list.do
      // req.getServletPath() => /member/list.do
      // replace(".do", "") => /member/list
      String controllerPath = req.getServletPath().replace(".do", ""); 
      
      res.setContentType("text/html;charset=UTF-8");
      
      Controller pageController = 
          (Controller)this.getServletContext().getAttribute(controllerPath);
      
      if (pageController == null) {
        throw new ServletException("요청한 URL을 처리할 수 없습니다.");
      }
      
      // 요청한 URL을 처리할 페이지 컨트롤러가 있다면,
      String viewPath = pageController.service(req, res);
      
      if (viewPath.startsWith("redirect:")) {
        // viewPath 예) "redirect:list.do"
        // viewPath.replaceAll("redirect:", "") => "list.do"
        res.sendRedirect(viewPath.replaceAll("redirect:", ""));
        return;
      } 
      
      RequestDispatcher rd = req.getRequestDispatcher(viewPath);
      rd.include(req, res);
      
    } catch (Exception e) {
      req.setAttribute("error", e); 
      RequestDispatcher rd = req.getRequestDispatcher("/error.jsp");
      rd.forward(req, res);
      return;
    }
    
  }
}









