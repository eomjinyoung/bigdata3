/* 명령어의 실행 흐름 제어: 반복문 do ~ while
 * => 일단 먼저 실행하고, 조건이 참이면 명령문을 계속 반복하여 실행한다. 
 * => 문법
 *    do 명령문 while (조건);
 *    do {
 *     명령문;
 *     명령문;
 *    } while (조건);
 */
package step05;

public class Test04_1 {

  public static void main(String[] args) {
    int a = 1;

    do
      System.out.println(a);
    while (++a <= 10);
    
  } 

}









