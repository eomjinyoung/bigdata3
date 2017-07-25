/* 애노테이션: 필수 속성
 * => 값을 반드시 지정해야 한다.
 */
package step20.ex3;

//@MyAnnotation() // 값을 지정하지 않으면 컴파일 오류이다.
@MyAnnotation(name="홍길동", age=20)
public class Test02 {
  public static void main(String[] args) {
    
  }
}
