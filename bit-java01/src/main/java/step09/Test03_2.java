/* 스태틱 블록 : 여러 개의 스태틱 블록 
 * => 클래스가 로딩되고, 
 *    클래스 변수가 생성된 후,
 *    작성한 순서대로 스태틱 블록을 실행한다.
 */
package step09;


public class Test03_2 {
  static int a;
  static int b;
  static int c;
  
  // 스태틱 블록
  static {
    System.out.println("스태틱 블록1:");
    a = 100;
  }
  
  
  public static void main(String[] args) {
    System.out.println("main()...");
    System.out.printf("a=%d\n", a);
    System.out.printf("b=%d\n", b);
    System.out.printf("c=%d\n", c);
    
  }
  
  // 스태틱 블록
  static {
    System.out.println("스태틱 블록2:");
    b = 200;
  }
  
  // 스태틱 블록
  static {
    System.out.println("스태틱 블록3:");
    c = 300;
  }
}









