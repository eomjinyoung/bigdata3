/* import 와 클래스 이름 중복 II
 * => 패키지는 다르지만 클래스 이름이 같은 경우
 */
package step06;

import java.util.*;
import java.sql.*;

public class Test07_5 {

  public static void main(String[] args) throws Exception {
    //Date d; // 컴파일 오류! java.util.Date인지 java.sql.Date인지 판단할 수 없다.
    
    // 이런 경우는 어쩔수 없다. 무조건 전체 이름을 적어야 한다.
    java.util.Date d;
    java.sql.Date d2;
  }

}
