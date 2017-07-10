/* 명령어의 실행 흐름 제어: 반복문 for 와 배열 II
 * => 배열을 위한 특별 for 문법
 *    for (배열의 값을 담을 변수 선언 : 배열) 
 *      명령문;
 * => 배열 전체를 반복할 때 유용하다.
 *    단 배열의 일부를 반복할 수는 없다.
 */
package step05;

public class Test05_7 {

  public static void main(String[] args) {
    int[] arr1 = {10, 20, 30, 40, 50, 60, 70};
    
    for (int value : arr1) { 
      System.out.println(value);
    }
    
    System.out.println("----------------------");
    
    String[] names = {"홍길동", "임꺽정", "유관순", "안중근", "윤봉길"};
    
    for (String name : names) {
      System.out.println(name);
    }
  } 

}









