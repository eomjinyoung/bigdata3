/* import
 * => 코딩 할 때마다 패키지명을 적는다면 매우 불편하다.
 *    그래서 자바는 import 라는 명령을 제공하는 것이다.
 *    클래스 선언 위에, package 선언 아래에 다음과 같이 작성하면,
 *    클래스를 사용할 때 마다 매번 패키지명을 적을 필요가 없다. 
 *    import 패키지명.클래스명; 
 */
package step06;

// import 명령은 컴파일러에게 클래스가 어떤 패키지에 있는지 알려주는 용도이다.
// 따라서 컴파일 한 후에는 주석처럼 제거된다.
// 그러니 import 문장이 많이 있다고 걱정하지 말라!
// import 문장은 바이트코드로 만들어지지 않는다. 제거된다.
import java.lang.reflect.Method;
import java.net.Socket;
import java.io.File;

public class Test07_2 {

  public static void main(String[] args) throws Exception {
    Method obj3;
    
    Socket obj5;
    obj5 = new Socket("localhost", 8080);
    
    File obj6;
    obj6 = new File("test.txt");
  }

}
