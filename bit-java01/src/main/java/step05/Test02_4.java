/* 명령어의 실행 흐름 제어: 조건문 switch - 2바이트 정수 값과 문자열만 값으로 사용할 수 있다.
 */
package step05;

public class Test02_4 {

  public static void main(String[] args) {
    //byte a = 10; // OK!
    short a = 10;
    
    switch (a) {
    case 10: 
      System.out.println("테스트");
      break;
    default:
      System.out.println("기타");
    }
  } 

}









