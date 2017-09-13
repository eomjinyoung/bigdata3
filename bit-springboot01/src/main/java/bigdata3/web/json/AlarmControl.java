package bigdata3.web.json;


import static bigdata3.web.json.JsonResult.STATE_FAIL;
import static bigdata3.web.json.JsonResult.STATE_SUCCESS;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bigdata3.domain.IoTDevice;
import bigdata3.domain.IoTUser;
import bigdata3.service.IoTDeviceService;
import bigdata3.service.IoTUserService;
import bigdata3.util.FcmAgent;
import bigdata3.util.FcmMessage;

@RestController("json.AlarmControl")
@RequestMapping("/alarm/json")
public class AlarmControl {
  
  @Autowired ServletContext application;
  
  @Autowired IoTUserService userService;
  
  @Autowired IoTDeviceService deviceService;
  
  @Autowired FcmAgent fcmAgent;
    
  @RequestMapping("change/{serialNo:[\\.\\w]+}")
  public Object change(
      @PathVariable String serialNo,
      @RequestParam String message) throws Exception {
    
    //=> 제품 번호를 이용하여 장비 정보를 가져온다.
    IoTDevice device = deviceService.get(serialNo);

    //=> 장비가 등록되어 있지 않다면,
    if (device == null) {
      return new JsonResult(STATE_FAIL, "등록되지 않은 장비입니다.");
    }
    
    //=> 장비의 주인이 등록되어 있지 않다면,
    if (device.getUserNo() < 1) {
      return new JsonResult(STATE_FAIL, "장비의 사용자가 설정되지 않았습니다.");
    }
    
    //=> 장비의 사용자 정보를 가져온다.
    IoTUser user = userService.get(device.getUserNo());
    
    //=> 사용자의 토큰 정보가 없으면,
    if (user.getToken() == null) {
      new JsonResult(STATE_FAIL, 
          "사용자의 토큰 값이 유효하지 않습니다. 앱으로 다시 로그인 하거나, "
          + "앱을 다시 설치하여 로그인 하시기 바랍니다.");
    }
    
    //=> FCM 서버에게 알림 메시지를 보낸다.
    String result = fcmAgent.send(new FcmMessage(
        user.getToken(), //=> to
        message, //=> message 
        "IoT 경고", //=> title
        "감지장치(" + serialNo + ")에 변화가 발생했습니다.")); //=> text
    
    return new JsonResult(STATE_SUCCESS, result);
  }
  
 
}


/* 사용법
[센서의 입력 값이 변경되었을 때]
=> http://localhost:8080/alarm/json/change/제품번호?message=내용
 */








