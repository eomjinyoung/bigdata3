/* 메서드 : 메서드 정의 II - 파라미터가 있는 메서드 
 */
package step06;

public class Test03_2 {
  
  // 메서드 정의
  // => 외부로부터 받은 문자열을 저장하기 위해 name이라는 변수를 선언한다.
  // => 이 변수를 "파라미터(parameter)"라 부른다.
  static void printHello(String name) {
    //System.out.println("Hello, " + name + "!");
    System.out.printf("Hello, %s!\n", name);
  }

  public static void main(String[] args) {
    // 메서드 호출
    // => printHello()를 실행할 때 name 파라미터에 문자열을 전달해야 한다.
    // => name 파라미터에 전달하는 문자열 "홍길동"을 "아규먼트(argument)"라 부른다.
    printHello("홍길동");
    
    // 파라미터에 전달하는 값은 무조건 필수이다. 따라서 값을 주지 않으면 오류이다.
    //printHello(); // 컴파일 오류!
    
    // 파라미터의 타입과 다른 값을 넘겨 줘도 오류이다.
    //printHello(20); // 컴파일 오류!
    
    // 파라미터의 개수와 일치하지 않아도 오류이다.
    //printHello("홍길동", "임꺽정"); // 컴파일 오류!
  }

}





