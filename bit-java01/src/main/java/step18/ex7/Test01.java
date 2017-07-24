/* 인터페이스: 상속
 * => 인터페이스도 클래스처럼 상속 받을 수 있다.
 * => 다만 그 인터페이스를 구현하는 클래스는 
 *    인터페이스가 상속 받은 메서드까지 모두 구현해야 한다.
 */
package step18.ex7;

public class Test01 {

  public static void main(String[] args) {
    Concrete obj = new Concrete();
    C r1 = obj; // Concrete는 C 인터페이스를 구현하였다. OK!
    B r2 = obj; // Concrete는 C 인터페이스를 구현하였기 때문에
                // C의 부모 인터페이스도 구현한 것이다. OK!
    A r3 = obj; // 당빠, C의 조상인 A 인터페이스도 구현한 것이 된다. OK!
    

  }

}
