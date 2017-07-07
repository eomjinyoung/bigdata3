/* 산술 연산자: 암시적 형변환
 * => 서로 다른 타입끼리 연산을 하게 되면,
 *    두 개의 타입 중에서 한 쪽을 다른 타입으로 맞춘다.
 *    그렇게 두 데이터를 같은 타입으로 맞춘 다음에 연산을 수행한다.
 * => implicit type conversion = implicit type casting
 * => 형변환의 의미?
 *    기존 변수의 타입을 바꾼다는 것이 아니라,
 *    바꾸려는 타입의 새 메모리를 만들어 복사한다는 것이다.
 */
package step04;

public class Test01_4 {
  public static void main(String[] args) {
    float a = 5f;
    int b = 2;
    System.out.println(a / b); // 연산 결과의 타입은 float
    // float / int  = float / (int--->float) = float / float = float
    // 주의!
    // 변수 b를 float으로 바꾸는 것이 아니다!
    // 자바 변수의 타입은 절대 변하지 않는다.
    // 위의 얘기는 
    // b 변수의 값을 float으로 바꾸기 위해 새 float 메모리를 내부적으로 만든 후에  
    // b 변수의 값을 복사한 후 a 변수와 새로 만든 float 메모리의 값을 연산한다.
    
    int x = 5;
    float y = 2f;
    System.out.println(x / y); // 연산 결과의 타입은 float
    // int / float = (int--->float) / float = float / float = float
  }
}








