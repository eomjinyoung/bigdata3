/* 산술 연산자: 명시적 형변환이 불가능 한 것
 * => 정수와 부동소수점 끼리는 형변환이 가능하다.
 *    즉 byte, short, int, long, float, double, char
 * => 그러나 다른 종류끼리는 불가능하다.
 */
package step04;

public class Test01_10 {
  public static void main(String[] args) {
    //boolean b = (boolean)"true"; // 컴파일 오류!
    //int i = (int)false; // 컴파일 오류!
    //boolean b2 = (boolean)0; // 컴파일 오류!
    
    // 그럼 문자열을 논리 값이나 숫자로 바꿀 수 있는 방법은 없는가?
    // 있다. 자바에서 제공하는 도구를 사용하라!
    
    boolean b3 = Boolean.parseBoolean("true");
    int i3 = Integer.parseInt("1280");
    
  }
}








