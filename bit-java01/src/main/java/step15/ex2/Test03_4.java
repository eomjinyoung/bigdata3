/* static nested class 응용 II - static nested class의 사용 예
 * => Map을 다룰 때 key/value 값을 저장하는 클래스 Entry를 사용하였다.
 *    바로 Entry 클래스가 Map의 static nested class이다.
 */
package step15.ex2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry; // static nested class를 import 한다.
import java.util.Set;

public class Test03_4 {
  public static void main(String[] args) {
    HashMap map = new HashMap();
    map.put(100, "홍길동");
    map.put(101, "임꺽정");
    map.put(102, "유관순");
    
    Set entrySet = map.entrySet();
    Iterator iterator = entrySet.iterator();
    
    while (iterator.hasNext()) {
      // 다음과 같이 Entry 클래스는 Map에 내장된 클래스이다.
      //Map.Entry entry = (Map.Entry)iterator.next();

      // 물론 import를 한다면 위와 같이 Map을 적을 필요가 없다.
      Entry entry = (Entry)iterator.next();
      
      System.out.printf("%s=%s\n", entry.getKey(), entry.getValue());
    }
  }
}







