/* 애노테이션: 정의하고 사용하기
 * 
 */
package step20.ex2;

// 애노테이션 사용하기
@MyAnnotation(name="홍길동", age=20) // 클래스 선언부에 붙일 수 있다.
public class Test01 {
  
  @MyAnnotation(name="홍길동", age=20) // 필드 선언부에 붙일 수 있다.
  static int value;
  
  @MyAnnotation(name="홍길동", age=20) // 스태틱 뿐만아니라 인스턴스 필드에도 붙인다.
  int value2;
  
  @MyAnnotation(name="홍길동", age=20) // 메서드에도 붙인다. 스태틱, 인스턴스 둘 다!
  static void m1() {}
  
  static void m2(
      @MyAnnotation(name="홍길동", age=20) int p1, // 파라미터 선언에도 붙일 수 있다.  
      @MyAnnotation(name="홍길동", age=20) int p2) {}
  
  
  public static void main(String[] args) {

    @MyAnnotation(name="홍길동", age=20) // 로컬 변수에도 붙인다.
    int a = 20;
    
  }
}






