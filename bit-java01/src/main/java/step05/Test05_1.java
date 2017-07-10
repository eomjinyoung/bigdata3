/* 명령어의 실행 흐름 제어: 반복문 for 
 * => 초기 값이 조건에 부합하는 동안에는 계속 명령문 실행을 반복한다. 
 * => 배열처럼 인덱스를 다루는 경우 for 문을 자주 사용한다.
 * => 문법
 *    for (변수선언; 조건; 증가/감소)
 *      명령문;
 *    for (변수선언; 조건; 증가/감소) {
 *      명령문;
 *      명령문;
 *    }
 * => 실행순서
 *    1) 변수선언 (딱 한 번만 실행한다)
 *    2) 조건
 *    3) 명령문
 *    4) 증가/감소
 *    5) 2 번으로 간다.
 */
package step05;

public class Test05_1 {

  public static void main(String[] args) {
    for (int a = 1; a <= 10; a++)
      System.out.println(a);
  } 

}









