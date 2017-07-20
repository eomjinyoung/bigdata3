/* non-staic nested class : 인스턴스 만들기
 * => 인스턴스 변수가 되었든 인스턴스 메서드가 되었든
 *    인스턴스 멤버를 사용하려면 항상 인스턴스 주소가 있어야 한다.
 * => not-static nested class도 마찬가지이다.
 *    인스턴스 주소가 있어야만 이 클래스를 사용할 수 있다.
 * => static nested class가 클래스에 소속된 중첩 클래스라면,
 *    non-static nested class는 인스턴스에 소속된 클래스이다. 
 *     
 *  
 */
package step15.ex3;

public class Test01_2 {
  // 클래스 멤버(스태틱 멤버) 선언
  static int a; // 스태틱 변수
  static void m1() {} // 스태틱 메서드
  static class Student {  // static nested class
    String name;
    int age;
    
    public Student(String name, int age) {
      super();
      this.name = name;
      this.age = age;
    }
  }
  
  // 인스턴스 멤버
  int b; // 인스턴스 변수
  void m2() {} // 인스턴스 메서드
  class Student2 { // non-static nested class = member inner class
    String name;
    int age;
   
    public Student2(String name, int age) {
      super();
      this.name = name;
      this.age = age;
    } 
  }
  
  public static void main(String[] args) {
    // 스태틱 멤버(변수,메서드,중첩클래스)를 사용하려면 항상 다음과 같이 클래스 이름을 지정해야 한다.
    Test01_2.a = 100;
    Test01_2.m1();
    Test01_2.Student obj = new Test01_2.Student("홍길동", 20);
    
    // 물론 main() 메서드가 Test01_2의 멤버이기 때문에 다음과 같이 클래스 이름을 생략할 수 있다.
    a = 100;
    m1();
    Student obj2 = new Student("임꺽정", 30);
    
    // 인스턴스 멤버(변수,메서드,중첩클래스)를 사용하려면 항상 인스턴스를 생성해야 한다.
    //b = 200; // 인스턴스 주소가 없기 때문에 컴파일 오류!
    //m2(); // 인스턴스 주소가 없기 때문에 컴파일 오류!
    
    Test01_2 outer1 = new Test01_2();
    // 위와 같이 인스턴스를 먼저 준비한 후에 인스턴스 멤버(변수,메서드,중첩클래스)를 사용할 수 있다.
    outer1.b = 200; // OK!
    /* 위 코드의 의미:
     * => outer1 변수에 저장된 heap 메모리로 가서 그 인스턴스 변수 중에 
     *    b라는 이름을 가진 변수에 200 값을 넣어라!
     */
    
    outer1.m2(); // OK!
    /* 위 코드의 의미:
     * => outer1의 타입(클래스)에 해당하는 클래스(Test01_2)로 가서 m2()라는 메서드를 호출하라.
     *    이때 outer1에 저장된 인스턴스 주소를 m2()에 전달하라!
     */

    // 중첩 클래스 또한 인스턴스 변수나 인스턴스 메서드처럼 인스턴스 주소가 있어야 한다.
    // => 주의! 레퍼런스 변수를 선언할 때는 인스턴스 주소 대신 바깥 클래스의 이름을 지정해야 한다.
    Test01_2.Student2 inner1 = outer1.new Student2("유관순", 16);
    /* 위 코드의 의미:
     * => outer1의 타입(클래스)에 소속된 Student2 클래스를 찾아서(없으면 로딩)
     *    그 클래스 설계도에 따라 heap에 인스턴스 변수를 준비하라!
     *    또한 outer1에 저장된 인스턴스 주소를 그 Student2 인스턴스에 저장하라!
     * => non-static 중첩 클래스의 인스턴스를 만들 때
     *    일반 클래스와 달리 바깥 클래스의 인스턴스 주소를 저장할 변수를 갖고 있다.
     * 
     */
    
    Test01_2 outer2 = new Test01_2();
    outer2.b = 300;
    Test01_2.Student2 inner2 = outer2.new Student2("안중근", 20); 
    
  }
}











