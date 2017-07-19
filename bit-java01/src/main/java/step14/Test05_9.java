/* 인스턴스 목록 다루기 : Java Collection API - Map 사용하기 II
 * => Map에 저장된 모든 값 꺼내기
 *    Map에서 값을 꺼내려면 key를 알아야 한다.
 *           
 */
package step14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test05_9 {
  static class Student {
    String name;
    int age;
    boolean working;
    
    public Student(String name, int age, boolean working) {
      super();
      this.name = name;
      this.age = age;
      this.working = working;
    }

    public String toString() {
      return "Student [name=" + name + ", age=" + age + ", working=" + working + "]";
    }

    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + age;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + (working ? 1231 : 1237);
      return result;
    }

    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Student other = (Student) obj;
      if (age != other.age)
        return false;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      if (working != other.working)
        return false;
      return true;
    }
    
    
  }
  
  public static void main(String[] args) {
    HashMap studentMap = new HashMap();
    
    studentMap.put("s01", new Student("홍길동", 20, false));
    studentMap.put("s02", new Student("임꺽정", 30, true));
    studentMap.put("s03", new Student("유관순", 16, false));
    studentMap.put("s04", null);
    studentMap.put(null, new Student("안중근", 20, true));
    
    // 현재 저장된 개수 알아내기
    System.out.println(studentMap.size());
    System.out.println("----------------------------");
    
    // key가 들어있는 집합을 알아낸다.
    Set keySet = studentMap.keySet();
    
    // key 집합에서 값을 대신 꺼내줄 대행자를 알아낸다.
    Iterator keyIterator = keySet.iterator();
    
    // key를 가지고 값을 꺼낸다.
    while (keyIterator.hasNext()) {
      Object key = keyIterator.next(); // key를 꺼내주는 대행자에게 key을 하나 꺼내달라고 요청한다.
      System.out.println(studentMap.get(key)); // 꺼낸 key를 가지고 값을 알아낸다.
    }
  }
}












