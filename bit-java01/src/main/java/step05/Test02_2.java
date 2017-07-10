/* 명령어의 실행 흐름 제어: 조건문 switch - break
 * => break가 없으면 계속 다음 문장을 실행한다. 
 */
package step05;

public class Test02_2 {

  public static void main(String[] args) {
    int a = 30;

    switch (a) {
    case 10:
      System.out.println("10대 입니다.");
    case 20:
      System.out.println("20대 입니다.");
    case 30: 
      System.out.println("30대 입니다.");
    default:
      System.out.println("기타입이다!");
    }
  } 

}









