/* 메서드 : 메서드 파라미터 응용 II 
 * => 파라미터의 타입과 개수, 순서가 같은 메서드를 중복 선언할 수 없다.
 * => 파라미터 이름은 상관없다.
 *    
 */
package step06;

public class Test04_2 {
  
  static void printHello(String name, String email) {
    System.out.printf("%s(%s)\n", name, email);
  }

  // 같은 이름의 메서드를 선언할 때 타입과 개수, 순서가 달라야 한다.
  // 파라미터 이름이 다른 것은 소용없다.
  // 컴파일 오류!
  /*
  static void printHello(String email, String name) {
    System.out.printf("%s(%s)\n", name, email);
  }
  */
  
  public static void main(String[] args) {
    // 파라미터 변수의 타입과 개수, 순서가 일치하도록 값을 넘겨야 한다. 
    printHello("홍길동", "hong@test.com");
  }

}





