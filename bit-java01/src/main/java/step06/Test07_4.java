/* import 와 클래스 이름 중복
 * => 패키지는 다르지만 클래스 이름이 같은 경우
 */
package step06;

import java.util.Date;
//import java.sql.Date; // 컴파일 오류! 이름이 같은 클래스를 동시에 import 할 수 없다.

public class Test07_4 {

  public static void main(String[] args) throws Exception {
    Date d;
  }

}
