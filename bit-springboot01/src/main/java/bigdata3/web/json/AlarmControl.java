package bigdata3.web.json;


import static bigdata3.web.json.JsonResult.STATE_SUCCESS;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("json.AlarmControl")
@RequestMapping("/alarm/json")
public class AlarmControl {
  @Autowired ServletContext application;
  
  @RequestMapping("change/{email}/{serialId}")
  public Object change(
      @PathVariable String email, 
      @PathVariable String serialId,
      @RequestParam String message) throws Exception {
        
    return new JsonResult(STATE_SUCCESS, email + "," + serialId + "," + message);
  }
  
 
}


/* 사용법
[센서의 입력 값이 변경되었을 때]
=> http://localhost:8080/alarm/json/change/이메일/제품번호?message=내용
 */








