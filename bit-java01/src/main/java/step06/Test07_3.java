/* import 와 와일드 카드(*)
 * => 같은 패키지의 클래스를 여러 개 사용할 때는 와일드카드(*)를 이용하여 
 *    한 개의 import 만 작성할 수 있다.  
 *    import 패키지명.*; 
 */
package step06;

/*
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
*/

// 위의 import 문을 다음과 같이 한 줄로 작성할 수 있다.
// => 즉 컴파일러에게 클래스를 찾을 때 java.io 패키지를 다 뒤지라는 명령이다.
// => 하지만, 가능한 위와 같이 클래스마다 각각의 import 문을 작성하는 것이 좋다!
//    왜? 각각의 클래스가 어떤 패키지 있는지 한 번에 알아볼 수 있기 때문이다.
//       위의 방식이 유지보수에 오히려 도움이 된다.
import java.io.*;

public class Test07_3 {

  public static void main(String[] args) throws Exception {
    File f;
    FileReader in;
    FileWriter out;
    BufferedReader in2;
    
  }

}
