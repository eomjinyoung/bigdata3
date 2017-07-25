/* 애노테이션(annotation)
 * => 자바에서 제공하는 애노테이션 응용 
 */
package step20.ex1;

import java.util.ArrayList;

public class Test03 {
  
  public static void main(String[] args) {
    // 변수 선언에 애노테이션을 붙이면 그 변수 선언에만 적용된다.
    @SuppressWarnings("rawtypes") // generic을 안 붙여도 경고 띄우지 말라!
    ArrayList list = new ArrayList();

    list.add("hello");
    list.add(1);
    
    // 다음 변수 선언에는 적용되지 않는다.
    ArrayList list2 = new ArrayList();
  }
}










