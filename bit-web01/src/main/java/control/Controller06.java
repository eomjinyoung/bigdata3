/* Spring WebMVC: 요청 http method 구분하여 처리하기 II 
 * => @RequestMapping의 method 속성에 값을 지정한다.
 *    method 속성 값을 지정하지 않으면 모든 요청을 처리한다.
 * => 실행 방법
 *    http://localhost:8080/springweb01/controller06.html
 */
package control;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/control/controller06/") 
public class Controller06 {
  
  //@RequestMapping(value="ok", method=RequestMethod.GET) // 이렇게 해도 되고
  @RequestMapping(path="ok", method=RequestMethod.GET) // 이렇게 해도 된다.
  public void get(HttpServletRequest request, HttpServletResponse response) throws Exception {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("get!");
  }
  
  @RequestMapping(path="ok", method=RequestMethod.POST)
  public void post(HttpServletRequest request, HttpServletResponse response) throws Exception {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("post!");
  }
  
}


















