/* 배정(할당;assignment) 연산자: +=, -=, *=, /=, %=, <<=, >>= 등
 * => 기존 연산자의 단축 연산자이다.
 *    예) a = a + b ---> a += b
 *    예) a = a % b ---> a %= b 
 */
package step04;

public class Test08_1 {
  public static void main(String[] args) {
    int a = 10, 
        b = 10;
    
    a = a + 2;
    System.out.println(a);
    
    b += 2;
    System.out.println(b);
  }
}








