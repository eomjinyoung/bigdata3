/* 애노테이션: 유지 정책
 * => 애노테이션의 값이 언제까지 유지할 것인지 지정한다.
 * => 유지 정책
 *    1) SOURCE 
 *       - 컴파일 후 제거된다. 
 *       - 즉 .class 파일에는 존재하지 않는다.
 *    2) CLASS (기본 정책)
 *       - 컴파일 한 후에도 남아 있다.
 *       - 즉 .class 파일에 존재한다.
 *       - 단 JVM이 사용할 수 없다.
 *       - 유지 정책을 지정하지 않으면 기본이 CLASS이다.
 *    3) RUNTIME
 *       - 컴파일 한 후에도 남아 있다.
 *       - 즉 .class 파일에 존재한다.
 *       - JVM이 사용할 수 있다.
 *       - 즉 실행 중에 애노테이션 정보를 추출할 수 있다.
 */
package step20.ex5;

// Test01.class 파일을 열어서 
// 어떤 애노테이션이 존재하는 지 살펴보라!

@MyAnnotation("유지정책 - CLASS")
@MyAnnotation2("유지정책 - SOURCE")
@MyAnnotation3("유지정책 - CLASS")
@MyAnnotation4("유지정책 - RUNTIME")
public class Test01 {

}








