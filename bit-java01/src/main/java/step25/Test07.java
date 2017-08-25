/* 스레드 - 자바의 기본 스레드들
 * "system" 스레드그룹 
 *   => "main" 스레드그룹 
 *      => "main" 스레드 : 실제 main()를 호출하는 스레드 
 *     
 */
package step25;

public class Test07 {
  
  public static void main(String[] args) {
    //=> 현재 이 코드를 실행하는 스레드를 알아내기
    Thread t = Thread.currentThread();
    System.out.println(t.getName());
    
    //=> "main" 스레드가 소속되어 있는 스레드 그룹
    ThreadGroup g1 = t.getThreadGroup();
    System.out.println(g1.getName());
    
    //=> "main" 스레드 그룹의 상위 그룹
    ThreadGroup g2 = g1.getParent();
    System.out.println(g2.getName());
    
    //=> "system" 스레드 그룹의 상위 그룹
    ThreadGroup g3 = g2.getParent();
    System.out.println(g3); // null - system 위에 상위 그룹이 없다.
    
    //=> "system"의 하위 그룹
    System.out.println("-------------------------------");
    ThreadGroup[] groups = new ThreadGroup[10];
    int count = g2.enumerate(groups);
    for (int i = 0; i < count; i++) {
      System.out.println(groups[i].getName());
    }
    
    
    
  }
}


