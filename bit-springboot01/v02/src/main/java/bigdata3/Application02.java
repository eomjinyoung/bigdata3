/* 스프링 부트 실행: 실행할 클래스 지정하기
 * - 스프링 부트를 실행할 때 패키지를 모두 뒤져서
 *   main() 메서드를 가진 클래스를 찾는다.
 *   그리고 그 클래스를 실행한다.
 * - 만약 main()를 갖는 클래스가 여러 개 있을 경우 
 *   어떤 클래스를 실행할지 결정할 수 없기 때문에
 *   실행 오류가 발생한다.
 *   
 * - 해결책?
 *   => 어떤 클래스를 실행해야 하는지 지정하면 된다.
 *   => build.gradle 파일에 설정을 추가하라!
bootRun {
  main = 'bigdata3.Application02'
}
 *   => "gradle bootRun" 명령을 실행할 때 사용할 메인 클래스를 지정한다.
 *     
 */

package bigdata3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class Application02 {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application02.class, args);
    }

}