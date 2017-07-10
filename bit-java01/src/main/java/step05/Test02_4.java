/* 명령어의 실행 흐름 제어: 조건문 switch - 4바이트 정수 값과 문자열, enum 값만 사용할 수 있다.
 */
package step05;

public class Test02_4 {
  public static void main(String[] args) {
    byte a = 10; // OK!
    //short a = 10; // OK!
    //char a = 10; // OK!
    //int a = 10; // OK! 
    //long a = 10; // 컴파일 오류!
    //float a = 3.14f; // 컴파일 오류!
    //double a = 3.14; // 컴파일 오류!
    //boolean a = true; // 컴파일 오류!
    //String a = "오호라"; // OK! 단, case의 값이 문자열이어야 한다.

    switch (a) {
    case 10: 
      System.out.println("테스트");
      break;
    default:
      System.out.println("기타");
    }
  } 

}









