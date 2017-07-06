/* 논리 값을 저장할 메모리 만들기
 * => boolean 데이터 타입의 메모리를 만든다.
 *    메모리 크기?
 *    => JVM 명세서에 boolean 값은 int 메모리에 저장한다고 나와있다.
 *    => 그러나 배열일 경우 byte 메모리를 사용한다고 되어 있다.
 */
package step02;

public class Test05_1 {
  public static void main(String[] args) {
    // true나 false는 특별히 고안된 상수이다.
    boolean b1 = true;
    boolean b2 = false;

    // 반드시 소문자로 작성해야 한다.
    //boolean b3 = True; // 컴파일 오류!
    //boolean b4 = TRUE; // 컴파일 오류!

    // c/c++과 달리 숫자를 넣을 수 없다.
    // => 내부적으로 int 메모리라 하더라도 직접 1 또는 0을 넣을 수 없다.
    //boolean b5 = 1; // 컴파일 오류!
    //boolean b6 = 0; // 컴파일 오류!

  }

}
 