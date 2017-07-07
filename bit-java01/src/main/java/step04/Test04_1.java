/* 비트 논리 연산자: &, |
 * => 비트 단위로 논리 연산이 수행된다. 
 * => 피연산자는 정수 값이어야 한다.
 */
package step04;

public class Test04_1 {
  public static void main(String[] args) {
    int a = 0b0110_1010, 
        b = 0b0011_0011;
    
    // &(AND): 두 개의 비트가 모두 1일 때만, 결과는 1이다. 그밖에는 0이다.
    System.out.println(a & b); // = 0010_0010 = 34
    
    // |(OR): 두 개의 비트 중에서 한 개가 1이면, 결과는 1이다. 그밖에는 0이다.
    System.out.println(a | b); // = 0111_1011 = 123
  }
}
