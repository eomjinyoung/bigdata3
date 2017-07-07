/* 논리 연산자: &&와 ||의 연산 원리 
 * => &&와 || 연산자는 첫 번째 피연산자의 값에 따라 뒤의 피연산자를 수행할 지 말 지 결정한다.
 *    && 연산은 두 개의 피연산자 모두 true 일 때만 결과가 true이다.
 *    그래서 첫 번째 피연산자가 false이면 뒤의 피연산자의 값을 조사하지 않는다.
 *    || 연산은 두 개의 피연산자 중에서 한 개라도 true이면 결과가 true이다.
 *    그래서 첫 번째 피연산자가 true이면 뒤의 피연산자의 값을 조사하지 않는다.
 *    
 */
package step04;

public class Test03_2 {
  public static void main(String[] args) {
    boolean a = true,
            b = false;
    boolean result = a && (b = true);
    System.out.printf("a=%b, b=%b, result=%b\n", a, b, result);
    
    a = false;
    b = false;
    result = a && (b = true); // 앞의 피연산자가 false이기 때문에 뒤의 식은 수행하지 않는다.
    System.out.printf("a=%b, b=%b, result=%b\n", a, b, result);
    
    
    a = false;
    b = false;
    result = a || (b = true); // a 값이 false이기 때문에 뒤의 식까지 수행해봐야 결과를 알 수 있다.
    System.out.printf("a=%b, b=%b, result=%b\n", a, b, result);
    
    a = true;
    b = false;
    result = a || (b = true); // a 값이 true이기 때문에 결과는 true이다. 
                              // 따라서 뒤의 식은 수행하지 않는다.
    System.out.printf("a=%b, b=%b, result=%b\n", a, b, result);
  }
}









