/* 메서드 : 메서드 파라미터 응용 IV 
 * => 같은 타입의 값을 여러 개 받는 편리한 방법
 * => 파라미터 선언 문법
 *    타입... 파라미터명   
 */
package step06;

public class Test04_4 {
  
  static void printHello(String... name) {
    // name 파라미터는 0 개 이상의 String을 받을 수 있다.
    // 결국 배열로 취급한다.
    System.out.println(name.length);
  }

  public static void main(String[] args) {
    printHello();
    printHello("홍길동");
    printHello("홍길동", "임꺽정"); 
    printHello("홍길동", "임꺽정", "유관순");
    
    // 해당 타입과 일치하는 값을 넘겨야 한다.
    // 다른 타입의 값을 넘기면 오류!
    //printHello("홍길동", 10, 20); // 컴파일 오류!
  }

}





