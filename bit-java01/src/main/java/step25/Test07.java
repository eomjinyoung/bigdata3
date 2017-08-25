/* 스레드 - 자바의 기본 스레드들
 * 
 *     
 */
package step25;

public class Test07 {
  
  public static void main(String[] args) {
    //=> 현재 이 코드를 실행하는 스레드를 알아내기
    Thread t = Thread.currentThread();
    System.out.println(t.getName());
    
  }
}


