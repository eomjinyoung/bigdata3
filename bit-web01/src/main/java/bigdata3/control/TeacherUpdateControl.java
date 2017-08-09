package bigdata3.control;

import java.io.File;
import java.util.ArrayList;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import bigdata3.domain.Teacher;
import bigdata3.service.TeacherService;

@Controller
public class TeacherUpdateControl {
  @Autowired TeacherService teacherService;
  @Autowired ServletContext servletContext;
  
  @RequestMapping("/teacher/update")
  public String service(
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









