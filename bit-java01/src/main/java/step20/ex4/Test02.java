/* 애노테이션 : 배열 속성
 * => 배열 속성의 값을 설정할 때 중괄호{}를 사용해야 한다.
 * => 한 개의 항목만 지정할 경우 중괄호를 생략할 수 있다.
 */
package step20.ex4;


public class Test02 {
  @MyAnnotation(value={"홍길동","임꺽정","유관순"}) // 배열 속성에 여러 개의 값 지정 
  void m1() {}

  @MyAnnotation(value={"홍길동"}) // 배열 속성에 한 개의 값 지정 
  void m2() {}
  
  @MyAnnotation(value="홍길동") // 배열 속성에 한 개의 값만 지정할 경우 중괄호 생략 가능! 
  void m3() {}

  @MyAnnotation("홍길동") // 물론 배열 속성의 이름이 value이고, value 값만 지정할 경우 속성명 생략 가능! 
  void m4() {}
  
  @MyAnnotation({"홍길동","임꺽정","유관순"})  
  void m5() {}
}







