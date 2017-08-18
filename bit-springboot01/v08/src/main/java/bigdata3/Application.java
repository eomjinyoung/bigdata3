/* @SpringBootApplication 
 * - = @Configuration @EnableAutoConfiguration @ComponentScan 
 *    
 */

package bigdata3;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement // 트랜잭션 관리 객체 생성 
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