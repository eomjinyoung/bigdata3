/* 클래스 로딩과 메모리 영역 II
 * => Test01_2 실행 과정
 * 1) Test01_2 클래스 로딩(Method Area)
 * 2) Test01_2.main() 호출
 *    - 프레임 메모리 생성(Stack)
 * 3) Greeting 클래스 로딩(Method Area)
 * 4) Greeting.hello() 호출
 *    - 프레임 메모리 생성(Stack)
 * 
 */
package step09;

class Greeting {
  static void hello(String name) {
    System.out.printf("안녕하세요, %s님!", name);
  }
}

public class Test01_2 {
  
  public static void main(String[] args) {
    Greeting.hello("홍길동");
  }
}











