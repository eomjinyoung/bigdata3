package bigdata3.web.json;

import static bigdata3.web.json.JsonResult.STATE_SUCCESS;

import java.util.ArrayList;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import bigdata3.domain.Teacher;
import bigdata3.service.FileUploadService;
import bigdata3.service.TeacherService;

@RestController("json.TeacherControl")
@RequestMapping("/teacher/json")
public class TeacherControl {
  
  @Autowired TeacherService teacherService;
  @Autowired ServletContext servletContext;
  @Autowired FileUploadService fileUploadService;
  
  @RequestMapping("add")
  public String add(
      Teacher teacher, 
      MultipartFile[] photo) throws Exception {
    ArrayList<String> photoList = new ArrayList<>();
    for (MultipartFile fileItem : photo) {
      String filename = fileUploadService.save(fileItem);
      if (filename == null) continue;
      photoList.add(filename);
    }
    teacher.setPhotoList(photoList);
    teacherService.add(teacher);
    return "redirect:list.do";
  }
  
  @RequestMapping("delete")
  public String delete(int no) throws Exception {
    teacherService.remove(no);
    return "redirect:list.do";
  }  

  @RequestMapping("detail")
  public String detail(int no, Model model) throws Exception {
    Teacher teacher = teacherService.get(no);
    if (teacher == null) {
      throw new Exception(no + "번 강사가 없습니다.");
    }
    model.addAttribute("teacher", teacher);
    return "teacher/detail";
  }

  @RequestMapping("list")
  public Object list(
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="5") int pageSize) throws Exception {
    
    return new JsonResult(STATE_SUCCESS, 
                          teacherService.list(pageNo, pageSize));
  }
  
  @RequestMapping("update")
  public String update(
      Teacher teacher, 
      MultipartFile[] photo) throws Exception {
    ArrayList<String> photoList = new ArrayList<>();
    for (MultipartFile fileItem : photo) {
      String filename = fileUploadService.save(fileItem);
      if (filename == null) continue;
      photoList.add(filename);
    }
    teacher.setPhotoList(photoList); // 업로드 한 사진 파일명을 저장한다.
    teacherService.update(teacher);
    return "redirect:list.do";
  }
}









