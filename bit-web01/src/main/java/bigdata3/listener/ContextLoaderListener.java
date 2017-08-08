package bigdata3.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@WebListener
public class ContextLoaderListener implements ServletContextListener {
  @Override
  public void contextInitialized(ServletContextEvent sce) {
    try {
      ServletContext sc = sce.getServletContext();

      // 1) Spring IoC 컨테이너 객체 생성
      // => Spring IoC 컨테이너는 지정한 경로의 파일을 읽어서 객체를 준비한다.
      // => 기준 경로는 /WEB-INF/classes 이다.
      ApplicationContext appCtx = new ClassPathXmlApplicationContext(
          "bigdata3/application-context.xml");
      
      // 2) 프론트 컨트롤러에서 Spring IoC 컨테이너를 사용할 수 있도록 
      //    ServletContext 보관소에 저장한다.
      sc.setAttribute("beanContainer", appCtx);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
  }

}
