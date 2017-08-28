/* local class - 인스턴스 변수 접근
 *     
 */
package step15.ex4;

public class Test01_4 {
  int a = 100;
  
  public void test1() {
    int a = 5555;
    
    // 로컬 클래스 정의
    class MyLocal {
      int a = 111;
      int b = 200;
      int c = 333;
      
      public void m1(int c) {
        int a = 1000;
        System.out.printf("b=%d\n", b); // MyLocal의 인스턴스 변수
        System.out.printf("this.b=%d\n", this.b); // MyLocal의 인스턴스 변수
        System.out.printf("c=%d\n", c); // m1()의 파라미터 
        System.out.printf("this.c=%d\n", this.c); // MyLocal의 인스턴스 변수
        System.out.printf("a=%d\n", a); // m1()의 로컬 변수 
        System.out.printf("this.a=%d\n", this.a); // m1()의 로컬 변수 
        System.out.printf("Test01_4.this.a=%d\n", Test01_4.this.a); // Test01_4 객체의 인스턴스 변수
      }
      
      public void m2() {
        int a = 1234;
        System.out.printf("a=%d\n", a); // m2()의 로컬 변수
      }
    }
    
    // 로컬 클래스 사용
    MyLocal obj = new MyLocal();
    obj.m1(300);
  }
  
  public static void main(String[] args) {
    Test01_4 obj = new Test01_4();
    obj.test1();
  }
}





