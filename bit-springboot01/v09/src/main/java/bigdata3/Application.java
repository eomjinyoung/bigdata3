/* mybatis를 이용한 DAO 객체 준비
 * - mybatis-spring-boot-starter 의존 라이브러리 추가
 *   => DataSource 객체 준비
 *   => 트랜잭션 관리 객체 준비
 *   
 * - DAO 관련 파일 준비 
 *   => DAO 인터페이스 준비
 *      bigdata3.domain.Xxx 클래스 
 *      bigdata3.dao.XxxDao 인터페이스
 *   => SQL 맵퍼 파일 준비
 *      /resources/bigdata3/dao/XxxDao.xml 파일
 *       
 * - Mybatis 설정 
 *   => bigdata3.domain 패키지에 있는 클래스들에 대해 별명을 자동 생성하기
 *      별명을 자동 생성하지 않으면 
 *      SQL 맵퍼 파일에서 그 클래스를 가리킬 때 전체 이름을 지정해야 하는 불편함이 있다. 
 *      mybatis.type-aliases-package=bigdata3.domain
 *   => bigdata3.dao 패키지에 있는 SQL 맵퍼 파일 위치 설정하기
 *      mybatis.mapper-locations=/bigdata3/dao/*Dao.xml
 *    
 * - SqlSessionFactory 객체 준비
 *   => mybatis-spring-boot-starter 스크립트에서 객체 생성을 준비한다.
 *      그래서 따로 객체를 준비하는 코드를 작성할 필요가 없다.
 *    
 * - DAO 인터페이스로부터 클래스를 자동 생성하는 도우미 객체 준비
 *   => @MapperScan 애노테이션을 붙인다. 
 *   
 * - Mybatis를 이용하여 DAO 객체를 준비했는지 확인하기?
 *   => TestController를 통하여 확인한다.
 */

package bigdata3;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement // 트랜잭션 관리 객체 생성 
@MapperScan("bigdata3.dao") // DAO 인터페이스로부터 클래스 자동 생성
public class Application {

  @Bean 
  @ConfigurationProperties("app.datasource")
  public DataSource dataSource() {
    return DataSourceBuilder.create().build();
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(Application.class, args);
  }

}