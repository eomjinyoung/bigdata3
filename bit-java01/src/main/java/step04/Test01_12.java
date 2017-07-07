/* 산술 연산자: /와 % 연산자 응용 II
 * => / 연산자는 특정 자릿수 이상의 숫자를 뽑아낼 때 사용할 수 있다.
 */
package step04;

public class Test01_12 {
  public static void main(String[] args) {
    int a = 1234567890;
    
    // 주어진 숫자를 맨 뒷자리 수부터 추출하여 출력하라!
    while (a > 0) {
      System.out.println(a % 10);
      a = a / 10;
    }
  }
}








