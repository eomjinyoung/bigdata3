/* 정수 값을 저장하는 메모리의 크기
 * => 4바이트 크기와 8바이트 크기의 메모리를 제공한다.
 */
package step01;

public class Test03_3 {
  public static void main(String[] args) {
    System.out.println(65); // 4바이트 크기의 정수 값 
    System.out.println(65L); // 8바이트 크기의 정수 값 (숫자 1과 헷갈리기 때문에 대문자를 주로 사용)
    System.out.println(65l); // 8바이트 크기의 정수 값

    System.out.println(0x7fffffff); // 4바이트 양수 최대값. +2147483647
    System.out.println(0x80000000); // 4바이트 음수 최소값. -2147483648

    // 숫자 뒤에 아무것도 적지 않으면 4바이트 크기의 정수 값을 의미한다.
    // 그런데 그 크기를 넘어서는 값을 적으면 컴파일 오류이다.
    System.out.println(2147483648);
    System.out.println(-2147483649);
  }

}

