/* 인스턴스 목록 다루기 : Java Collection API - Map 사용하기 V
 * => 사용자가 만든 클래스를 key로 사용할 수 있는가?
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
    HashMap studentMap = new HashMap();
    
    studentMap.put("s01", new Student("홍길동", 20, false));
    studentMap.put("s02", new Student("임꺽정", 30, true));
    studentMap.put("s03", new Student("유관순", 16, false));
    studentMap.put("s04", null);
    studentMap.put(null, new Student("안중근", 20, true));
    
    System.out.println(studentMap.size());
    System.out.println("----------------------------");
    
    // Map에서 key와 value를 한쌍의 값으로 묶어 주머니에 담는다. 그리고 그 주머니를 리턴한다.
    Set entrySet = studentMap.entrySet();
    
    // Entry<key,value> : key와 value가 한 쌍으로 들어 있는 작은 주머니.
    // Entry 집합에서 한 개씩 엔트리를 꺼내줄 대행자를 얻는다.
    Iterator entryIterator = entrySet.iterator();
    
    // Iterator를 통해 주머니에서 entry를 한 개 꺼내 출력한다.
    while (entryIterator.hasNext()) {
      Entry entry = (Entry)entryIterator.next();
      System.out.printf("%s:%s\n", entry.getKey(), entry.getValue()); 
    }
  }
}












