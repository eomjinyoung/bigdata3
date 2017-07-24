/* 제네릭 응용: ArrayList 
 * => 자바에서 제공하는 대부분의 클래스들은 제네릭을 사용하고 있다.
 */
package step19.ex5;

import java.util.ArrayList;

public class Test01 {
  
  public static void main(String[] args) {
    // 제네릭 적용 전
    ArrayList list = new ArrayList();
    
    list.add(new Apple("red", 200));
    list.add(new Apple("red", 150));
    list.add(new Apple("red", 100));
    
    // 단점 제네릭으로 ArrayList에 담을 객체의 타입을 지정하지 않으면 
    // 다음과 같이 아무 객체나 담을지도 모른다.
    list.add(new String("홍길동")); // 담는 것은 문제 없다. OK! 꺼낼 때 문제가 발생한다.
    
    for (int i = 0; i < list.size(); i++) {
      Apple apple = (Apple)list.get(i); // 꺼낼 때 마다 형변환해야 하는 불편함이 있다.
      System.out.printf("%s(%d)\n", apple.color, apple.weight);
    }
    
    // 중간에 값을 꺼내 출력한는데 
    // Apple 아닌 String 때문에 형변환을 못해 실행 오류가 발생할 것이다.
    // 그래서 제네릭이 필요하다.
    // 1) 지정된 값만 허용함으로써 안전하게 실행할 수 있다.
    //    즉 컴파일 단계에서 개발자가 잘못 값을 넣는 것을 알려준다.
    // 2) 값을 꺼낸 후 원래 타입으로 형변환해야 하는 번거로움을 없애준다.

  }

}










