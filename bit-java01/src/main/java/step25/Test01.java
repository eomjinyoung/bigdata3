/* 스레드 - 스레드 사용 전
 * => 코드는 항상 위에서 아래로 순서대로 실행한다. 
 */
package step25;

public class Test01 {

  public static void main(String[] args) {
    for (int i = 0; i < 1000; i++) {
      System.out.printf("main1 - %d\n", i);
    }
    
    for (int i = 0; i < 1000; i++) {
      System.out.printf("main2 - %d\n", i);
    }
  }
}
