/* 제네릭(generic) 문법 사용 전 
 * => Apple, Pear, Grape 과일 마다 그 과일을 담을 상자 클래스를 정의하였다.
 *    비록 상자 클래스의 이름이 다르더라도 그 내부의 코드는 거의 같다. 
 *    즉 계속 중복된 코드를 작성하는 문제가 있다.
 * => 해결 방안? 
 *    다음 패키지에 ...
 */
package step19.ex1;

public class Test01 {

  public static void main(String[] args) {
    // 사과 상자 준비
    AppleBox appleBox = new AppleBox();
    
    // 사과를 담는다.
    appleBox.add(new Apple("red", 120));
    appleBox.add(new Apple("red", 180));
    appleBox.add(new Apple("green", 110));
    appleBox.add(new Apple("green", 120));
    appleBox.add(new Apple("yelllow", 200));
    
    // 사과 목록을 가져와서
    Apple[] appleList = appleBox.toArray();
    
    // 출력한다.
    for (Apple apple : appleList) {
      System.out.println(apple);
    }
    
    

  }

}
