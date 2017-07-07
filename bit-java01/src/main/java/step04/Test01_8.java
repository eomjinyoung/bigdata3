/* 산술 연산자: 명시적 형변환
 * => 개발자가 형변환을 지정할 수 있다.
 * => (목적데이터타입) 변수 또는 값
 */
package step04;

public class Test01_8 {
  public static void main(String[] args) {
    int a = 5;
    float b = 2f;
    float result = a / (int)b; // int 메모리를 만든 다음에, b 값을 복사한다.
                               // 이때 소수점 이하의 값은 짤린다.
    
    System.out.println(result);
    
  }
}








