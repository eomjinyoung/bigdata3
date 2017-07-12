/* 스태틱 블록 
 * => 클래스가 로딩되고, 클래스 변수가 생성된 후 실행시키는 코드 블록이다.
 * => 그래서 주로 클래스 변수를 초기화시키는 데 이용한다.
 * => 클래스 메서드가 사용할 값을 준비시키는 데 이용한다.
 * => 문법
 *    static {...}
 * => 한 클래스에 여러 개의 static 블록을 둘 수 있지만,
 *    static 블록을 만들더라도 유지보수에 헷갈리지 않게 한 개 정도만 두도록 하라!
 */
package step09;


public class Test03_1 {
  // 스태틱 변수는 값을 주지 않으면 기본이 0이다.
  // => byte,short,char,int,long = 0
  // => boolean = false
  // => float, double = 0.0
  static int a;
  static int b;
  static int c = 10;
  
  // 스태틱 블록
  static {
    System.out.println("스태틱 블록 실행");
    a = 100;
    b = 200;
    c = 300;
  }
  
  
  public static void main(String[] args) {
    b = 20;
    System.out.println("main()...");
    System.out.printf("a=%d\n", a);
    System.out.printf("b=%d\n", b);
    System.out.printf("c=%d\n", c);
    
  }
}









