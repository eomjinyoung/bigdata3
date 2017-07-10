/* 명령어의 실행 흐름 제어: 조건문 switch - 4바이트 정수 값과 문자열, enum 값만 사용할 수 있다. II
 */
package step05;

public class Test02_5 {
  static enum Level { // enum은 이름으로 값을 지정하는 특별한 문법
    GUEST, MEMBER, MANAGER
  }
  
  public static void main(String[] args) {
    Level a = Level.GUEST; // a 변수에는 Level에 선언된 이름만 담을 수 있다.
    
    switch (a) {
    case GUEST: // case에는 Level의 이름만 지정한다.
      System.out.println("손님입니다.");
      break;
    case MEMBER:
      System.out.println("회원입니다.");
      break;
    case MANAGER:
      System.out.println("관리자입니다.");
      break;
    default:
      System.out.println("사용권한이 없습니다.");
    }
  } 

}









