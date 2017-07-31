/* 서블릿 만들기 : javax.servlet.HttpServlet 추상 클래스 II
 * => HttpServlet 을 상속 받아 서블릿 클래스를 만드는 이유는
 *    HttpServlet 클래스에 추가된 메서드를 이용하기 위함이다.
 *    이들 메서드에는 HTTP 프로토콜을 다루는 기능이 있다.
 *   
 */
package bigdata3.servlet.step1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/step1/test05") 
public class Test05 extends HttpServlet {
  // 개발자가 서블릿을 만들 때 HttpServlet을 상속 받아 만들기로 했다면,
  // 어떤 메서드를 오버라이딩 할 것인지 결정해야 한다.
  
  // 2) HttpServlet에 오버로딩 된 service() 메서드를 재정의 한다.
  //    => 기존의 service() 메서드와 차이점은 파라미터이다.
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    System.out.println("step1.Test05.service()");
    
    // 파라미터 HttpServletRequest와 HttpServletResponse에는 
    // 기존에 ServletRequest와 ServletResponse에 없던 기능이 들어 있다.
    
    // HTTP 요청 프로토콜에서 헤더 값 알아내기
    System.out.println(req.getHeader("User-Agent"));
    
    // 웹브라우저가 요청한 명령을 알아내기
    System.out.println(req.getMethod());
  }

}

/* Servlet 인터페이스
 * - init()
 * - service()
 * - destroy()
 * - getServletInfo()
 * - getServletConfig()
 * 
 * GenericServlet 추상클래스
 * - init() {...}
 * - service() <== 추상 메서드 
 * - destroy() {...}
 * - getServletInfo() {...}
 * - getServletConfig() {...}
 * 
 * HttpServlet 추상클래스
 * - service(ServletRequest, ServletResponse) {...}
 * - service(HttpServletRequest, HttpServletResponse) {...} // 오버로딩 메서드
 * - doGet(HttpServletRequest, HttpServletResponse) {...}
 * - doPost(HttpServletRequest, HttpServletResponse) {...}
 * - doHead(HttpServletRequest, HttpServletResponse) {...}
 * - doPut(HttpServletRequest, HttpServletResponse) {...}
 * - doDelete(HttpServletRequest, HttpServletResponse) {...}
 * ...
 */









