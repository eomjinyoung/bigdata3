/* 메서드 : 메서드 정의 III - 리턴 타입이 있는 메서드 
 */
package step06;

public class Test03_3 {
  
  // 메서드 정의
  // => 메서드를 실행한 후 결과 값을 리턴하는 메서드는 메서드 선언부에 리턴 데이터의 타입을 지정해야 한다. 
  // => 데이터를 리턴할 때는 "return" 명령어를 사용한다.
  // => 오직 한 개의 값만 리턴할 수 있다.
  static String printHello() {
    return "Hello!";
  }

  public static void main(String[] args) {
    // 메서드 호출
    // => printHello()가 리턴한 값을 받고 싶다면 앞에 변수를 선언하라!
    String result;
    result = printHello();
    System.out.println(result);
    
    // 물론, 변수 선언과 함께 메서드를 호출할 수 있다.
    String result2 = printHello();
    System.out.println(result2);
    
    // 문자열이 필요한 곳에 직접 메서드 호출 코드를 넣을 수 있다.
    // => 이 경우 printHello()를 먼저 실행하고, 리턴 값을 메서드 호출 자리에 놓는다.
    // => 그리고 println()을 실행한다.
    System.out.println(printHello());
    
    // 리턴 값이 필요 없으면 반드시 받을 필요는 없다.
    // 이 경우 리턴 값은 버려진다.
    printHello(); // OK!
    
  }

}





