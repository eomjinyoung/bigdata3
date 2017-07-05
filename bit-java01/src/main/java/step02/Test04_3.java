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

    // 작은 부동소수점이라도 연산을 하다보면 유효자릿수 7자리를 넘는 경우가 많다.
    // 그래서 자바는 가능한 부동소수점을 다룰 대 8바이트로 다룰 것을 권고하고 있다.
    // 어떻게 권고하냐고요? 
    // => 4바이트 부동소수점을 작성할 때는 반드시 뒤에 F 또는 f를 붙이지만,
    //    8바이트 부동소수점을 작성할 때는 뒤에 아무것도 붙이지 않는다.
    //    결국 8바이트를 많이 사용하라는 얘기다.
    // => 정수의 경우 
    //    4바이트 정수 값은 그냥 작성하지만, 8바이트 정수 값은 L 또는 l을 붙인다
    //    즉 정수의 경우 4바이트를 더 많이 사용한다는 의미다.
    //    아무래도 많이 사용하는 수에 대해 작성하기 쉽도록 문법이 만들어질 것 아닌가!
  
  }

}
 