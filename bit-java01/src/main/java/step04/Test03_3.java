/* 논리 연산자: &와 |의 연산 원리 
 * => &, |는 비트 논리 연산뿐만 아니라 일반 논리 연산에도 사용할 수 있다.
 * => 다만 &&, || 연산자와 달리 
 *    &, | 연산자는 결과에 상관없이 무조건 뒤의 식을 수행한다.
 *    
 */
package step04;

public class Test03_3 {
  public static void main(String[] args) {
    boolean a = false;
    boolean b = false;
    boolean result = a & (b = true); // a의 값이 false이기 때문에 이미 결과는 false이다.
                                      // 그럼에도 불구하고 무조건 뒤의 식을 수행한다.
    System.out.printf("a=%b, b=%b, result=%b\n", a, b, result);
    
    a = true;
    b = false;
    result = a | (b = true); // a 값이 true이기 때문에 결과는 true이다. 
                              // 그럼에도 불구하고 무조건 뒤의 식을 수행한다.
    System.out.printf("a=%b, b=%b, result=%b\n", a, b, result);
  }
}









