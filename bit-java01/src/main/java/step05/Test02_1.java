/* 명령어의 실행 흐름 제어: 조건문 switch
 * => 주어진 값이 특정 값과 일치할 때 명령문을 수행한다. 
 * => 문법
 *    switch (값) {
 *    case 값1:
 *      명령문; 
 *      break;
 *    case 값2:
 *      명령문; 
 *    default:
 *      명령문;
 *    } 
 */
package step05;

public class Test02_1 {

  public static void main(String[] args) {
    int a = 50;

    switch (a) {
    case 10:
      System.out.println("10대 입니다.");
      break;
    case 20:
      System.out.println("20대 입니다.");
      break;
    case 30: 
      System.out.println("30대 입니다.");
      break;
    default:
      System.out.println("기타입이다!");
    }
  } 

}









