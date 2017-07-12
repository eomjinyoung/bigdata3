/* 스태틱 블록 : 클래스가 로딩되는 경우 II
 * => 스태틱 블록이 실행되는 것을 통해 클래스가 로딩되는 순서를 확인해보자!
 * 
 */
package step09;

class X {
  static int value;
  static {
    System.out.println("<X>");
    Y.value = 100;
    value = 100;
    System.out.println("</X>");
  }
}

class Y {
  static int value;
  static {
    System.out.println("<Y>");
    X.value = 200;
    value = 200;
    System.out.println("</Y>");
  }
}

public class Test03_4 {
  public static void main(String[] args) {
    System.out.println(X.value);
    
  }
}









