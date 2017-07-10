/* 명령어의 실행 흐름 제어: 조건문 switch - break II
 * => break가 없으면 계속 다음 문장을 실행한다. 
 */
package step05;

public class Test02_3 {

  public static void main(String[] args) {
    String str = "팀장";

    switch (str) {
    case "팀장": 
      System.out.println("PMP 자격증");
      break;
    case "개발자":
    case "설계자":
    case "DB모델러":
      System.out.println("정보처리 자격증");
    case "일반":
      System.out.println("오피스 자격증");
    default:
      System.out.println("고졸 이상");
    }
  } 

}









