/* 인스턴스 목록 다루기 : Java Collection API - List 사용하기
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


public class Test05_2 {
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
    // 1) 배열의 단점
    //    => 항목의 개수가 고정적이다.
    //    => 한 번 개수가 정해지면 바꿀 수 없다.
    //    => 항목이 모두 차면 새로 배열을 만들어야 한다.
    //    => 늘릴 수 없다.
    //    => 쓰지 않는 항목은 낭비된다.
    Student[] students = new Student[80]; 
    
    // 80 개의 배열 항목 중에서 다음과 같이 3 개의 항목만 사용된다. 나머지 77개는 낭비된다.
    students[0] = new Student("홍길동", 20, false);
    students[1] = new Student("임꺽정", 30, true);
    students[2] = new Student("유관순", 16, false);
    
    // 2) List는 배열과 달리 가변적이다.
    //    => 값을 저장하는 만큼 자동으로 커진다.
    //    => 저장하는 만큼 메모리를 쓰기 때문에 메모리 낭비가 적다.
    //    => 클래스이기 때문에 목록을 다루는 다양한 기능을 구비하고 있다.
    //    => 프로그래밍 할 때 편리하다.
    ArrayList studentList = new ArrayList();
    
    
  }
}












