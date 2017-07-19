/* 인스턴스 목록 다루기 : Java Collection API - Map 사용하기 V
 * => 사용자가 만든 클래스를 key로 사용하기
 * => key 특징
 *    - 인스턴스가 다르더라도 값이 같다면 같은 key로 취급되어야 한다.
 *    - 그럴려면 key로 사용할 클래스는 반드시 hashCode()와 equals()를 오버라이딩 해야 한다.
 *    - 만약 오버라이딩 하지 않는다면, 같은 값을 갖고 있어도 다른 key로 간주될 것이다.
 *      즉 key로 사용할 수 없다는 뜻이다.
 *           
 */
package step14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Test05_12 {
  
  static class MyKey {
    String name;
    String no;
    
    public MyKey(String name, String no) {
      super();
      this.name = name;
      this.no = no;
    }

    @Override
    public String toString() {
      return "MyKey [name=" + name + ", no=" + no + "]";
    }
  }
  
  public static void main(String[] args) {
    MyKey k1 = new MyKey("한라산", "100");
    MyKey k2 = new MyKey("한라산", "100");
    
    HashMap map = new HashMap();
    
    map.put(k1, "홍길동");
    
    System.out.println(map.get(k1));
    
  }
}












