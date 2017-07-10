/* 메서드 : 메서드 파라미터 응용 V 
 * => ... 파라미터는 항상 파라미터 순서에서 맨 마지막에 위치해야 한다.
 *    그 뒤에 다른 파라미터를 놓을 수 없다. 
 */
package step06;

public class Test04_5 {
  
  // ... 파라미터 다음에 다른 파리미터가 올 수 없다.
  /* 컴파일 오류!
  static void printHello(String... email, String name) {
    System.out.println(name.length);
  }
  */
  
  /* 뒤에 나오는 파라미터가 타입이 다르더라도 마찬가지이다. 컴파일 오류!
  // 물론 뒤의 타입이 다르면 구분하기는 쉬울 것이다.
  // 문제는 이런 예외적인 경우가 많아지면, 컴파일러와 JVM의 로직이 복잡해진다.
  // 가능한 컴파일러나 JVM의 기능이 단순한 것이 유지보수에 좋다.
  // 문법이 복잡해지면 컴파일러나 JVM의 코드도 길어지고 복잡해진다. 
  // 개발자도 사용하기 어려워진다. 
  // 어려우면 어려울 수록 버그 발생이 많아진다. 
  // 그래서 프로그래밍 언어는 단순하고 명확한 것이 좋다. 
  // 이런 점에서 자바 언어에 다양한 문법이 점점 추가되는 것에 대해 비판하는 목소리가 많다.
  static void printHello(String... email, int age) {
    System.out.println(name.length);
  }
  */
  
  static void printHello(String name, String... email) {
    System.out.println(name);
    System.out.println(email.length);
  }
  
  static void printHello(int age, String... email) {
    System.out.println(age);
    System.out.println(email.length);
  }

  public static void main(String[] args) {
    printHello("홍길동");
    printHello("홍길동", "hong@test.com");
    printHello("홍길동", "hong@test.com", "hong@gmail.com");
    printHello("홍길동", "hong@test.com", "hong@gmail.com", "hong@naver.com");
    
    printHello(10);
    printHello(10, "hong@test.com");
    printHello(10, "hong@test.com", "hong@gmail.com");
    printHello(10, "hong@test.com", "hong@gmail.com", "hong@naver.com");
  }

}





