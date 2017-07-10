/* 명령어의 실행 흐름 제어: 반복문 while - break 라벨
 * => 중첩된 반복문에서 가장 바깥쪽 반복문 실행을 종료하기
 */
package step05;

public class Test03_5 {

  public static void main(String[] args) {
    int a = 2;

    while (a <= 9) {
      int b = 1;
      while (b <= 9) {
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        b++;
      }
      a++;
      System.out.println("------------------");
    }
    
    System.out.println("끝!");
  } 

}









