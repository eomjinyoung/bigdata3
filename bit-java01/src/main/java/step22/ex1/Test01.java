/* 예외 처리 문법을 사용하기 전
 * => 메서드의 리턴 값에 의존하여 예외 상황을 처리한다.
 */
package step22.ex1;

public class Test01 {

  public static void main(String[] args) {
    AppleBox appleBox = new AppleBox();
    
    for (int i = 0; i < 50; i++) {
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
