/* 명령어의 실행 흐름 제어: 반복문 while - continue 라벨
 * => 중첩된 반복문에서 가장 바깥쪽 반복문으로 실행을 이동시키기
 */
package step05;

public class Test03_6 {

  public static void main(String[] args) {
    int a = 1;

    loop1: while (a < 9) {
      a++;
      int b = 0;
      while (b < 9) {
        b++;
        if (a == 5)
          continue loop1; // 라벨을 지정하면 그 라벨이 붙은 반복문의 조건으로 이동한다.
        System.out.printf("%d * %d = %d\n", a, b, a * b);
      }
      System.out.println("------------------");
    }
    
    System.out.println("끝!");
  } 

}









