/* 기타 객체 생성하기
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
 */

package bigdata3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@ImportResource("classpath:/bigdata3/application-context.xml")
// application-context.xml에서 DataSource와 트랜잭션 매니저 객체를 생성해야 하기 때문에
// spring-boot-starter-jdbc 라이브러리를 가져오거나
// 또는 mybatis-spring-boot-starter 라이브러리를 가져와야 한다.
// 왜? DataSource  객체를 생성하려면 spring-jdbc 라이브러리가 있어야 하기 때문이다.
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}