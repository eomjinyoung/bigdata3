/* 제네릭 응용: ArrayList II
 * => 자바에서 제공하는 대부분의 클래스들은 제네릭을 사용하고 있다.
 */
package step19.ex5;

import java.util.ArrayList;

public class Test02 {
  
  public static void main(String[] args) {
    // 제네릭 적용 후
    ArrayList<Apple> list = new ArrayList<>();
    
    list.add(new Apple("red", 200));
    list.add(new Apple("red", 150));
    list.add(new Apple("red", 100));
    
    // 제네릭을 적용하면 다음과 같이 지정된 타입이 아닌 것은 컴파일 단계에서 걸러준다.
    //list.add(new String("홍길동")); // 컴파일 오류!
    
    // 형변환이 필요 없기 때문에 바로 for ( : ) 문법을 사용할 수 있다.
    for (Apple apple : list) {
      System.out.printf("%s(%d)\n", apple.color, apple.weight);
    }
  }

}










