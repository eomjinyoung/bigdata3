/* 인터페이스 : 다중 상속
 * => 인터페이스에 선언된 메서드는 모두 추상 클래스이기 때문에
 *    다중 상속을 해도 문제가 발생하지 않는다.
 * => 다만 다중 상속을 할 수 없는 경우는,
 *    메서드의 이름과 파라미터는 같지만 리턴 타입이 다른 경우는 
 *    다중 상속을 할 수 없다.
 */
package step18.ex8;

public class Test01 {
  public static void main(String[] args) {
    Concrete obj = new Concrete();
    
    // 다음 각각의 인터페이스 입장에서는 Concrete 클래스가
    // 자신들의 메서드를 모두 구현했기 때문에 해당 인스턴스를 가리킬 수 있다.
    C r1 = obj;
    B r2 = obj;
    A r3 = obj;
  }
}





