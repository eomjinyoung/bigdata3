/* 인스턴스 목록 다루기 : Java Collection API - Set 사용하기 III
 * => Java Collection API
 *    - Collection: 여러 인스턴스를 저장하는 것을 의미.
 *    - API(Application Programming Interface): 프로그래밍 할 때 사용하는 도구를 의미.
 *    - 여러 인스턴스 주소를 저장하는 프로그래밍을 할 때 사용하는 도구!
 * => Set을 사용하여 여러 개의 인스턴스 주소를 저장할 수 있다.
 * => Set(집합)의 특징?
 *    1) null(주소 없음) 값을 저장할 수 있다.
 *    2) 같은 인스턴스 주소를 중복해서 저장할 수 없다.
 *    3) 저장한 순서대로 꺼낼 수 없다.
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
    
    // 인스턴스는 다르지만 같은 값을 갖는 객체를 저장한다면?
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












