/* 애노테이션: value 속성
 * => "value"라는 이름을 가진 속성은 
 *    value 속성의 값만 지정할 때, 속성의 이름을 생략할 수 있다.
 *    단 "value"라는 이름의 속성에 대해서만 적용된다.
 *    다른 이름의 속성은 안된다.
 */
package step20.ex3;

//@MyAnnotation3(value="홍길동", value2=20) // OK!
//@MyAnnotation3(value="홍길동") // OK! value2는 선택 속성이기 때문에 값을 지정하지 않아도 된다.
@MyAnnotation3("홍길동") // OK! 속성이 이름이 value이고, value 속성이 값만 지정할 경우 이름 생략 가능!
//@MyAnnotation3("홍길동", value2=20) // 오류! 다른 속성의 값을 지정할 때는 value 이름 생략 불가!
public class Test03 {
  public static void main(String[] args) {
    
  }
}
