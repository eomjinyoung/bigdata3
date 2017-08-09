package bigdata3.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bigdata3.service.TeacherService;

@Controller
public class TeacherDeleteControl {
  @Autowired TeacherService teacherService;
  
  @RequestMapping("/teacher/delete")
  public String service(int no) throws Exception {
    teacherService.remove(no);
    return "redirect:list.do";
  }
}









