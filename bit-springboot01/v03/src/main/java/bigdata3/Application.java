/* 스프링 부트 라이브러리 
 * - 스프링 프레임워크를 사용하여 애플리케이션을 개발하려면 
 *   그에 맞는 라이브러리를 포함해야 한다.
 * - 스프링 부트에서는 의존 라이브러리를 쉽게 관리할 수 있도록 
 *   애플리케이션에 타입에 따라 필요한 라이브러리를 미리 정의해 두었다.
 *   개발자들은 그 라이브러리를 build.gradle 파일에 추가하면 된다.
 * - 애플리케이션에 포함할 라이브러리 정보를 설정한 파일을 
 *   "Starter"라 부른다.
 * - "스프링 부트 스타터"의 몇가지 예
 *   => spring-boot-starter-web : Spring WebMVC, RESTful, 톰캣 임베디트 서버 포함
 *   => spring-boot-starter-jdbc : JDBC 관련 라이브러리
 */

package bigdata3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}