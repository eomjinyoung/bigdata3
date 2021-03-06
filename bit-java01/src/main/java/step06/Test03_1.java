/* 메서드 : 메서드 정의 I
 * => 메서드를 정의하고 사용하는 방법
 * => 메서드를 정의하는 문법
 *      리턴타입 메서드명(파라미터, ...) {
 *        명령문;
 *        ...
 *      }
 *    => 예:
 *      int plus(int a, int b) {
 *        return a + b;
 *      } 
 *    
 *    => 리턴타입
 *      - 메서드 블록을 실행한 후 리턴하는 데이터의 타입이다.
 *      - 리턴할 데이터가 없다면 void로 선언한다.
 *      - 예) int
 *    => 파라미터
 *      - 메서드 블록을 실행할 때 사용할 데이터를 받는 변수이다.
 *      - 메서드 블록을 실행할 때 만드는 메모리이다.
 *      - "로컬 변수(local variable)"라고도 부른다.
 *      - 특히 이처럼 외부에서 데이터를 받는 로컬 변수를 "파라미터(parameter)"라 부른다.
 *      - 예) int a, int b
 *    => 메서드명
 *      - 명령어를 묶어 놓은 블록의 이름이다.
 *      - 블록을 실행할 때 이 이름을 사용한다.
 *      - 메서드명은 소문자로 시작하고, 여러 단어로 이루어진 경우 각 단어의 시작 알파벳은 대문자로 한다.
 *      - C/C++ 등의 언어에서는 "함수(function)"이라고 부른다.
 *      - 예) plus
 *      
 * => 메서드를 사용하는 문법
 *    메서드명(아규먼트,...);
 *    => 예:
 *      int result = plus(10, 20);
 *    => 아규먼트(argument)
 *      - 메서드를 실행할 때 파라미터 변수에 넘겨주는 값을 말한다.
 *      - 일반적으로 현장에서는 변수나 값을 모두 "아규먼트" 또는 "파라미터"로 구분하지 않고 사용한다.
 *      - 예) 10, 20
 *    
 *    
 */
package step06;

public class Test03_1 {
  
  // 메서드 정의
  // => 리턴 값과 파라미터가 없는 메서드 
  static void printHello() {
    System.out.println("Hello!");
  }

  public static void main(String[] args) {
    // 메서드 호출
    printHello();
    
    // 리턴 값이 없기 때문에 메서드를 실행한 결과를 변수에 저장할 수 없다.
    //String str = printHello(); // 컴파일 오류!
    
    // 파라미터가 없기 때문에 데이터를 전달할 수  없다.
    //printHello("홍길동"); // 컴파일 오류!
  }

}





