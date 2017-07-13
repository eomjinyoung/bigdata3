/* 클래스 멤버와 인스턴스 멤버 
 * => 클래스 멤버는 인스턴스 없이 사용가능하다.
 *    클래스명.클래스멤버(변수,메서드)
 * => 클래스 멤버는 인스턴스 레퍼런스로 사용가능하다.
 *    레퍼런스.클래스멤버(변수,메서드)
 *    
 *    그러나, 클래스 멤버를 사용할 때는 가능한 클래스명 통하여 사용하라.
 *    인스턴스의 레퍼런스를 통해 사용하면 다른 개발자가 인스턴스 멤버로 오해할 수 있다.
 */
package step10;

class Student2 {
  static int v1;
  
  static void m1() {
    System.out.println("Student2.m1()");
  }
}

public class Test03_2 {
  public static void main(String[] args) {
    // 클래스 멤버 사용하기
    Student2.v1 = 20;
    Student2.m1();
    
    // 인스턴스의 레퍼런스를 통해 클래스 멤버 사용하기
    Student2 obj1 = new Student2();
    obj1.v1 = 30; // OK! 다른 개발자가 본다면 v1은 인스턴스 변수라고 생각할 것이다.
    obj1.m1(); // OK! 다른 개발자가 본다면 m1()은 인스턴스 메서드라고 생각할 것이다.
    
    // 강조!
    // => 가능한 클래스 멤버는 클래스 이름을 통하여 접근하라!
    
  }
}










