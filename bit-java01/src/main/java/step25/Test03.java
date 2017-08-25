/* 스레드 - 스레드 만드는 방법
 * 1) Thread를 상속 받아 만들기
 * 2) Runnable 인터페이스 구현하기
 *          
 */
package step25;

public class Test03 {
  
  static class MyRunnable implements Runnable {
    @Override
    public void run() {
      for (int i = 0; i < 1000; i++) {
        System.out.printf("Runnable1 ----> %d\n", i);
      }
    }
  }

  public static void main(String[] args) {
    MyRunnable runnable = new MyRunnable();
    
    // 아무것도 안하는 기본 스레드에 해야할 일을 적어 놓은 
    // Runnable을 생성자를 호출할 때 등록한다.
    // 그러면 Thread를 실행할 때 등록된 객체의 run() 메서드가 
    // 호출된다.
    Thread t = new Thread(runnable);
    t.start(); 
    
    for (int i = 0; i < 1000; i++) {
      System.out.printf("main2 - %d\n", i);
    }
  }
}











