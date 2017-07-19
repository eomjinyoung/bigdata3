/* 인스턴스 목록 다루기 : Java Collection API - Map 사용하기 VII
 * => Wrapper 객체를 key로 사용하기
 *           
 */
package step14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Test05_14 {
  
  public static void main(String[] args) {
    HashMap map = new HashMap();
    
    // key는 반드시 객체여야 한다.
    // 그런데 다음 코드를 보면 정수 값이다.
    // 컴파일 오류가 발생하지 않는 이유는?
    // => auto-boxing 때문이다.
    // => 즉 정수 100을 주면 컴파일러는 내부적으로 100 대신 new Integer(100)으로 대체한다.
    map.put(100, "홍길동"); // map.put(new Integer(100), "홍길동");
    map.put(101, "임꺽정");
    map.put(101, "유관순");
    
    
    // 꺼낼 때도 똑 같다. 정수 값을 주면 내부적으로 auto-boxing을 수행한다.
    String name = (String)map.get(100); // map.get(new Integer(100));
    
    System.out.println(name);
    
    
  }
}












