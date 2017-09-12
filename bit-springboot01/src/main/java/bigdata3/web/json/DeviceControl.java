package bigdata3.web.json;


import static bigdata3.web.json.JsonResult.STATE_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bigdata3.domain.IoTDevice;

@RestController("json.DeviceControl")
@RequestMapping("/device/json")
public class DeviceControl {
  @Autowired ServletContext application;
  
  @RequestMapping("add/{email}/{serialId:[\\.\\w]+}")
  public Object add(@PathVariable String email, @PathVariable String serialId) throws Exception {
    //=> ServletContext 보관소에서 장비 목록을 꺼낸다.
    @SuppressWarnings("unchecked") // 컴파일러에게 경고를 무시할 것을 지정한다.
    List<IoTDevice> devices = (List<IoTDevice>) application.getAttribute("devices");
    
    //=> 만약 장비 목록이 없다면,
    if (devices == null) { 
      devices = new ArrayList<>(); // 새로 만들고
      application.setAttribute("devices", devices); // 보관소에 저장한다.
    }
    
    //=> 고객이 보낸 장비 데이터를 가지고 객체를 만든다.
    //   이때 각 장비의 등록 번호를 생성한다.
    long regNo = System.currentTimeMillis(); // 현재 밀리초를 등록 번호를 사용하자!
    IoTDevice iotDevice = new IoTDevice(regNo, email, serialId);
    
    //=> 고객 장비 정보를 저장한다.
    devices.add(iotDevice);
    
    return new JsonResult(STATE_SUCCESS, regNo);
    
  }
  
}









