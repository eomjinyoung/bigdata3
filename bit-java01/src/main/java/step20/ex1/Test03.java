/* 애노테이션(annotation)
 * => 자바에서 제공하는 애노테이션 응용 
 */
package step20.ex1;

import java.util.ArrayList;

public class Test03 {
  
  // 메서드 선언에 애노테이션을 붙이면 그 메서드 전체에 대해 적용한다.
  @SuppressWarnings("rawtypes") // generic을 안 붙여도 경고 띄우지 말라!
  public static void main(String[] args) {
    ArrayList list = new ArrayList();

    list.add("hello");
    list.add(1);
    
    // 다음 변수에 대해서도 @SuppressWarnings 애노테이션이 적용된다.
    ArrayList list2 = new ArrayList();
  }
}










