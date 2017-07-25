/* 애노테이션(annotation)
 * => 자바에서 제공하는 애노테이션 응용 
 */
package step20.ex1;

import java.util.ArrayList;

public class Test04 {
  
  // rawtypes : 제네릭을 적용하지 않아도 경고 띄우지 말라!
  // unchecked: 제네릭이 적용되지 않은 리스트에 타입이 일치하는지 검사하지 않더라도 경고 띄우지 말라!
  // unused: 변수 만들어 놓고 사용하지 않더라도 경고 띄우지 말라!
  @SuppressWarnings({ "rawtypes", "unchecked", "unused" })
  public static void main(String[] args) {
    ArrayList list = new ArrayList();

    list.add("hello");
    list.add(1);
    
    ArrayList list2 = new ArrayList();
  }
}










