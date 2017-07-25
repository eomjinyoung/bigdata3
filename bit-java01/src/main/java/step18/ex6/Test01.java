/* 인터페이스 : 다중 구현
 * - 클래스는 여러 인터페이스를 동시에 구현할 수 있다.
 * - 각각의 인터페이스 구현 조건만 만족시키면 된다.
 */
package step18.ex6;

public class Test01 {
  
  public static void main(String[] args) {
    A obj = new Concrete(); // OK! Concrete는 A 인터페이스를 구현하였다.
    B obj2 = new Concrete(); // OK! Concrete는 또한 B 인터페이스도 구현하였다.
    
    /* 즉 obj 레퍼런스는 A 인터페이스를 구현했는지만 따진다. 
     * Concrete가 다른 B 인터페이스도 구현했는지는 따지지 않는다.
     * 
     */
    
  }

}








