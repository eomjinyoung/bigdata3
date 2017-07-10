/* 메서드 : 메서드 파라미터 응용 VI 
 * => ... 파라미터의 값을 꺼낼 때는 배열처럼 사용하면 된다. 
 */
package step06;

public class Test04_6 {
  
  static void printHello(String name, String... email) {
    System.out.println(name);
    /*
    for (String e : email) 
      System.out.print(e + ",");
    */
    for (int i = 0; i < email.length; i++)
      System.out.print(email[i] + ",");
    
    System.out.println(); //파라미터에 값을 주지 않으면 빈 줄을 의미한다.
  }

  public static void main(String[] args) {
    printHello("홍길동");
    printHello("홍길동", "hong@test.com");
    printHello("홍길동", "hong@test.com", "hong@gmail.com");
    printHello("홍길동", "hong@test.com", "hong@gmail.com", "hong@naver.com");
  }
}





