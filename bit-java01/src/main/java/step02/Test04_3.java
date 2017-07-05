/* 부동소수점을 사용할 때 조심해야 할 것!
 * => 같은 데이터 타입끼리만 연산을 수행할 수 있다.
 *    - int는 int와 연산가능.
 *    - int와 long 연산 불가능!
 * => 연산 결과는 피연산자의 데이터 타입과 같다.
 *    - float과 float의 연산결과는 float 데이터 타입이다.
 * => 각각의 값은 유효범위에 있을 지라도,
 *    계산을 수행한 후의 값이 유효범위를 넘을 수 있다.
 *    그 경우 피연산자의 데이터 타입에 맞춰서 자동으로 값이 짤린다.
 */
package step02;

public class Test04_3 {
  public static void main(String[] args) {
    float x = 98765.43f; // 유효자릿수 7자리 
    float y = 12.34567f;  // 유효자릿수 7자리
    System.out.println(x);
    System.out.println(y);

    float sum = x + y; 
    /* 더한 결과:
     *   98765.43
     * +    12.34567
     * --------------
     *   98777.77567
     * 
     * => 자바의 규칙상 결과는 항상 피연산자의 데이터 타입고 같아야 한다.
     *    즉 결과는 float이어야 한다.
     * => 따라서 98777.77567 값은 float의 유효범위를 벗어나기 때문에
     *    sum이라는 변수에 값을 넣기 전에 이미 뒤의 일부 숫자가 짤린다.
     * => 주의!
     *    - x + y의 값이 sum에 저장될 때 짤리는 것이 아니라,
     *      x + y의 값이 sum에 저장되기 전에 
     *      "결과 값은 항상 피연산자와 같아야 한다"라는 규칙 때문에
     *      그 전에 float 크기에 맞추기 위해서 값이 짤린다.
     */
    System.out.println(sum);

    // 저장하기 전에 짤린다는 것을 확인해보자!
    double sum2 = x + y; // 10자리의 결과 값(98777.77567)을 저장할 수 있는
                         // 메모리에 담는다면?
    System.out.println(sum2); //결과: 98777.7734375
    
    // 제대로 처리하고 싶은가?
    // => 그렇다면 계산 결과가 몇자리가 될 것인지도 고려하여 
    //    변수를 준비하라!
    double x2 = 98765.43;
    double y2 = 12.34567;
    double sum3 = x2 + y2;
    System.out.println(x2);
    System.out.println(y2);
    System.out.println(sum3);
  }

}
 