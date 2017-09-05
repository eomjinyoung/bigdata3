package bigdata3.web.json;


import static bigdata3.web.json.JsonResult.*;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("json.ArduinoControl")
@RequestMapping("/arduino/json")
public class ArduinoControl {
  @Autowired ServletContext application;
  
  @RequestMapping("getLED")
  public Object getLED() throws Exception {
    String state = (String) application.getAttribute("led.state");
    if (state == null) {
      state = "off";
      application.setAttribute("led.state", state);
    }
    return new JsonResult(STATE_SUCCESS, state);
  }
  
  @RequestMapping("setLED/{state}")
  public Object setLED(@PathVariable String state) throws Exception {
    if (state.equals("on") || state.equals("off")) {
      application.setAttribute("led.state", state);
      return new JsonResult(STATE_SUCCESS, state);
      
    } else {
      return new JsonResult(STATE_FAIL, state);
    }
  }
}









