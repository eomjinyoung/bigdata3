/* 비트 논리 연산자: &, |, ^, ~
 * => 논리곱(AND), 논리합(INCLUSIVE OR), 배타적 논리합(EXCLUSIVE OR), 부정(NOT) 
 * => 비트 단위로 논리 연산이 수행된다. 
 * => 피연산자는 정수 값이어야 한다.
 */
package step04;

public class Test04_1 {
  public static void main(String[] args) {
    int a = 0b0110_1010, // 0000_0000_0000_0000_0000_0000_0110_1010
        b = 0b0011_0011; // 0000_0000_0000_0000_0000_0000_0011_0011
    
    System.out.println(a);
    System.out.println(b);
    
    // &(AND): 두 개의 비트가 모두 1일 때만, 결과는 1이다. 그밖에는 0이다.
    System.out.println(a & b); // = 0010_0010 = 34
    
    // |(OR): 두 개의 비트 중에서 한 개가 1이면, 결과는 1이다. 그밖에는 0이다.
    System.out.println(a | b); // = 0111_1011 = 123
    
    // ^(EXCLUSIVE OR): 두 개의 비트 값이 다를 때 결과는 1이다. 같으면 0이다.
    System.out.println(a ^ b); // = 0101_1001 = 89
    
    // ~(NOT): 비트 값을 반대 값으로 만든다. 1이면 0, 0이면 1.
    System.out.println(~a); // = 1111_1111_1111_1111_1111_1111_1001_0101 = -107
   
  }
}





