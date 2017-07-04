/* 부동소수점(floating point)의 표현
 * => 3.14
 *    = 31.4 / 10   = 31.4 * 10**-1 = 31.4E-1
 *    = 314 / 100   = 314 * 10**-2 = 314E-2
 *    = 0.314 * 10  = 0.314 * 10**1 = 0.314E1
 *    = 0.0314 * 100 = 0.0314 * 10**2 = 0.0314E2
 */
package step01;

public class Test04_1 {
  public static void main(String[] args) {
    System.out.println(3.14); 
    System.out.println(31.4E-1); // = 31.4 * 1/10
    System.out.println(314E-2); // = 314 * 1/100 
    System.out.println(0.314E1); // = 0.314 * 10
    System.out.println(0.0314E2); // = 0.0314 * 100
    System.out.println(0.0314e2); // = 0.0314 * 100 
    // E 또는 e를 붙여 소수점을 이동시킬 수 있다.
  }

}
 