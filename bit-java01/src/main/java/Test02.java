/* 자바 주석 
 * => 여러 줄 주석
 * => 한 줄 주석
 * => 자바문서 생성을 위한 주석
 * => JVM, 컴파일러를 위한 주석
 * 
 */

/* 
여러 줄 
주석이다.
주석은 컴파일할 때 제거된다.
*/
public class Test02 { // 한 줄 주석. 그 줄 맨 끝까지 주석이다.
  /**
   자바 문서를 만들 때 사용되는 주석이다.
   */
  public static void main(String[] args) {
    System.out.println("Hello!");

  }

  @Override // "애노테이션"으로 불리는 주석. JVM 또는 컴파일러가 참고한다.
  public String toString() {
    return "ok";
  }

}
