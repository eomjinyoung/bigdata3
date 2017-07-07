/* 산술 연산자: 형변환할 때 주의점
 * => byte,char,short --> int --> long --> float --> double
 * => 위 규칙에 따르면 int와 float을 연산할 때, int가 float으로 형변환 할 것이다.
 *    문제는 int의 최대값을 float에 저장할 때 값이 짤릴 수 있다.
 *    이 사실을 명심하여 형변환을 수행해야 한다.
 * => 형변환의 규칙상
 *    항상 정수는 부동소수점의 메모리에 저장되는데,
 *    이때 정수의 값 일부가 짤릴 수가 있다는 것을 명심하고 코딩하라!
 */
package step04;

public class Test01_7 {
  public static void main(String[] args) {
    int i = 2034567654;
    float f = 10f;
    
    float result = i + f;
    
    System.out.println(result);
    
    // 더 심각한 형변환
    // long 값을 내부에서 생성한 float 메모리에 담을 때, long값의 일부가 짤리는 문제가 있다.
    // 정수 값과 부동소수점 값을 함께 연산할 때는
    // 정수 값이 부동소수점으로 변환되는 과정에서 늘 이런 문제를 안고 있다.
    long l = 8056788765L;
    result = l + f; // long + float = (long --> float) + float = float + float = float
    
    System.out.println(result);
  }
}








