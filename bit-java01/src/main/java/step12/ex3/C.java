package step12.ex3;

public class C extends B {
  void m1() {
    System.out.println("C.m1()");
  }
  
  void m2() {
    System.out.println("C.m2()");
  }
  
  void m4() {
    System.out.println("C.m4()");
  }
  
  void test() {
    this.m1(); // C 클래스부터 m1()을 찾는다.
    super.m1(); // B 클래스부터 m1()을 찾는다.
     
    this.m2(); // C 클래스부터 m2()을 찾는다.
    super.m2(); // B 클래스부터 m2()을 찾는다.
    //super.super.m2(); // A클래스의 m2()를 호출하는 건 아닐까? 아니다! 컴파일 오류다!
    
    this.m3(); // C 클래스부터 m3()을 찾는다.
    super.m3(); // B 클래스부터 m3()을 찾는다.
    
    this.m4(); // C 클래스부터 m4()을 찾는다.
    //super.m4(); // B 클래스부터 m4()을 찾는다.
  }
}











