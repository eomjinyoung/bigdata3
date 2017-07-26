/* 예외 처리 문법: throws 명령 사용법 - 예외 전달 체인
 * => 예외를 호출자에게 전달하면,
 *    그 호출자는 try ~ catch ~ 로 예외를 처리해야 한다.
 *    만약 처리하지 않는다면,
 *    그 호출자도 그 상위 호출자에게 예외를 전달해야 한다.
 * 
 * => 즉 코드를 실행하다가 예외를 받으면 
 *    try ~ catch ~ 로 처리하거나,
 *    아니면 상위 호출자에게 다시 던져야 한다.
 *    
 * => 상위 호출자에게 예외를 전달할 때 주의 할 점!
 *    - 최상위 호출자인 main()에서는 반드시 예외를 처리하도록 하라!
 *    - 마약 처리하지 않는다면 main() 호출자인 JVM에게 전달되고,
 *      JVM은 즉시 실행을 멈춘다.
 *    - 예외가 발생했을 때 즉시 실행을 멈춘다면 예외 처리 문법을 사용해야 할 이유를 상실하는 것이다.
 *      그러니까 최소한 main() 메서드에서는 예외 처리를 해야 한다.
 *    
 *    
 */
package step22.ex5;

import javax.management.BadStringOperationException;

public class Test03_4 {

  static void m4(String str) throws Exception {
    m3(str);  // m3() 선언부에서 Exception 예외를 던질 수 있다고 했기 때문에
              // 이 메서드에서는 try ~ catch ~로 처리하거나
              // 아니면 자신을 호출한 상위 호출자에게 다시 던지는 방법 밖에 없다.
  }
  
  static void m3(String str) throws Exception {
    m2(str); // m2() 선언부에서 Exception 예외를 던질 수 있다고 했기 때문에
             // 이 메서드에서는 try ~ catch ~로 처리하거나
             // 아니면 자신을 호출한 상위 호출자에게 다시 던지는 방법 밖에 없다.
  }

  static void m2(String str) throws Exception {
    m1(str); // m1()에서 전달 받은 예외를 try ~ catch ~로 처리하지 않으면 
             // m2()에서도 상위 호출자에게 예외를 전달해야 한다.
             // 메서드 선언부에는 m1()으로부터 어떤 예외를 받아 상위에 다시 전달할 것인지 지정해야 한다.
             // 즉 m1()이 Exception을 던진다고 했기 때문에 
             // m2() 선언부에 Exception 던진다고 선언하라!
  }
  
  static void m1(String str) throws Exception {
    
    if (str == null)
      throw new NullPointerException("파라미터 값이 null입니다.");
    else if (str.length() == 0) 
      throw new BadStringOperationException("빈 문자열입니다.");
    
    System.out.println(str);
  }
  
  
  
  public static void main(String[] args) {
    // main() 메서드는 예외를 처리하는 마지막 보루이다.
    // 여기서 예외를 처리하도록 해라!
    // 여기에서 마저 예외를 처리하지 않으면 JVM에게 전달해야 하는데,
    // JVM에게 예외를 전달하는 순간 즉시 프로그램 실행이 종료될 것이다.
    try {
      //m4("Hello!");
      m4(null);
      //m4("");
    } catch (Exception e) {
      System.out.println("예외가 발생했네요! 적절하게 초기할게요.");
    }
    
    // 또 다른 작업
    System.out.println("또 다른 작업을 수행!");
  }

}










