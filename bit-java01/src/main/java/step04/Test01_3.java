/* 산술 연산자: 연산 결과는 항상 피연산자의 타입과 같다.
 * => 항상 연산은 같은 데이터 타입끼리만 가능하다.
 */
package step04;

public class Test01_3 {
  public static void main(String[] args) {
    int a = 5, b = 2;
    System.out.println(a / b); // 연산 결과의 타입은 int
    
    float x = 5f, y = 2f;
    System.out.println(x / y); // 연산 결과의 타입은 float
  }
}








