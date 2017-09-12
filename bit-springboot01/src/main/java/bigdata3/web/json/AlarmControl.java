package bigdata3.web.json;


import static bigdata3.web.json.JsonResult.*;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bigdata3.domain.IoTUser;
import bigdata3.service.IoTUserService;

@RestController("json.AlarmControl")
@RequestMapping("/alarm/json")
public class AlarmControl {
  
  @Autowired ServletContext application;
  
  @Autowired IoTUserService userService;
  
  @RequestMapping("change/{email}/{serialId:[\\.\\w]+}")
  public Object change(
      @PathVariable String email, 
      @PathVariable String serialId,
      @RequestParam String message) throws Exception {
        
    //=> email 사용자의 토큰 값을 가져온다.
    IoTUser user = userService.get(email);
    
    if (user == null) {
      new JsonResult(STATE_FAIL, "등록되지 않은 이메일입니다.");
    }
    
    if (user.getToken() == null) {
      new JsonResult(STATE_FAIL, "사용자의 토큰 값이 유효하지 않습니다.");
    }
    
    //=> FCM 서버에게 알림 메시지를 보낸다.
    
    return new JsonResult(STATE_SUCCESS, email + "," + serialId + "," + message);
  }
  
 
}


/* 사용법
[센서의 입력 값이 변경되었을 때]
=> http://localhost:8080/alarm/json/change/이메일/제품번호?message=내용
 */








