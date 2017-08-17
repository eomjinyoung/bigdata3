/* 정적 웹자원(.html, .css, .js, .gif, .jpeg 등) 다루기
 * - 스프링 부트에서는 정적 웹자원을 찾을 때 다음 폴더에서 찾는다.
 *   => /static (=src/main/resources/static)
 *   => /public (=src/main/resources/public)
 *   => /resources
 *   => /META-INF/resources
 *   
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