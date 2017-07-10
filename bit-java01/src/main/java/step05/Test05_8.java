/* 명령어의 실행 흐름 제어: 반복문 for 와 Collection 객체
 * => 배열 뿐만아니라 Collection 객체도 가능하다.
 *    for (컬렉션에서 꺼낸 값을 담을 변수 선언 : 컬렉션객체) 
 *      명령문;
 * => 컬렉션 전체를 반복할 때 유용하다.
 *    단 컬렉션의 일부를 반복할 수는 없다.
 */
package step05;

import java.util.ArrayList;

public class Test05_8 {

  public static void main(String[] args) {
    ArrayList<String> nameList = new ArrayList<>();
    nameList.add("홍길동");
    nameList.add("임꺽정");
    nameList.add("유관순");
    nameList.add("안중근");
    nameList.add("윤봉길");
    
    for (String value : nameList) { 
      System.out.println(value);
    }
  } 

}









