/* 제네릭(generic) 문법 사용 전 
 * => Apple, Pear, Grape 과일 마다 그 과일을 담을 상자 클래스를 
 *    따로 정의하는 방식은 유지보수에 좋지 않다.
 *    과일이 추가될 때마다 계속 상자 클래스를 만들어야 하기 때문이다.
 *    해결책?
 *    Apple, Pear, Grape를 한 조상 밑에 둬라!
 *    즉 Fruit 클래스를 만들어 Apple, Pear, Grape의 조상이 되게 한다.
 * => 그러면 과일마다 상자를 따로 만들 필요가 없이 
 *    FruitBox 하나면 된다. 
 */
package step19.ex2;

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
