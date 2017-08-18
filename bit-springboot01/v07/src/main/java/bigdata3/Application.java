/* 기타 객체 생성하기 II
 * - 페이지 컨트롤러에서 사용할 기타 객체를 생성하는 방법
 *   => XML 설정
 *      외부에 스프링 관련 빈 설정 XML 파일을 만든다.
 *      @ImportResource 애노테이션을 이용하려 불러온다.
 *      
 *   => 애노테이션을 이용한 설정 
 *      @Bean 애노테이션을 이용하여 메서드에서 해당 객체를 리턴한다.
 *      
 * - 이 애노테이션을 사용하는 클래스에는 반드시 @Configuration 애노테이션을 붙여야 한다.
 *   왜? 스프링 프레임워크에게 다음을 알려주기 위함이다.
 *   "이 클래스에는 스프링 설정 정보를 포함하고 있습니다.
 *    그러니 이 클래스에 선언된 애노테이션을 잘분석하여 처리하세요!" 
 *    
 * - 자바 코드에서 직접 DataSource  객체를 만들 때 
 *   DBMS의 연결 정보를 지정해야 한다.
 *   방법1) 메서드를 호출하여 지정할 수 있고
 *   방법2) 스프링 부트 환경 변수를 사용하여 지정할 수 있다.
 *   
 * - 스프링 환경변수?
 *   루트 패키지에 application.properties 라는 이름의 파일에 등록한 변수이다.
 *   스프링 부트는 실행할 때 이 파일을 찾아서 그 내용을 메모리에 로딩된다.
 *    
 */

package bigdata3;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

  @Bean // 스프링 프레임워크는 @Bean이 붙은 메서드를 자동으로 호출한다.
        // 메서드가 리턴한 객체를 Spring IoC 컨테이너에 보관한다.
        // DataSource 객체가 생성되었는지 확인하려면, TestController를 실행하라!
  @ConfigurationProperties("app.datasource")
  public DataSource dataSource() {
    System.out.println("===============> dataSource() 호출됨!"); 
    return DataSourceBuilder.create().build();
  }
 
  public static void main(String[] args) throws Exception {
    SpringApplication.run(Application.class, args);
  }

}