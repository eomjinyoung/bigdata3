package bigdata3.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component("/plus")
public class PlusControl implements Controller {

  @Override
  public String service(HttpServletRequest request, HttpServletResponse response) throws Exception {
    int a = Integer.parseInt(request.getParameter("a"));
    int b = Integer.parseInt(request.getParameter("b"));
    
    request.setAttribute("result", a + b);
    
    return "/plus.jsp";
  }

}





