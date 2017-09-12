package bigdata3.web.json;


import static bigdata3.web.json.JsonResult.STATE_FAIL;
import static bigdata3.web.json.JsonResult.STATE_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bigdata3.domain.IoTUser;

@RestController("json.IoTUserControl")
@RequestMapping("/user/json")
public class IoTUserControl {
  @Autowired ServletContext application;
  
  //@RequestMapping(path="add", method=RequestMethod.POST)
  //@PostMapping("add") //=> 위 애노테이션의 단축 표현 
  @RequestMapping(path="add") //=> 테스트 할 때는 GET/POST 모두 가능하게 하자!
  public Object add(String email, String password, String token) throws Exception {
    
    //=> IoT 사용자 목록을 준비한다.
    @SuppressWarnings("unchecked") 
    List<IoTUser> users = (List<IoTUser>) application.getAttribute("users");
    
    //=> 만약 사용자 목록이 없다면,
    if (users == null) { 
      users = new ArrayList<>(); // 새로 만들고
      application.setAttribute("users", users); // 보관소에 저장한다.
    }
    
    //=> 기존에 같은 이메일의 사용자가 등록되어 있다면 제거한다.
    for (IoTUser user : users) {
      if (user.getEmail().equals(email)) {
        users.remove(user);
      }
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
  
  //@GetMapping("login")
  @RequestMapping("login")
  public Object login(String email, String password, String token) {
    @SuppressWarnings("unchecked") 
    List<IoTUser> users = (List<IoTUser>) application.getAttribute("users");
    
    if (users == null) { 
      users = new ArrayList<>(); // 새로 만들고
      application.setAttribute("users", users); // 보관소에 저장한다.
      return new JsonResult(STATE_FAIL, "해당 사용자를 찾을 수 없습니다.");
    }
    
    for (IoTUser user : users) {
      if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
        user.setToken(token); // 로그인 성공하면 토큰 값을 갱신한다.
        return new JsonResult(STATE_SUCCESS, "로그인 성공!");
      }
    }
    return new JsonResult(STATE_FAIL, "해당 사용자를 찾을 수 없습니다.");
  }
  
}

/*
[사용자 등록]
http://localhost:8080/user/json/add?email=user6@test.com&password=1111&token=0000

[사용자 조회]
http://localhost:8080/user/json/get?email=user6@test.com

[사용자 로그인]
http://localhost:8080/user/json/login?email=user6@test.com&password=1111&token=1234

 */









