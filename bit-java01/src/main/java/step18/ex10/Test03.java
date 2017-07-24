/* 인터페이스 : 응용 III
 * => 인터페이스와 람다의 결합.
 * 
 */
package step18.ex10;

import java.util.ArrayList;

public class Test03 {

  public static void main(String[] args) {
    Factory factory = new Factory();
    
    // 익명 클래스를 더 쉽게 만드는 방법 => 람다(lambda) 문법을 활용하라! 
    ArrayList apples = factory.buy((Apple apple) -> "red".equals(apple.color)); 

    // 사과를 출력한다.
    for (Object apple : apples) {
      System.out.println(apple);
    }
  }

}





