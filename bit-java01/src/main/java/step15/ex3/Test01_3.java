/* non-staic nested class : 인스턴스 만들기 II
 * => 클래스 내부에서 중첩 클래스의 인스턴스를 만들 때 
 *     
 *  
 */
package step15.ex3;

public class Test01_3 {
  
  static class Student {  // static nested class
    String name;
    int age;
    
    public Student(String name, int age) {
      super();
      this.name = name;
      this.age = age;
    }
  }
  
  class Student2 { // non-static nested class = member inner class
    String name;
    int age;
   
    public Student2(String name, int age) {
      super();
      this.name = name;
      this.age = age;
    } 
  }
  
  static int a;
  static void m1() {
    // 스태틱 메서드는 this라는 변수가 없다.
    a = 200; // ==> Test01_3.a = 200;
    //b = 300; // ==> Test01_3.b = 300; 컴파일 오류!
    
    Student obj = new Student("홍길동", 30); 
    // ==> Test01_3.Student obj = new Test01_3.Student("홍길동", 30)
    
    //Student2 obj2 = new Student2("임꺽정", 20);
    // ==> Test01_3.Student2 obj2 = new Test01_3.Student2("임꺽정", 20);
    // 그래서 컴파일 오류!
  }
  
  int b;
  void m2() {
    // 인스턴스 메서드는 this라는 내장 변수가 있다.
    a = 2000; // this.a = 2000; => 인스턴스에 a가 없으면 클래스 변수에서 찾을 것이다. 그래서 OK!
    b = 3000; // this.b = 3000; => b는 원래 인스턴스 변수이다. 그래서 OK!
    
    Student obj = new Student("홍길동", 30); 
    // ==> Test01_3.Student obj = new Test01_3.Student("홍길동", 30)
    
    Student2 obj2 = new Student2("임꺽정", 20);
    // ==> Test01_3.Student2 obj2 = this.new Student2("임꺽정", 20);
    // 그래서 OK!
  }
  
  public static void main(String[] args) {
  }
}











