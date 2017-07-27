/* 웹 서버 만들기: 7단계
 * => 서블릿 클래스를 만들 때 마다 객체를 생성하여 서블릿 보관소에 저장하는 코드를 추가해야 한다.
 *    매우 불편하다. 
 *    자동화하고 싶다!
 * => 애노테이션을 이용하여 서블릿 클래스에 안에 URL 정보를 저장하라!
 *    그리고 MyWebServer는 서블릿 클래스 안에 있는 애노테이션을 꺼내 그 ULR을 사용하라!
 * => 작업
 *    1) 서블릿 URL 정보를 저장할 애노테이션을 만든다.
 *       - @WebServlet
 *    2) @WebServlet 애노테이션을 모든 서블릿 클래스에 적용하라!
 *       - Hello, Plus, Multiple 클래스
 *    3) MyWebServlet의 생성자가 호출될 때 @WebServlet이 붙은 클래스를 처리한다.
 *       - @WebServlet 애노테이션이 붙은 클래스를 찾아 객체를 생성한다.
 *       - @WebServlet 애노테이션의 값을 꺼내 그 값으로 객체를 맵에 보관한다.
 *        
 * => 특별 게스트 초대!
 *    - @WebServlet 애노테이션이 붙은 클래스를 우리가 직접 찾는다면 너무 많은 코딩을 해야 한다.
 *    - 그래서 그런 작업을 전문적으로 처리해주는 라이브러리를 사용하겠다.
 *    - 그 라이브러리 이름이 "Reflections"이다.
 *    1) mvnrepository.com 에서 "reflections"로 검색한다.
 *    2) Gradle 라이브러리 설정 정보를 복사한다.
 *    3) 현재 프로젝트의 build.gradle 파일에서 의존라이브러리 블록에 reflections 라이브러리 정보를 붙여 넣는다.
 *    4) 명령창에서 현재 프로젝트 폴더로 이동한 다음에 다음 명령을 실행하여 이클립스 설정 파일을 갱신한다.
 *       > gradle eclipse
 *       - 위 명령을 실행하면 build.gradle 파일에 설정한 외부 자바 라이브러리를 자동으로 다운로드 한다.
 *       - 그리고 이클립스 설정 파일을 갱신한다.
 *    5) 이클립스에서 프로젝트에 대해 "refresh" 명령을 수행하라!
 */
package step23.v7;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.reflections.Reflections;

public class MyWebServer {
  int port;
  HashMap<String,Servlet> servletMap = new HashMap<>();
  
  public MyWebServer(int port) throws Exception {
    this.port = port;
    
    // @WebServlet 애노테이션이 붙은 클래스를 찾아 객체를 생성하고 서블릿 보관소에 저장한다.
    // => 일단 어떤 패키지를 뒤질 것인지 설정한다.
    Reflections reflections = new Reflections("step23.v7");
    
    // => @WebServlet 애노테이션이 붙은 클래스 찾기.
    Set<Class<?>> servletTypes = 
        reflections.getTypesAnnotatedWith(WebServlet.class);

    for (Class<?> clazz : servletTypes) {
      // => 클래스에 붙은 WebServlet 애노테이션을 추출한다.
      WebServlet anno = clazz.getAnnotation(WebServlet.class);
      
      // => 클래스의 인스턴스를 생성한다.
      Servlet servlet = (Servlet)clazz.newInstance();
      
      // => URL 값으로 인스턴스를 서블릿 보관소에 저장한다.
      servletMap.put(anno.value(), servlet);
    }
  }

  private void processRequest(Socket socket) {
    try (
      Scanner in = new Scanner(socket.getInputStream());
      PrintWriter out = new PrintWriter(socket.getOutputStream());
    ) {
      boolean isRequestLine = true;
      String url = null; 
      String queryString = null; 

      while (true) {
        try {
          String line = in.nextLine();
          
          if (isRequestLine) {
            String requestUri = line.split(" ")[1]; 
            String[] values = requestUri.split("\\?"); 
            url = values[0]; // "/plus" 
            
            if (values.length > 1) { 
              queryString = values[1];
            }
            
            isRequestLine = false;
          }
          
          if (line.isEmpty())
            break;
        } catch (Exception e) {
          e.printStackTrace();
          break; 
        }
      }
      
      // 웹브라우저에 응답한다.
      out.println("HTTP/1.1 200 OK");
      out.println("Content-Type: text/html; charset=utf-8");
      out.println("Connection: close");
      out.println();

      Servlet servlet = servletMap.get(url); 
      
      if (servlet != null) {
        Map<String,String> paramMap = getRequestParameters(queryString);
        servlet.service(paramMap, out);
      } else { 
        responseError(out);
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  private Map<String,String> getRequestParameters(String queryString) {
    HashMap<String,String> paramMap = new HashMap<>();
        
    if (queryString == null)
      return paramMap;
    
    String[] params = queryString.split("&");
    for (String param : params) {
      String[] kv = param.split("=");
      paramMap.put(kv[0], kv[1]);
    }
    
    return paramMap;
  }
  
  private void responseError(PrintWriter out) throws Exception {
    out.println("<html><body><h1>해당 URL을 처리할 수 없습니다!</body></html>");
  }
  
  public void run() {
    try {
      ServerSocket ss = new ServerSocket(this.port);
      
      while (true) {
        Socket socket = ss.accept(); 
        processRequest(socket);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public static void main(String[] args) {
    try {
      MyWebServer webServer = new MyWebServer(80);
      System.out.println("웹서버 실행 중...");
      webServer.run();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}






