/* 인스턴스 목록 다루기 : Java Collection API - List 사용하기 II
 * => Java Collection API
 *    - Collection: 여러 인스턴스를 저장하는 것을 의미.
 *    - API(Application Programming Interface): 프로그래밍 할 때 사용하는 도구를 의미.
 *    - 여러 인스턴스 주소를 저장하는 프로그래밍을 할 때 사용하는 도구!
 * => List를 사용하여 여러 개의 인스턴스 주소를 저장할 수 있다.
 * => List의 특징?
 *    1) null(주소 없음) 값을 저장할 수 있다.
 *    2) 같은 인스턴스 주소를 중복해서 저장할 수 있다.
 *    3) 저장한 순서대로 꺼낼 수 있다.
 *    4) 저장하는 만큼 내부적으로 레퍼런스의 개수가 자동 증가한다.
 */
package step14;

// 컴파일러에게 ArrayList 클래스가 어느 패키지에 있는지 알려준다.
import java.util.ArrayList;

public class Test05_3 {
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
    
    
    ArrayList studentList = new ArrayList();
    
    studentList.add(s1);
    studentList.add(s2);
    studentList.add(s3);
    studentList.add(null); // null 저장
    studentList.add(null); // null 저장
    studentList.add(s2); // 중복으로 저장
    
    // 현재 저장된 개수 알아내기
    System.out.println(studentList.size());
    
    // 목록에서 값을 꺼내기
    for (int i = 0; i < studentList.size(); i++) {
      System.out.println(studentList.get(i));
    }
  }
}












