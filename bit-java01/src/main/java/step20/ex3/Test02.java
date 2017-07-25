/* 애노테이션: 선택 속성
 * => 값을 지정하지 않으면 기본 값이 사용된다.
 */
package step20.ex3;

//@MyAnnotation2() // OK!
//@MyAnnotation2 // OK! 단 한 개의 속성 값도 지정하지 않을 경우, 괄호()를 생략할 수 있다.
@MyAnnotation2(gender=false) // OK! 선택 속성 중 필요한 것만 값을 지정할 수 있다.
public class Test02 {
  public static void main(String[] args) {
    
  }
}
