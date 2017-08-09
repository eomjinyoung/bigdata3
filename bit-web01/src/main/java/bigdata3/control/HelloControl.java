package bigdata3.control;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControl {

  @RequestMapping("/hello")
  public String hello(HttpServletRequest request) throws Exception {
    request.setAttribute("message", "Hello, world!");
    return "/hello.jsp";
  }
  
  @RequestMapping("/hello2")
  public String hello2(HttpServletRequest request) throws Exception {
    request.setAttribute("message", "Hello, world!");
    return "/hello.jsp";
  }
  
  @RequestMapping("/hello3")
  public String hello3(Map bongdari) throws Exception {
    bongdari.put("message", "Hello, world!");
    return "/hello.jsp";
  }
  
  @RequestMapping("/hello4")
  public String hello4(Model bongdari) throws Exception {
    bongdari.addAttribute("message", "Hello, world!");
    return "/hello.jsp";
  }
  
  @RequestMapping("/hello5")
  public ModelAndView hello5() throws Exception {
    ModelAndView mv = new ModelAndView();
    mv.addObject("message", "Hello, world!");
    mv.setViewName("/hello.jsp");
    return mv;
  }

}





