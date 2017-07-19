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
    
    // 원본 key가 아니라 같은 값을 갖는 다른 key를 사용하여 값을 꺼내려 한다면?
    // => 안타깝게도 값을 찾지 못한다.
    // => 이유? HashMap은 k1과 k2가 같은 값을 갖고 있다고 판단하지 않는다.
    // => HashMap은 k1과 k2가 같은 값인지 아닌지 어떻게 판단하는가?
    //    hashCode()의 리턴 값과 equals()의 리턴값을 가지고 판단한다.
    //    MyKey 클래스는 hashCode()와 equals()를 오버라이딩 하지 않았기 때문에
    //    Object로부터 상속 받은 hashCode()와 equals()를 사용한다.
    //    그래서 같은 값을 갖고 있음에도 불구하고 다른 값을 갖고 있다고 평가되는 것이다.
    // = 해결책? Test05_13.java를 확인하라!
    System.out.println(map.get(k2)); // null
    
  }
}












