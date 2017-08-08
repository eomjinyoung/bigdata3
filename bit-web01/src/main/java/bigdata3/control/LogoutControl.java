package bigdata3.control;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bigdata3.annotation.Component;

@Component("/auth/logout")
public class LogoutControl implements Controller {
  @Override
  public String service(HttpServletRequest req, HttpServletResponse res) throws Exception {
    req.getSession().invalidate();  
    return "redirect:../auth/login.do";
  }
}









