/* 변수 선언과 값 저장
 * => 메모리를 준비시키는 명령을 "변수 선언"이라 부른다.
 * => 메모리에 값을 저장하는 것을 "assignment"라고 한다.
 *    한국어로 "할당" 또는 "배정"이라는 표현을 사용한다.
 *    "변수에 값을 할당한다"
 *    "변수에 값을 배정한다"
 */
package step02;

public class Test02 {
  public static void main(String[] args) {
    // 1) 변수를 선언한 후 값 저장
    int a; // 정수 값을 저장할 4바이트 메모리를 만들고, 그 메모리의 이름을 a라 하자!
    a = 20; // 값을 저장할 때는 "=" 이라는 할당/배정 연산자를 이용한다.

    // 2) 변수를 선언하는 것과 동시에 값을 저장하기
    int b = 20;

    // 3) 변수를 여러 개 선언하기;
    int x, y, z;
    x = 10;
    y = 20;
    z = 30;

    // 4) 변수를 여러 개 선언하는 것과 동시에 값 저장하기
    int m = 20, n, j = 30;

    // 변수의 값을 출력하기
    System.out.println(a);
    System.out.println(b);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(m);
    System.out.println(j);

    // 자바에서는 값을 넣지 않은 변수를 사용하려 할 때
    // 컴파일 하지 않는다. 컴파일 오류가 발생한다.
    //System.out.println(n); //컴파일 오류!
  }

}
 