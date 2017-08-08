package bigdata3.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component("/gugudan")
public class GugudanControl implements Controller {

  @Override
  public String service(HttpServletRequest request, HttpServletResponse response) throws Exception {
    int dan = Integer.parseInt(request.getParameter("dan"));
    
    StringBuffer buf = new StringBuffer();
    for (int i = 1; i <= 9; i++) {
      buf.append(String.format("%d x %d = %d<br>\n", dan, i, (dan * i)));
    }
    
    request.setAttribute("result", buf.toString());
    
    return "/gugudan.jsp";
  }

}





