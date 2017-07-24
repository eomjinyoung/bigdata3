/* 인터페이스 : 응용
 * => 인터페이스는 호출자(사용자)와 피호출자(도구) 사이의 사용 규칙을 정의한 것이다.
 * => 호출자(사용자): Factory
 * => 피호출자(도구): Selector
 */
package step18.ex10;

import java.util.ArrayList;

public class Test01 {

  public static void main(String[] args) {
    // 공장 객체를 준비한다.
    Factory factory = new Factory();
    
    // 공장에서 생산한 사과를 산다.
    ArrayList apples = factory.buy(); 

    // 사과를 출력한다.
    for (Object apple : apples) {
      System.out.println(apple);
    }
  }

}





