/* 논리 연산자: &&, ||
 * => 논리 연산의 결과는 true 또는 false이다. 
 * => 피연산자는 반드시 논리 값이어야 한다.
 */
package step04;

public class Test03_1 {
  public static void main(String[] args) {
    //System.out.println(5 && 2); // 논리 연산자는 논리 값이 아닌 경우 사용할 수 없다.
    
    // &&(AND): 피연산자 모두가 true일 때, 결과는 true가 된다.
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && true);
    System.out.println(false && false);
    
    // ||(OR): 피연산자 중에서 한 개라도 true이면, 결과는 true이다.
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);
  }
}
