/* 인스턴스 멤버의 사용
 * => 인스턴스 멤버는 인스턴스의 레퍼런스가 있어야만 사용가능하다.
 *    레퍼런스.인스턴스멤버(변수,메서드)
 */
package step10;

class Student3 {
  int v1;
  
  void m1() {
    System.out.println("m1()");
  }
}

public class Test03_3 {
  public static void main(String[] args) {
    // 인스턴스 멤버 사용
    // => 인스턴스 멤버를 사용하려면 반드시 유효한 인스턴스의 주소를 갖고 있는 레퍼런스가 있어야 한다.
    Student3 obj = new Student3();
    obj.v1 = 100; // OK!
    obj.m1(); // OK!
    
    // 만약 인스턴스의 주소를 갖고 있는 레퍼런스 없이 클래스 이름으로 인스턴스 멤버를 사용하려 한다면?
    //Student3.v1 = 20; // 컴파일 오류!
    //Student3.m1(); // 컴파일 오류!
    
    // 유효한 인스턴스의 주소를 갖고 있지 않는 레퍼런스로 멤버를 사용하려 한다면?
    obj = null;
    obj.v1 = 200; // 컴파일 오류는 발생하지 않지만, 실행할 때 오류가 발생한다.
    obj.m1(); // 이렇게 실행할 때 발생하는 오류를 "런타입 예외"라고 부른다.
    
  }
}










