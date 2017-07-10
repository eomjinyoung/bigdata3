/* 메서드 : 메서드 정의 IV - 리턴 타입도 있고 파라미터도 있는 메서드 
 */
package step06;

public class Test03_4 {
  
  // 메서드 정의
  static String printHello(String name) {
    return "Hello, " + name + "!";
  }

  public static void main(String[] args) {
    // 메서드 호출
    String result = printHello("홍길동");
    System.out.println(result);
    
    String result2 = printHello("임꺽정");
    System.out.println(result2);
    
    System.out.println(printHello("유관순"));
  }

}





