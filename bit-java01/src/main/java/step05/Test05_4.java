/* 명령어의 실행 흐름 제어: 반복문 for III - 조건 생략
 * => 
 */
package step05;

public class Test05_4 {

  public static void main(String[] args) {
    int a = 1;
    for (;;) { // 조건까지 생략하면 무한 반복을 의미한다.
      System.out.println(a);
      a++;
      if (a > 10)
        break;
    }
  } 

}









