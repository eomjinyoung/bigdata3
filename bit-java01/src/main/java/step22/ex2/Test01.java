/* 예외 처리 문법을 사용한 후
 * => 메서드의 리턴 값이 아니라 메서드가 어떤 예외를 던지는가에 따라 예외 처리가 결정된다.
 * => try ~ catch ~ 를 사용하여 예외를 처리하게 되면,
 *    본래 실행해야 할 코드와 예외 처리 코드를 분리할 수 있어서
 *    코드의 가독성을 좋게 한다. 
 */
package step22.ex2;

public class Test01 {

  public static void main(String[] args) {
    AppleBox appleBox = new AppleBox(10);
    
    try { // 예외를 던질 수 있는 메서드를 실행할 때는 try 블록 안에서 실행시킨다.
      // try 블록 안에 있는 코드는 본래 작업해야 할 코드이다.
      for (int i = 0; i < 50; i++) {
        appleBox.add(new Apple("red", 120));
      }
      
    } catch (Exception e) { // 만약 try 블록을 실행하는 중에 예외를 받게 되면 이 블록을 실행한다.
      // catch 블고 안에 있는 코드는 예외가 발생했을 때 수행하는 코드이다.
      System.out.println(e.getMessage());
    }
    // 이렇게 본래의 작업 코드와 예외 처리 코드를 분리하게 되면
    // 소스 코드를 읽고 해석하기가 쉬워진다.
    
    Apple[] appleList = appleBox.toArray();
    
    for (Apple apple : appleList) {
      System.out.println(apple);
    }
  }
}



