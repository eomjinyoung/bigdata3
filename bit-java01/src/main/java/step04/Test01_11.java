/* 산술 연산자: /와 % 연산자 응용
 * => / 연산자는 특정 자릿수 이상의 숫자를 뽑아낼 때 사용할 수 있다.
 */
package step04;

public class Test01_11 {
  public static void main(String[] args) {
    int a = 1234567890;
    
    // 뒤의 여섯자리를 제외하고 나머지 숫자를 뽑는 방법
    System.out.println(a / 1000000);
    
    // 뒤의 여섯자리만 뽑는 방법
    System.out.println(a % 1000000);
  }
}








