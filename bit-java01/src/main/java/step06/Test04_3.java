/* 메서드 : 메서드 파라미터 응용 III 
 * => 메서드를 정의할 때 같은 이름의 메서드를 여러 개 정의할 수 있다.
 *    단 파라미터의 타입과 개수, 순서가 달라야 한다.
 * => 메서드 이름을 다르게 하면 되지 왜 같게 하는가?
 *    같은 기능을 하는 메서드에 대해 같은 이름을 갖게하면,
 *    개발자는 메서드 이름을 암기하기 쉬워지고, 
 *    메서드를 사용하기 쉬워진다.
 * => 이것을 객체지향에서는 "오버로딩(overloading"이라 부른다.
 *    즉 "파라미터의 타입이나 개수, 순서가 다르더라도 같은 기능을 수행한다면,
 *       같은 이름을 부여함으로써 메서드 사용에 일관성을 부여하는 문법"
 *    
 */
package step06;

public class Test04_3 {
  
  static void printHello(String name, String email) {
    System.out.printf("Hello, %s(%s)\n", name, email);
  }

  // 같은 이름의 메서드를 선언할 때 타입과 개수, 순서만 다르면 괜찮다.
  static void printHello(String name, int age) {
    System.out.printf("Hello, %s(%d)\n", name, age);
  }
  
  public static void main(String[] args) {
    // 파라미터 변수의 타입과 개수, 순서가 일치하도록 값을 넘겨야 한다. 
    
    // 같은 이름의 메서드가 여러 개일 경우, 아규먼트의 타입과 일치하는 메서드를 호출한다.
    printHello("홍길동", "hong@test.com");
    printHello("임꺽정", 20);
    
    // 반드시 타입과 개수, 순서를 지켜야 한다.
    //printHello("안중근", 3.14f); // 컴파일 오류!
    //printHello("유관순"); // 컴파일 오류!
    //printHello(20, "윤봉길"); // 컴파일 오류! 
  }

}





