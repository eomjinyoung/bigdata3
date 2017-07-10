/* 메서드 : 메서드 파라미터 응용 I 
 *    
 */
package step06;

public class Test04_1 {
  
  // 여러 개의 파라미터 선언
  static void printHello(String name, String email) {
    System.out.printf("%s(%s)\n", name, email);
  }

  public static void main(String[] args) {
    // 파라미터 변수의 타입과 개수, 순서가 일치하도록 값을 넘겨야 한다. 
    printHello("홍길동", "hong@test.com");
  }

}





