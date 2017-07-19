/* 클래스의 공개 범위: public과 (default)
 * => public class 클래스명 {}
 *    - 클래스 선언 앞에 public을 붙이다.
 *    - 파일명은 반드시 클래스명과 같아야 한다.
 *    - 모든 클래스가 사용할 수 있도록 공개한다.
 *    
 * => class 클래스명 {}
 *    - 클래스 선언 앞에 public을 붙이지 않는다.
 *    - 파일명이 클래스명과 같을 필요는 없다.
 *      그러나 유지보수를 위해서는 가능한 클래스명과 소스 파일명이 같으면 좋다.
 *    - 같은 패키지에 소속된 클래스에게만 공개한다.
 *    
 * => 패키지 멤버 클래스에는 private, protected를 붙일 수 없다.
 *    참고! 
 *    static nested class, non-static nested class에는 
 *    일반 변수나 메서드처럼 private, protected, (default), public 모두 가능하다.
 *    
 *    물론, 메서드 안에 선언하는 local inner class는 접근 제어 modifier를 붙일 수 없다.
 * 
 */
package step13.ex5;

public class Test01 {
  public static void main(String[] args) {
    // MyClass는 public으로 공개되었기 때문에 다른 패키지에 소속된 클래스가 맘대로 사용할 수 있다.
    step13.ex5.other.MyClass obj = new step13.ex5.other.MyClass();
    
    // MyClass2는 공개되지 않았기 때문에 다른 패키지에 소속된 클래스가 사용할 수 없다.
    //step13.ex5.other.MyClass2 obj2; // 컴파일 오류!
  }
}











