/* 예외 처리 문법을 사용하기 전
 * => 메서드의 리턴 값에 의존하여 예외 상황을 처리한다.
 */
package step22.ex1;

public class Test01 {

  public static void main(String[] args) {
    AppleBox appleBox = new AppleBox(10);
    
    for (int i = 0; i < 50; i++) {
      // 예외 처리 문법이 없었던 과거에는 
      // 다음과 같이 add() 메서드를 실행한 후 그 리턴 값을 분석하여
      // 예외 상황에 대해 처리를 하였다.
      // 이 방식의 문제점은 예외 상황을 알기 위해 리턴 값을 매번 검사해야 하고,
      // 본래의 작업을 수행하기 위해 메서드를 실행하는 코드와 
      // 예외 상황을 처리하기 위해 리턴 값을 검사하는 코드가 섞여 있어서
      // 코드를 이해하는 데 방해가 된다.
      if (appleBox.add(new Apple("red", 120)) == -1) {
        System.out.println("상자가 꽉 찼습니다.");
        break;
      }
    }
    
    Apple[] appleList = appleBox.toArray();
    
    for (Apple apple : appleList) {
      System.out.println(apple);
    }
  }
}



