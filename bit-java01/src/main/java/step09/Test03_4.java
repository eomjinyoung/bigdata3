/* 스태틱 블록 : 클래스가 로딩되는 경우 II
 * => 스태틱 블록이 실행되는 것을 통해 클래스가 로딩되는 순서를 확인해보자!
 * 
 */
package step09;

class MyClassX {
  static int x;
  static {
    System.out.println("<MyClassX>");
    MyClassY.y = 200;
    x = 100;
    System.out.println("</MyClassX>");
  }
}

class MyClassY {
  static int y;
  static {
    System.out.println("<MyClassY>");
    MyClassX.x = 200;
    y = 200;
    System.out.println("</MyClassY>");
  }
}

public class Test03_4 {
  public static void main(String[] args) {
    System.out.println(MyClassX.x);
    
  }
}









