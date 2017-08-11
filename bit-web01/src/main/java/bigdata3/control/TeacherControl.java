package bigdata3.control;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import bigdata3.domain.Teacher;
import bigdata3.service.TeacherService;

@Controller
@RequestMapping("/teacher")
public class TeacherControl {
  @Autowired TeacherService teacherService;
  @Autowired ServletContext servletContext;
  
  @RequestMapping("add")
  public String add(
      Teacher teacher, 
      MultipartFile[] photo) throws Exception {
    ArrayList<String> photoList = new ArrayList<>();
    for (MultipartFile fileItem : photo) {
      if (fileItem.getSize() > 0) { // 파일이 업로드 된 경우
        File file = new File(servletContext.getRealPath(
            "/teacher/photo/" + fileItem.getOriginalFilename()));
        fileItem.transferTo(file);
        photoList.add(fileItem.getOriginalFilename());
      }
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
  public String list(
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="5") int pageSize,
      Model model) throws Exception {
    
    List<Teacher> list = teacherService.list(pageNo, pageSize);
    model.addAttribute("list", list);
    
    return "teacher/list";
  }
  
  @RequestMapping("update")
  public String update(
      Teacher teacher, 
      MultipartFile[] photo) throws Exception {
    ArrayList<String> photoList = new ArrayList<>();
    for (MultipartFile fileItem : photo) {
      if (fileItem.getSize() > 0) { // 파일이 업로드 된 경우
        File file = new File(servletContext.getRealPath(
            "/teacher/photo/" + fileItem.getOriginalFilename()));
        fileItem.transferTo(file);
        photoList.add(fileItem.getOriginalFilename());
      }
    }
    teacher.setPhotoList(photoList); // 업로드 한 사진 파일명을 저장한다.
    teacherService.update(teacher);
    return "redirect:list.do";
  }
}









