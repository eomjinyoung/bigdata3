/* local class - 로컬 변수 접근
 *     
 */
package step15.ex4;
 
public class Test01_5 {
  int a = 4444;
  
  public void test1() {
    int a = 5555;
    
    // 로컬 클래스 정의
    class MyLocal {
      //int a = 6666;
      public void m1() {
        //int a = 7777;
        
        // 로컬 클래스에서 그 클래스가 정의된 메서드의 로컬 변수를 사용할 때는
        // 상수 이어야 한다.
        // 즉 final로 선언된 변수이거나 변수에 값을 저장한 후
        // 로컬 클래스 정의 이후에 값을 변경하지 않아서 결국 final과 같은 효과를 갖는 변수.
        System.out.printf("a=%d\n", a); // 로컬 클래스를 정의한 메서드의 로컬 변수
        // 변수 찾는 순서
        // 현재 메서드의 로컬 변수 
        //   => 현재 클래스의 인스턴스 변수 
        //     => 로컬 클래스를 정의한 메서드의 로컬 변수
        //       => 바깥 클래스의 인스턴스 변수
        //  
      }
    }
    
    // 로컬 클래슬르 정의한 후 로컬 클래스가 참조하는 변수의 값을 변경하면
    // 컴파일 오류가 발생한다.
    //a = 30;
    
    // 로컬 클래스 사용
    MyLocal obj = new MyLocal();
    obj.m1();
  }
  
  public static void main(String[] args) {
    Test01_5 obj = new Test01_5();
    obj.test1();
  }
}





