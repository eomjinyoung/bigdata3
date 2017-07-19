/* 인스턴스 목록 다루기 : Java Collection API - Set 사용하기 III
 * => HashSet은 같은 인스턴스를 중복해서 저장하지 않는다.
 * => 또한 같은 값을 갖는 인스턴스도 중복해서 저장하지 않는다.
 */
package step14;

import java.util.HashSet;
import java.util.Iterator;

public class Test05_6 {
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
  }
  
  public static void main(String[] args) {
    HashSet studentSet = new HashSet();
    
    studentSet.add(new Student("홍길동", 20, false));
    studentSet.add(new Student("임꺽정", 30, true));
    studentSet.add(new Student("유관순", 16, false));
    
    // 같은 값을 갖는 인스턴스가 저장되는데? 어떻게 된건가?
    // => 같은 값인지 비교할 때 hashCode()와 equals()를 호출한다.
    // => 현재 Student 클래스는 hashCode()와 equals()를 오버라이딩 하지 않았다.
    //    따라서 같은 값을 갖더라도 
    //    Object로부터 상속 받은 오리지널 hashCode()는 인스턴스가 다르면 다른 해시값을 리턴할 것이다.
    //    Object로부터 상속 받은 오리지널 equals()는 인스턴스의 주소를 비교한다.
    // => 그래서 "홍길동", "임꺽정", "유관순" 정보가 중복 저장된 것이다.
    // 해결책? Test05_7.java를 확인하라!
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












