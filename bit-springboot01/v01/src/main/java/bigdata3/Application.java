/* 스프링 부트 실행과 배포: 
 * [스프링 부트의 프로젝트 폴더 구조]
 * ${프로젝트폴더}/src/main
 *    /java     <== 자바 클래스 소스를 두는 폴더
 *    /resources <== 기타 설정파일을 두는 폴더
 *    /resources/static <== 정적 웹자원(.html, .css, .js, .gif 등)을 두는 폴더
 * ${프로젝트폴더}/src/test
 *    /java     <== 테스트 관련 자바 클래스 소스를 두는 폴더
 *    /resources <== 테스트 관련 설정 파일을 두는 폴더
 * ${프로젝트폴더}/build.gradle
 * 
 * [스프링 부트 실행하기]
 * - 실행 명령
 *   ${프로젝트폴더}> gradle bootRun 
 * 
 * - 구동 원리
 *   => build.gradle에 선언된 라이브러리를 다운로드 받는다.
 *   => 이때 기본적으로 톰캣 서버(임베디드 버전)도 다운로드 받는다.
 *   => 현재 프로젝트에서 main() 메서드를 갖고 있는 클래스를 찾아 실행한다.
 *   => SpringApplication.run() 호출한다.
 *   => 임베디드 버전의 톰캣 서버를 실행한다.
 * 
 * 
 * [스프링 부트 배포하기]
 * 스프핑 부트 애플리케이션을 배포할 때 .jar 파일로 묶어 배포한다.
 * - jar 파일 생성
 *   ${프로젝트폴더}> gradle bootJar
 *   => ${프로젝트폴더}/build/libs/xxxxx.jar 파일이 생성된다.
 * - jar 파일 실행
 *   > java -jar xxx.jar
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