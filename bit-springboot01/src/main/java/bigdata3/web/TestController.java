package bigdata3.web;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  @Autowired DataSource dataSource;
  
  @RequestMapping("/test1")
  public String test1() throws Exception {
    Connection con = dataSource.getConnection();
    return "ok!";
  }
}
