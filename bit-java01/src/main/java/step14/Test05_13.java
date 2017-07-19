/* 인스턴스 목록 다루기 : Java Collection API - Map 사용하기 VI
 * => 사용자가 만든 클래스를 key로 사용하기
 * => key 특징
 *    - 인스턴스가 다르더라도 값이 같다면 같은 key로 취급되어야 한다.
 *    - 그럴려면 key로 사용할 클래스는 반드시 hashCode()와 equals()를 오버라이딩 해야 한다.
 *    - 만약 오버라이딩 하지 않는다면, 같은 값을 갖고 있어도 다른 key로 간주될 것이다.
 *      즉 key로 사용할 수 없다는 뜻이다.
 * => MyKey 클래스를 HashMap의 key로 사용하기 위해
 *    hashCode()와 equals()를 오버라이딩 한다.
 *           
 */
package step14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Test05_13 {
  
  static class MyKey {
    String name;
    String no;
    
    public MyKey(String name, String no) {
      super();
      this.name = name;
      this.no = no;
    }

    public String toString() {
      return "MyKey [name=" + name + ", no=" + no + "]";
    }

    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + ((no == null) ? 0 : no.hashCode());
      return result;
    }

    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      MyKey other = (MyKey) obj;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      if (no == null) {
        if (other.no != null)
          return false;
      } else if (!no.equals(other.no))
        return false;
      return true;
    }
    
    
  }
  
  public static void main(String[] args) {
    MyKey k1 = new MyKey("한라산", "100");
    MyKey k2 = new MyKey("한라산", "100");
    
    HashMap map = new HashMap();
    
    map.put(k1, "홍길동");
    
    System.out.println(map.get(k1));
    
    // 이제 MyKey 클래스가 hashCode()와 equals()를 오버라이딩 했기 때문에
    // 같은 값을 갖는 경우 같은 key로 판단할 것이다.
    System.out.println(map.get(k2)); 
    
  }
}












