/* 계산 결과는 항상 피연산자의 데이터 타입과 같다!
 */
package step02;

public class Test04_4 {
  public static void main(String[] args) {
    int v1 = 5;
    int v2 = 2;
    int sum1 = v1 / v2; // sum1에 값이 저장되기 전에 v1 / v2의 계산 결과가 2이다.
                        // 왜? int와 int의 연산결과는 int이다.
    System.out.println(sum1);

    float sum2 = v1 / v2; // v1/v2의 연산 결과가 2임을 증명한다. 
                          // 2가 sum2에 저장된 것이다.
    System.out.println(sum2);

    float f1 = 5f;
    float f2 = 2f;
    float sum3 = f1 / f2; // 계산 결과가 부동소수점이 될 것 같으면,
                          // 처음부터 피연산자의 데이터 타입을 float으로 해라!
                          // f1/f2의 연산 결과는 2.5이다.
                          // 즉 2.5가 sum3에 저장된 것이다.
    System.out.println(sum3);
  }

}
 