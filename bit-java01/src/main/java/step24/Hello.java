/* 웹 애플리케이션과 서블릿(Servlet)
 * => Java는 웹 애플리케이션을 실행하는데 필요한 라이브러리를 제공한다.
 *    또한 웹 애플리케이션과 그 애플리케이션을 실행하는 서버를 만드는 규칙과 기술을 미리 정해 놓았다.
 *    그 기술의 이름이 "서블릿(Servlet)"이다.
 * => 웹 애플리케이션을 만드는 개발자들은 이 서블릿 규칙에 따라 프로그램을 작성해야 하고,
 *    서버를 만드는 개발들도 이 서블릿 규칙에 따라 실행하도록 프로그램을 작성해야 한다.
 *    즉 양쪽 모두가 서블릿 규칙에 따라 프로그램을 작성해야 한다.
 * => 이렇게 양쪽 모두를 위한 규칙을 정의한 이유는?
 *    - 서버 프로그램을 "오라클" 회사에서만 독점적으로 만드는 것이 아니라
 *      누구든지 경쟁적으로 더 좋은 성능의 서버를 만들도록 개방한 것이다.
 *    - 웹 애플리케이션도 서블릿 규칙에 따라 만들었으면 
 *      어떤 서버에서도 실행시킬 수 있다. 
 * 
 * 서블릿 컨테이너(Servlet Container)
 * => 바로 이 서블릿 규칙에 따라 만든 서버 프로그램.
 * => 서블릿 규칙에 따라 만든 웹 애플리케이션을 실행하는 일을 한다.
 * => 웹서버와 연동하여 작업을 수행한다.
 * => 대표적인 제품: Tomcat, Jetty, Resin 등이 있다.
 * 
 * 서블릿(Servlet)
 * => 서블릿 컨테이이너가 실행하는 자바 객체이다.
 * => 서블릿 규칙에 따라 만든다.
 * => 웹애플리케이션의 전체 기능 중에서 부분 기능을 담당한다.
 * 
 * 웹 애플리케이션(Web Application)
 * => 여러 개의 서블릿, 필터, 리스너 등으로 구성된 애플리케이션이다.
 * => 서블릿 컨테이너가 관리한다.
 * 
 * Java EE(Enterprise Endition)
 * => 기업에서 사용하는 서버 애플리케이션을 만드는 기술이다.
 * => 서블릿 및 분산 객체, 웹 서비스 등의 기업용(엔터프라이즈) 기술을 포함하고 있다.
 * => 즉 서블릿은 Java EE의 부분 기술이다.
 * 
 * 웹 애플리케이션 서버(Web Application Server; WAS)
 * => Java EE의 모든 기술을 구현한 서버 프로그램이다.
 * => 서블릿 컨테이너, EJB 컨테이너 등 특정 기술에 따라 만든 객체를 관리하는 프로그램을 포함하고 있다.
 *    즉 서블릿 컨테이너는 WAS의 부속품이다.
 * => "Java EE 구현체(implementations)"라고 부른다.
 * => 대표적인 제품: JBoss, WebLogic, WebShpere, JEUS, Geronemo, GlashFish 등이 있다.
 *  
 * 서블릿 클래스 만들기
 * => javax.servlet.Servlet 인터페이스를 구현해야 한다.
 * => Servlet API 라이브러리 준비
 *    - 실행할 때는 서블릿 컨테이너(예: 톰캣서버)가 갖고 있기 때문에 따로 라이브러리가 필요없지만,
 *      문제는 개발하는 동안 이 라이브러리가 있어야만 컴파일 할 수 있다.
 *    - 그래서 Servlet API 라이브러리를 다운로드 받아야 한다.
 *    1) mvnrepository.com 에서 servlet api 검색한다.
 *    2) build.gradle 파일의 dependencies {} 블록에 복사해 넣어라.
 *       또한 웹 관련 설정 파일을 다룰 Gradle 플러그인을 추가해야 한다.
 *       apply plugin: 'war'
 *    3) 명령창에서 "gradle eclipse" 명령을 실행하여 이클립스 관련 설정 파일을 갱신한다. 
 *    4) 프로젝트를 "refresh" 한다.
 * => @WebServlet 애노테이션을 붙인다.
 * 
 * 서버에 서블릿 클래스를 배포하기
 * => 당장 새로 웹 애플리케이션을 만들지 말고 톰캣 서버에 존재하는 웹 애플리케이션에 배치해보자! 
 * => 톰캣홈\webapps\examples\WEB-INF\classes 디렉토리 밑에 
 *    step24 폴더를 만든다.
 *    그리고 step24 폴더 안에 Hello.class 파일을 둔다.
 * => 톰캣홈\webapps\examples\WEB-INF\web.xml 파일에서 다음 태그의 속성 값을 변경하라.
 *    <web-app 
 *     ...
       metadata-complete="false"> 
 *    
 * 톰캣 서버 실행
 * => 톰캣홈\bin\startup.bat 파일을 실행한다.
 * 
 * Hello 서블릿 클래스 실행하기
 * => 웹 브라우저 주소 창에 다음과 같이 입력하여 Hello 클래스를 실행한다.
 *    http://localhost:8080/examples/hello
 */
package step24;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/hello")
public class Hello implements Servlet {

  @Override
  public void init(ServletConfig config) throws ServletException {
    System.out.println("init()");
  }

  @Override
  public ServletConfig getServletConfig() {
    System.out.println("getServletConfig()");
    return null;
  }

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    System.out.println("service()");
    
    PrintWriter out = res.getWriter();
    out.println("<html>");
    out.println("<body>");
    out.println("<h1>Hello</h1>");
    out.println("</body>");
    out.println("</html>");
  }

  @Override
  public String getServletInfo() {
    System.out.println("getServletInfo()");
    return null;
  }

  @Override
  public void destroy() {
    System.out.println("destroy()");
    
  }

}









