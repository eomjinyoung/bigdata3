package bigdata3.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component("/hello")
public class HelloControl implements Controller {

  @Override
  public String service(HttpServletRequest request, HttpServletResponse response) throws Exception {
    request.setAttribute("message", "Hello, world!");
    return "/hello.jsp";
  }

}





