/* 문자 리터럴
 * => 작은 따옴표('')를 사용하여 한 문자를 표현한다.
 *    작은 따옴표 안에 여러 문자를 기술해서는 안된다.
 */
package step01;

public class Test05_1 {
  public static void main(String[] args) {
    System.out.println('A'); 
    System.out.println('가');
    //System.out.println('AB'); // 컴파일 오류!

    // 직접 유니코드 값을 기술할 수 있다.
    // 단, 출력할 때 단순한 숫자가 아니라 문자 코드을 지정하라!
    System.out.println(0b0000_0000_0100_0001); // 그냥 숫자를 지정하면, 
                                              // 단순히 숫자를 출력한다.
    // 다음과 같이 문자 코드 임을 밝혀야 제대로 문자를 출력한다.                                          
    System.out.println((char)0b0000_0000_0100_0001);

    // 2진수로 문자 코드 값을 표현하는 것은 매우 번거롭다.
    System.out.println((char)0x0041); // 16진수를 사용하라!
    System.out.println((char)0x41); // 앞에 있는 0은 생략해도 된다.

    // 작은 따옴표 안에 유니코드를 작성할 수 있다.
    System.out.println('\u0041'); // OK!
    // 이 방식으로 유니코드 값을 지정할 때는 0을 생략할 수 없다.

  }

}
 