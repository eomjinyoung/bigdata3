package bigdata3.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import bigdata3.domain.Teacher;
import bigdata3.service.TeacherService;

@Controller
public class TeacherDetailControl {
  @Autowired TeacherService teacherService;
  
  @RequestMapping("/teacher/detail")
  public String service(int no, Model model) throws Exception {

    Teacher teacher = teacherService.get(no);
    if (teacher == null) {
      throw new Exception(no + "번 강사가 없습니다.");
    }
    
    model.addAttribute("teacher", teacher);
    
    return "/teacher/detail.jsp";
  }
}









