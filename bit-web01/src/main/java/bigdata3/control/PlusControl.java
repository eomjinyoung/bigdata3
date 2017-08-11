package bigdata3.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlusControl {

  @RequestMapping("/plus")
  public String service(HttpServletRequest request, HttpServletResponse response) throws Exception {
    int a = Integer.parseInt(request.getParameter("a"));
    int b = Integer.parseInt(request.getParameter("b"));
    
    request.setAttribute("result", a + b);
    
    return "plus";
  }

}





