/* 애노테이션: 애노테이션 추출하기
 * => 자바 프로그램을 실행하는 중에 애노테이션을 추출할 수 있다.
 *    단 애노테이션의 유지정책이 RUNTIME인 경우만 추출할 수 있다.
 */
package step20.ex5;

import java.lang.annotation.Annotation;

// Test01.class 파일을 열어서 
// 어떤 애노테이션이 존재하는 지 살펴보라!

@MyAnnotation("유지정책 - CLASS")
@MyAnnotation2("유지정책 - SOURCE")
@MyAnnotation3("유지정책 - CLASS")
@MyAnnotation4("유지정책 - RUNTIME")
public class Test02 {
  public static void main(String[] args) {
    // 1) 클래스 정보를 다루는 도구를 얻는다.
    //    => 자바의 모든 클래스는 "class"라는 스태틱 변수가 있다.
    //    => 이 "class"라는 스태틱 변수에는 그 클래스에 대한 정보를 다루는 도구가 들어있다.
    //    => 그 도구의 타입이 "Class"이다.
    //    => Class라는 도구가 어떤 클래스를 다루는지 제네릭으로 지정해야 한다.
    Class<Test02> clazz = Test02.class;
    
    // 2) 클래스 도구 "Class"을 사용하여 Test02에 붙은 애노테이션을 꺼내 보자!
    Annotation[] annotations = clazz.getAnnotations();
    
    // 3) 각각의 애노테이션 정보를 출력해보자!
    for (Annotation annotation : annotations) {
      System.out.println(annotation.toString());
    }
    
    /* MyAnnotation4 만 추출할 수 있었다. 왜?
     * => 실행 중에 추출할 수 있는 애노테이션은 RUNTIME 유지 정책을 갖는 애노테이션만 가능하다.
     * => Test02에 붙은 애노테이션 중에서 RUNTIME 유지 정책을 갖는 애노테이션은
     *    MyAnnotation4가 유일하다!
     */
    
  }
}








