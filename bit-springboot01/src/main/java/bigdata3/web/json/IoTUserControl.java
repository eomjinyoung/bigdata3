package bigdata3.web.json;


import static bigdata3.web.json.JsonResult.*;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bigdata3.domain.IoTUser;

@RestController("json.IoTUserControl")
@RequestMapping("/user/json")
public class IoTUserControl {
  @Autowired ServletContext application;
  
  //@RequestMapping(path="add", method=RequestMethod.POST)
  @GetMapping("add") //=> 위 애노테이션의 단축 표현 
  public Object add(String email, String password, String token) throws Exception {
    
    //=> IoT 사용자 목록을 준비한다.
    @SuppressWarnings("unchecked") 
    List<IoTUser> users = (List<IoTUser>) application.getAttribute("users");
    
    //=> 만약 사용자 목록이 없다면,
    if (users == null) { 
      users = new ArrayList<>(); // 새로 만들고
      application.setAttribute("users", users); // 보관소에 저장한다.
    }
    
    IoTUser user = new IoTUser(email, password, token);
    users.add(user);
    
    return new JsonResult(STATE_SUCCESS, null);
    
  }
  
  @GetMapping("get")
  public Object get(String email) {
    @SuppressWarnings("unchecked") 
    List<IoTUser> users = (List<IoTUser>) application.getAttribute("users");
    
    if (users == null) { 
      users = new ArrayList<>(); // 새로 만들고
      application.setAttribute("users", users); // 보관소에 저장한다.
      return new JsonResult(STATE_FAIL, "해당 사용자를 찾을 수 없습니다.");
    }
    
    for (IoTUser user : users) {
      if (user.getEmail().equals(email)) {
        return new JsonResult(STATE_SUCCESS, user);
      }
    }
    return new JsonResult(STATE_FAIL, "해당 사용자를 찾을 수 없습니다.");
  }
  
}









