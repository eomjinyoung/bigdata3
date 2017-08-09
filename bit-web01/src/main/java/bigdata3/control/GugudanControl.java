package bigdata3.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GugudanControl {

  @RequestMapping("/gugudan")
  public String service(HttpServletRequest request, HttpServletResponse response) throws Exception {
    int dan = Integer.parseInt(request.getParameter("dan"));
    
    StringBuffer buf = new StringBuffer();
    for (int i = 1; i <= 9; i++) {
      buf.append(String.format("%d x %d = %d<br>\n", dan, i, (dan * i)));
    }
    
    request.setAttribute("result", buf.toString());
    
    return "/gugudan.jsp";
  }
  
  @RequestMapping("/gugudan2")
  public String service2(
      @RequestParam("dan") String dan, 
      Model model) throws Exception {
    int d = Integer.parseInt(dan);
    
    StringBuffer buf = new StringBuffer();
    for (int i = 1; i <= 9; i++) {
      buf.append(String.format("%d x %d = %d<br>\n", d, i, (d * i)));
    }
    
    model.addAttribute("result", buf.toString());
    
    return "/gugudan.jsp";
  }
  
  @RequestMapping("/gugudan3")
  public String service3(
      @RequestParam("dan") int dan, 
      Model model) throws Exception {
    
    StringBuffer buf = new StringBuffer();
    for (int i = 1; i <= 9; i++) {
      buf.append(String.format("%d x %d = %d<br>\n", dan, i, (dan * i)));
    }
    
    model.addAttribute("result", buf.toString());
    
    return "/gugudan.jsp";
  }
  
  @RequestMapping("/gugudan4")
  public String service4(
      @RequestParam(value="dan", defaultValue="2") int dan, 
      Model model) throws Exception {
    
    StringBuffer buf = new StringBuffer();
    for (int i = 1; i <= 9; i++) {
      buf.append(String.format("%d x %d = %d<br>\n", dan, i, (dan * i)));
    }
    
    model.addAttribute("result", buf.toString());
    
    return "/gugudan.jsp";
  }
  
  @RequestMapping("/gugudan5")
  public String service5(int dan, Model model) throws Exception {
    
    StringBuffer buf = new StringBuffer();
    for (int i = 1; i <= 9; i++) {
      buf.append(String.format("%d x %d = %d<br>\n", dan, i, (dan * i)));
    }
    
    model.addAttribute("result", buf.toString());
    
    return "/gugudan.jsp";
  }

}





