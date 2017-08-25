/* 스레드 - Critical Section(크리티컬 섹션)
 * => 여러 스레드가 코드를 실행하기 위해 동시에 진입했을 때
 *    문제가 발생할 수 있는 코드 블록이다.
 *     
 */
package step25;

public class Test05 {
  
  static class Account {
    long balance;
    
    public long withdraw(long money) {
      long temp = balance;
      if ((temp - money) >= 0) {
        temp = temp - money;
        balance = temp;
        return money;
      }
      return 0;
    }
  }
  
  static class ATM extends Thread {
    
  }
  

  public static void main(String[] args) {
    Test05 runnable = new Test05();
    
    Thread t = new Thread(runnable);
    t.start(); 
    
    for (int i = 0; i < 1000; i++) {
      System.out.printf("main2 - %d\n", i);
    }
  }
}








