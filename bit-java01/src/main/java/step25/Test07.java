/* 스레드 - 자바의 기본 스레드들
 * "system" 스레드그룹 
 *   => "main" 스레드그룹 
 *      => "main" 스레드 : 실제 main()를 호출하는 스레드 
 *   => "Reference Handler" 스레드 : 인스턴스를 가리키는 레퍼런스를 관리한다.
 *   => "Finalizer" 스레드 : 가비지 인스턴스를 메모리에서 해제하는 일을 담당.
 *   => "Signal Dispatcher" 스레드 : 키보드, 네트워크 이벤트를 관리
 *   => "Attach Listener" 스레드  
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
    
    //=> "system"에 속해있는 스레드들
    System.out.println("-------------------------------");
    Thread[] threads = new Thread[10];
    count = g2.enumerate(threads, false); // 하위 그룹에 속해있는 스레드는 제외. 직속 스레드만!
    for (int i = 0; i < count; i++) {
      System.out.println(threads[i].getName());
    }
    
    //=> "main" 스레드 그룹의 하위 스레드 그룹 
    System.out.println("-------------------------------");
    count = g1.enumerate(groups);
    for (int i = 0; i < count; i++) {
      System.out.println(groups[i].getName());
    }
    // 아무것도 출력되지 않는다. 결론! "main" 그룹 안에 다른 그룹이 없다.
    
    //=> "main"에 속해있는 스레드들
    System.out.println("-------------------------------");
    count = g1.enumerate(threads, false);
    for (int i = 0; i < count; i++) {
      System.out.println(threads[i].getName());
    }
    // 결론! "main" 그룹 안에는 "main"이라는 스레드가 한 개만 있다.
    
  }
}


