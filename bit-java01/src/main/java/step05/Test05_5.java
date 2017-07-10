/* 명령어의 실행 흐름 제어: 반복문 for - continue
 * => 
 */
package step05;

public class Test05_5 {

  public static void main(String[] args) {
    for (int a = 1; a <= 10; a++) {
      if ((a % 2) == 1)
        continue; // 증가/감소 문장으로 이동한다.
      System.out.println(a);
    }
  } 

}









