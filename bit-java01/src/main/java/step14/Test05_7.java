/* 인스턴스 목록 다루기 : Java Collection API - Set 사용하기 IV
 * => HashSet은 같은 인스턴스를 중복해서 저장하지 않는다.
 * => 또한 같은 값을 갖는 인스턴스도 중복해서 저장하지 않는다.
 * => HashSet에 인스턴스(주소)를 저장할 때 같은 값인 경우 중복 저장되지 않게 하려면,
 *    Student 클래스에 hashCode()와 equals()를 재정의 해야 한다.
 *    즉 같은 값을 갖는 경우 같은 해시값을 리턴하게 해야 한다. 
 */
package step14;

import java.util.HashSet;
import java.util.Iterator;

public class Test05_7 {
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
    HashSet studentSet = new HashSet();
    
    studentSet.add(new Student("홍길동", 20, false));
    studentSet.add(new Student("임꺽정", 30, true));
    studentSet.add(new Student("유관순", 16, false));
    
    // 같은 값을 갖는 인스턴스를 저장한다면?
    // => hashCode()와 equals()의 리턴 값을 통하여 같은 값을 갖는지 검사한다.
    // => Student 클래스에서 같은 값인 경우 
    //    같은 해시 값을 갖도록 hashCode()를 오버라이딩 했기 때문에,
    //    true를 리턴하도록 equals()를 오버라이딩 했기 때문에
    //    중복 저장되지 않는다.
    studentSet.add(new Student("홍길동", 20, false)); 
    studentSet.add(new Student("임꺽정", 30, true)); 
    studentSet.add(new Student("유관순", 16, false));
    
    // 현재 저장된 개수 알아내기
    System.out.println(studentSet.size());
    System.out.println("----------------------------");
    
    // 목록에서 값을 꺼내기
    Iterator iterator = studentSet.iterator();
    while (iterator.hasNext()) { // 꺼낼 게 있는지 묻는다.
      System.out.println(iterator.next()); // 꺼내서 출력한다.
    }
  }
}












