package bigdata3.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bigdata3.service.TeacherService;

public class TeacherDeleteControl implements Controller {
  TeacherService teacherService;
  
  public void setTeacherService(TeacherService teacherService) {
    this.teacherService = teacherService;
  }
  
  @Override
  public String service(HttpServletRequest req, HttpServletResponse res) throws Exception {
    int no = Integer.parseInt(req.getParameter("no"));
    teacherService.remove(no);
    return "redirect:list.do";
  }
}









