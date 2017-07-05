/* 부동소수점 값을 저장할 변수 선언
 * => 메모리의 크기에 따라 2가지 유형을 제공한다.
 *    float(4), double(8)
 */
package step02;

public class Test04_1 {
  public static void main(String[] args) {
    // float의 경우 유효자릿수 7자리의 부동소수점을 저장할 수 있다.
    // 부동소수점이 2진수로 바뀔 때 완전하게 바뀌지 못하는 
    // 문제로 인해 유효자릿수의 값을 넣더라도 짤릴 수 있음을 항상 명심하라!
    float f1 = 9.876987f;
    float f2 = 987698.7f;
    System.out.println(f1);
    System.out.println(f2);

    // 유효자릿수를 벗어난다고 해서 컴파일 오류가 발생하는 것은 아니다.
    // 단지 값이 짤릴 뿐이다.
    f1 = 9.8769874f;
    f2 = 9876987.4f;
    System.out.println(f1);
    System.out.println(f2);

    // 4바이트 메모리에 8바이트 부동소수점을 넣는다면?
    f1 = 9.876987; // 컴파일 오류!
    f2 = 987698.7; // 컴파일 오류!
    f1 = 3.14; // 컴파일 오류!
    


  }

}
 