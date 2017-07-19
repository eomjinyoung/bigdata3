/* 인스턴스 목록 다루기 : Java Collection API - Map 사용하기
 * => Java Collection API
 *    - Collection: 여러 인스턴스를 저장하는 것을 의미.
 *    - API(Application Programming Interface): 프로그래밍 할 때 사용하는 도구를 의미.
 *    - 여러 인스턴스 주소를 저장하는 프로그래밍을 할 때 사용하는 도구!
 * => Map을 사용하여 여러 개의 인스턴스 주소를 저장할 수 있다.
 * => Map의 특징?
 *    1) 값을 저장하거나 꺼낼 때 key를 사용한다.
 *       그래서 값을 꺼내는 속도가 빠르다.
 *    2) HashMap은 key와 value에 null을 사용할 수 있고,
 *       Hashtable은 key와 value에 null을 사용할 수 없다.
 *       
 */
package step14;

import java.util.HashMap;
import java.util.Iterator;

public class Test05_8 {
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
    
    // 맵에 값을 저장하기
    // => 값을 저장할 때 반드시 key를 지정해야 한다.
    // => key로 사용가능한 객체는
    //    비록 인스턴스가 다르더라도 같은 값을 갖는 경우,
    //    hashCode()의 리턴 값이 같아야 하고,
    //    equals()의 리턴값이 true여야 한다.
    //    즉 이렇게 리턴하도록 hashCode()와 equals()를 오버라이딩 한 클래스여야 한다.
    //    그런 클래스만이 key로 사용할 수 있다.
    //    예) String, Wrapper 클래스
    studentMap.put("s01", new Student("홍길동", 20, false));
    studentMap.put("s02", new Student("임꺽정", 30, true));
    studentMap.put("s03", new Student("유관순", 16, false));
    
    // HashMap은 value에 null을 저장할 수 있다.
    studentMap.put("s04", null);
    
    // HashMap은 null을 key로 사용할 수 있다.
    studentMap.put(null, new Student("안중근", 20, true));
    
    // 현재 저장된 개수 알아내기
    System.out.println(studentMap.size());
    System.out.println("----------------------------");
    
    // 목록에서 값을 꺼내기
    // => key를 주면 그 key로 저장된 값을 리턴한다.
    System.out.println(studentMap.get("s01"));
    System.out.println(studentMap.get("s02"));
    System.out.println(studentMap.get("s03"));
    System.out.println(studentMap.get("s04"));
    System.out.println(studentMap.get(null));
  }
}












