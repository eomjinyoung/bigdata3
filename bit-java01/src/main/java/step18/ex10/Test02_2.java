/* 인터페이스 : 응용 II
 * => 인터페이스와 익명클래스의 결합.
 * 
 */
package step18.ex10;

import java.util.ArrayList;

public class Test02_2 {

  public static void main(String[] args) {
    Factory factory = new Factory();
    
    // 익명 클래스로 Selector 인터페이스 구현
    Selector selector = new Selector() {
      public boolean test(Apple apple) {
        return "red".equals(apple.color);
      }
    };
    
    ArrayList apples = factory.buy(selector); 

    // 사과를 출력한다.
    for (Object apple : apples) {
      System.out.println(apple);
    }
  }

}





