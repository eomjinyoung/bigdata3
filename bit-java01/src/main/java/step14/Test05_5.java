/* 인스턴스 목록 다루기 : Java Collection API - Set 사용하기 II
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

public class Test05_5 {
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
    Student s1 = new Student("홍길동", 20, false);
    Student s2 = new Student("임꺽정", 30, true);
    Student s3 = new Student("유관순", 16, false);
    
    
    HashSet studentSet = new HashSet();
    
    studentSet.add(s1);
    studentSet.add(s2);
    studentSet.add(s3);
    studentSet.add(null); // null 저장
    studentSet.add(null); // 이미 null이 있으므로 중복 저장 안됨.
    studentSet.add(s2); // 이미 s2의 주소가 있으므로 중복 저장 안됨.
    
    // 현재 저장된 개수 알아내기
    System.out.println(studentSet.size());
    System.out.println("----------------------------");
    
    // 목록에서 값을 꺼내기
    // => Iterator 객체를 통해 목록에 저장된 값을 꺼내기
    // Iterator? 
    // => 목록에서 값을 꺼내주는 역할을 수행하는 객체.
    // => 내부적으로 꺼내는 방법(오름차순, 내림차순, 특정 조건 등)에 상관없이 
    //    개발자가 일관된 방식으로 값을 꺼낼 수 있게 해준다.
    
    // 1) 값을 꺼내주는 대행자 얻기 
    Iterator iterator = studentSet.iterator();
    
    // 2) Iterator 객체를 통해 값을 꺼내기
    while (iterator.hasNext()) { // 꺼낼 게 있는지 묻는다.
      System.out.println(iterator.next()); // 꺼내서 출력한다.
    }
  }
}












