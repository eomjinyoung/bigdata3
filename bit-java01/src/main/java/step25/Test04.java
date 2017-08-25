/* 스레드 - Runnable 인터페이스
 * => Runnable 인터페이스를 사용하면,
 *    별도의 중첩 클래스를 만들지 않고 
 *    직접 인터페이스를 구현할 수 있어 편리하다. 
 */
package step25;

public class Test04 implements Runnable {
  
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.printf("Runnable1 ----> %d\n", i);
    }
  }

  public static void main(String[] args) {
    Test04 runnable = new Test04();
    
    Thread t = new Thread(runnable);
    t.start(); 
    
    for (int i = 0; i < 1000; i++) {
      System.out.printf("main2 - %d\n", i);
    }
  }
}







