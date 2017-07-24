/* 인터페이스 : 응용 II
 * => 인터페이스와 익명클래스의 결합.
 * 
 */
package step18.ex10;

import java.util.ArrayList;

public class Test02 {

  public static void main(String[] args) {
    Factory factory = new Factory();
    
    /* 이렇게 사과를 골라주는 클래스를 외부에 만들어 놓고 사용할 수도 있지만,
     * 유지보수를 난해하게 만드는 점이 있다.
     * 1) MySelector가 뭐하는 놈인지 알려면 해당 클래스를 찾아가서 코드를 봐야 한다.
     * 2) 향후 다양한 조건이 추가되었을 때 계속 Selector를 구현한 클래스를 추가해야 한다.
     *    명시적으로 코드가 많지 않은 클래스를 많이 만들어야 한다.
     * 해결책!
     * => anonymous 클래스를 사용하라!
     * => 익명 클래스는 따로 별도의 파일에 클래스를 정의하는 것이 아니라,
     *    그 객체가 필요한 위치에 즉시 정의하기 때문에 코드를 바로 파악할 수 있다.
     * => 필요할 때 잠깐 만들기 때문에 명시적으로 많은 클래스 파일을 작성할 필요가 없다.
     */ 
    /*
    Selector selector1 = new MySelector(); // red 사과
    Selector selector2 = new MySelector2();// 150g 이상되는 사과
    Selector selector3 = new MySelector3();// red + 150g
    */
    
    // => 이렇게 buy()를 호출하는 문장에 익명 클래스를 만들기 때문에
    //    어떤 사과를 고르는지 바로 코드를 파악할 수 있다.
    // => 이전 코드에서는 MySelector나 MySelector2, MySelector3의 소스 파일을 찾아가서 
    //    코드를 확인해야 했다.
    //    그러나 지금은 여기, 바로 여기에 Selector의 코드가 있다.
    ArrayList apples = factory.buy(new Selector() {
      public boolean test(Apple apple) {
        return "red".equals(apple.color);
      }
    }); 

    // 사과를 출력한다.
    for (Object apple : apples) {
      System.out.println(apple);
    }
  }

}





