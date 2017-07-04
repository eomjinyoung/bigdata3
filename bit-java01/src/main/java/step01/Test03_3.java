/* 정수 값을 저장하는 메모리의 크기
 * => 4바이트 크기와 8바이트 크기의 메모리를 제공한다.
 */
package step01;

public class Test03_3 {
  public static void main(String[] args) {
    System.out.println(65); // 4바이트 크기의 정수 값 
    System.out.println(65L); // 8바이트 크기의 정수 값 (숫자 1과 헷갈리기 때문에 대문자를 주로 사용)
    System.out.println(65l); // 8바이트 크기의 정수 값
  }

}

