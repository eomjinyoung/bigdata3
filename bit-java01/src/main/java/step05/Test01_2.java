/* 명령어의 실행 흐름 제어: 조건문 if - 중괄호 사용
 */
package step05;

public class Test01_2 {

  public static void main(String[] args) {
    int a = 20;

    if (a < 19) 
      System.out.println("미성년이다!");
      System.out.println("투표권이 없다!"); // 이 문장은 if 문에 소속되어 있지 않다는 것을 주의하라!
    
    // 여러 개의 문장을 묶어 실행하려면 반드시 중괄호를 사용하여 명령어를 한 덩이로 묶어야 한다.
  } 

}









