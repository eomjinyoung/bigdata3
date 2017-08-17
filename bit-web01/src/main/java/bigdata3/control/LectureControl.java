package bigdata3.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bigdata3.domain.Lecture;
import bigdata3.service.LectureService;
//aaaaaa
@Controller
@RequestMapping("/lecture") 
public class LectureControl {
	@Autowired LectureService lectureService;

	@RequestMapping("list")
	  public String list(
	      @RequestParam(defaultValue="1") int pageNo,
	      @RequestParam(defaultValue="10") int pageSize,
	      Model model) throws Exception {
	    
	    List<Lecture> list = lectureService.list(pageNo, pageSize);
	    model.addAttribute("list", list);
	    
	    return "lecture/list";
	  }
  @RequestMapping("form")
  public void form() throws Exception {
    
  }
	
	
  @RequestMapping("detail")
  public String detail(int no, Model model) throws Exception {
    Lecture lecture = lectureService.get(no);
    if (lecture == null) {
      throw new Exception(no + "번 강의가 없습니다.");
    }
    model.addAttribute("lecture", lecture);
    return "lecture/detail";
  } 
	
	@RequestMapping("delete")
  public String delete(int no) throws Exception {
    lectureService.remove(no);
    return "redirect:list.do";
  }
	 
	 @RequestMapping("add")
	  public String add( Lecture lecture) throws Exception {
	   lectureService.add(lecture);
	    return "redirect:list.do";
	  } 
	 
	  @RequestMapping("update")
	  public String update(Lecture lecture) throws Exception {
	    lectureService.update(lecture);
	    return "redirect:list.do";
	  }
	 
}
