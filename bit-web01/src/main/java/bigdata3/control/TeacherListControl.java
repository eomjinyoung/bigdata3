package bigdata3.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bigdata3.domain.Teacher;
import bigdata3.service.TeacherService;

@Controller
public class TeacherListControl {
  @Autowired public TeacherService teacherService;
  
  @RequestMapping("/teacher/list")
  public String service(
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="5") int pageSize,
      Model model) throws Exception {
    
    List<Teacher> list = teacherService.list(pageNo, pageSize);
    model.addAttribute("list", list);
    
    return "/teacher/list.jsp";
  }
}









