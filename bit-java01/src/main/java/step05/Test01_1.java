/* 명령어의 실행 흐름 제어: 조건문 if
 * => 조건이 참일 경우 명령어를 실행하게 한다.
 * => 문법
 *    if (조건) 명령문;
 *    if (조건) {
 *      명령문; 
 *      명령문; 
 *      명령문;
 *    } 
 */
package step05;

public class Test01_1 {

  public static void main(String[] args) {
    int a = 70;

    if (a < 19) 
      System.out.println("미성년이다!");
    
    if (a >= 19 && a < 40)
      System.out.println("청년이다!");
    
    if (a >= 40 && a < 65)
      System.out.println("중년이다!");
    
    if (a >= 65)
      System.out.println("노인이다!");
  } 

}









