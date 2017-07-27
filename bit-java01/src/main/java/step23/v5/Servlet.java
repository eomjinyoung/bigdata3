package step23.v5;

import java.io.PrintWriter;
import java.util.Map;

public interface Servlet {
  // service() 
  // => 웹브라우저 요청을 처리하기 위해 MyWebServer가 호출하는 메서드
  // paramMap 파라미터
  // => 웹브라우저가 보낸 데이터를 보관하고 있는 맵 객체
  // out 파라미터
  // => 웹브라우저에게 출력할 때 사용하는 객체
  void service(Map<String,String> paramMap, PrintWriter out) throws Exception;
}
