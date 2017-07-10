/* 명령어의 실행 흐름 제어: 반복문 while
 * => 조건이 참인 동안은 계속 명령문을 실행한다. 
 * => 문법
 *    while (조건) 명령문;
 *    while (조건) {
 *      명령문;
 *      명령문;
 *    } 
 */
package step05;

public class Test03_1 {

  public static void main(String[] args) {
    int a = 0;

    while (++a <= 10) 
      System.out.println(a);
    
  } 

}









