/* start entry 
   => JVM이 클래스를 실행할 때 제일 먼저 실행하는 부분 
      다음의 형식으로 작성된 코드를 제일 먼저 실행한다.
      public static void main(String[] args) {}
      
 */

public class Test06 {
    // 클래스 블록 바로 아래에 자바 코드를 작성할 수 없다.
    // 항상 "메서드(method)"라 불리는 블록 안에 작성해야 한다.
    // 실행할 때 JVM을 통해 실행한다.
    void m1() {
        System.out.println("m1()...");
    }

    public static void main(String[] args) {
        System.out.println("main()...");
    }
} 
