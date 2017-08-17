/* 동적 웹자원(페이지 컨트롤러) 다루기
 * - 페이지 컨트롤러를 만든 다음에 그 객체를 생성해야만 
 *   요청을 처리할 수 있다.
 * - 어떻게 페이지 컨트롤러 객체를 생성하는가?
 *   => XML 설정
 *      <context:component-scan base-package="패키지1,패키지2,..."/>
 *   => 애노테이션 설정
 *      @ComponentScan 애노테이션을 붙인다. 
 */

package bigdata3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@ComponentScan // 실행하는 클래스의 패키지부터 그 하위 패키지를 뒤져 
               // @Component 이 붙은 클래스를 찾아 객체를 만든다.
               // @Controller, @Service, @Repository, @RestController 모두 
               // @Component에 속해있다. 
               // 즉 이런 애노테이션이 붙은 클래스에 대해서도 객체를 만든다는 것이다.
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}