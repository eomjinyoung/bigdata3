/* 인스턴스 목록 다루기 : 레퍼런스 배열
 * => 레퍼런스 배열을 사용하여 여러 개의 인스턴스 주소를 저장할 수 있다.
 */
package step14;

public class Test05_1 {
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
    // 1) 레퍼런스 배열을 사용하기 전
    //    => 다음과 같이 Student 인스턴스 주소를 저장할 변수를 개별적으로 만들어야 한다.
    Student s1, s2, s3, s4, s5, s6, s7, s8, s9, s10,
            s11, s12, s13, s14, s15, s16, s17, s18, s19, s20,
            s21, s22, s23, s24, s25, s26, s27, s28, s29, s30,
            s31, s32, s33, s34, s35, s36, s37, s38, s39, s40,
            s41, s42, s43, s44, s45, s46, s47, s48, s49, s50,
            s51, s52, s53, s54, s55, s56, s57, s58, s59, s60,
            s61, s62, s63, s64, s65, s66, s67, s68, s69, s70,
            s71, s72, s73, s74, s75, s76, s77, s78, s79, s80;
    
    // => 그런 후 Student 인스턴스를 만들어 그 주소를 각 레퍼런스에 저장한다.
    s1 = new Student("홍길동", 20, false);
    s2 = new Student("임꺽정", 30, true);
    s3 = new Student("유관순", 16, false);
    
    
    // 2) 레퍼런스 배열 사용 후
    //    => new 명령을 사용하여 Student 인스턴스 주소를 저장할 레퍼런스 배열을 여러 개 만든다.
    Student[] students = new Student[80]; 
    
    // Student[] student : 레퍼런스 배열 주소를 저장할 변수
    // new Student[3] : Student 주소를 저장할 레퍼런스를 3개 만든다.
    //                  Student 인스턴스를 3개 만드는 것이 아니다!
    // 주의!
    // => 자바에서는 인스턴스(객체)를 여러 개 만들 수 있는 문법이 없다!
    
    students[0] = new Student("홍길동", 20, false);
    students[1] = new Student("임꺽정", 30, true);
    students[2] = new Student("유관순", 16, false);
    
    
    
    
  }
}












