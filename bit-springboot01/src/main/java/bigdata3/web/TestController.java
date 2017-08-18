package bigdata3.web;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  @Autowired DataSource dataSource;
  
  @RequestMapping("/test1")
  public String test1() {
    try (Connection con = dataSource.getConnection();) {
      return "ok!";
      
    } catch (Exception e) {
      StringWriter out = new StringWriter(); // 문자열을 출력하는 도구. 출력한 문자열을 보관.
      PrintWriter out2 = new PrintWriter(out); // 
      e.printStackTrace(out2);
      return out.toString(); // StringWriter에 보관된 내용을 꺼내 리턴한다.
    }
  }
}
