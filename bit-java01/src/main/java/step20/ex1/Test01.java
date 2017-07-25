/* 애노테이션(annotation)
 * => 컴파일러나 JVM이 사용하는 특별한 주석이다.
 * => 일반적인 주석(한 줄 주석, 여러 줄 주석, javadoc 주석)은 컴파일할 때 제거된다.
 *    즉 바이트코드 파일(.class)에 그 주석이 존재하지 않는다.
 * => 그러나 애노테이션은 .class 파일에 유지할 수 있다.
 * => 용도
 *    - 컴파일러에게 어떤 정보를 알릴 때.
 *    - JVM에게 어떤 정보를 알릴 때.
 *    - .class 파일에 어떤 정보를 남겨 두었다가 필요할 때 사용하기 위해서.
 * => 문법
 *    - 클래스 선언부, 필드 선언부, 파라미터 선언부, 메서드 선언부 앞에 작성한다.
 *    - 작성 방법
 *      @애노테이션이름(속성명=값,속성명=값,...)
 */
// 한 줄 주석
/* 
여러 줄 주석
 */
/** java doc 주석
API 문서를 작성할 때 사용하는 특별 한 주석 
 */
package step20.ex1;

public class Test01 {
  
  // 부모 클래스(수퍼 클래스)인 Object에서 상속 받은 toString() 메서드를 재정의하자!
  public String toStrung() {
    return "Hello!";
  }
  
  public static void main(String[] args) {
    Test01 obj = new Test01();
    System.out.println(obj.toString());
  }
}










