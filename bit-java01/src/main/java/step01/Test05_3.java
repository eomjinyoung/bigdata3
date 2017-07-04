/* 제어 문자
 * => 출력을 제어할 때 사용하는 특별한 문자 및 그에 대한 코드 
 */
package step01;

public class Test05_3 {
  public static void main(String[] args) {
    // 제어 문자의 유니 코드 값
    // => 항상 역슬래시로 시작한다.
    // => 역슬래시 다음에 오는 문자는 특별한 의미를 지닌다.
    // => 물론 의미없는 문자를 적어서는 안된다.
    // => 이런 문자를 "이스케이프(escape) 문자"라 부른다.
    System.out.println(Integer.toHexString('\b')); // 0x0008
    System.out.println(Integer.toHexString('\t')); // 0x0009
    System.out.println(Integer.toHexString('\n')); // 0x000a
    System.out.println(Integer.toHexString('\f')); // 0x000c
    System.out.println(Integer.toHexString('\r')); // 0x000d
    System.out.println(Integer.toHexString('\"')); // 0x0022
    System.out.println(Integer.toHexString('\'')); // 0x0027
    System.out.println(Integer.toHexString('\\')); // 0x005c

    // 제어 문자의 역할
    // 문자열에 포함되어 각각의 특별한 기능을 수행한다.
    System.out.println("ABC\babc"); // 커서를 뒤로 당긴다.
    // 커서(cursor)? 현재 출력 위치를 가리키는 것.

    System.out.println("ABC\tabc"); // 시스템에서 정한 크기 만큼 공백을 준다.
    System.out.println("ABC\nabc"); // 줄을 바꿔 처음부터 출력한다.
    System.out.println("ABC\fabc"); // ?
    System.out.println("ABC\rab"); // 커서를 처음 위치로 되돌린다.
    System.out.println("ABC\"ab"); // 큰 따옴표 출력.
    System.out.println("ABC\'ab"); // 작은 따옴표 출력.
    System.out.println("ABC'ab"); // 큰 따옴표 안에서 자유롭게 작은 따옴표 출력가능.
    System.out.println('\''); // 작은 따옴표 안에서 작은 따옴표를 출력하고 싶을 때.
    System.out.println("ABC\\ab"); // 역슬래시를 그대로 출력하고 싶을 때.
  }

}

/*
# 이스케이프 문자
- \b : backspace (0x0008)
- \t : tab (0x0009)
- \n : linefeed (LF;0x000a)
- \f : formfeed (0x000c)
- \r : carrage return (CR;0x000d)
- \" : double quote (0x0022)
- \' : single quote (0x0027)
- \\ : backslash (0x005c)

# OS에 따라 줄 바꿈 코드가 다르다.
- windows OS 
  => 윈도우즈는 옛날의 타자기 원리를 그대로 도입하였다.
     그래서 줄바꿈을 두 개의 행위로 본다.
     "캐리지를 처음으로 되돌린 후 다음 줄로 이동하는 것"       
  => CRLF(0x0D0A, 2바이트로 표현)
- Unix/Linux : LF(0x0A, 1바이트로 표현)
*/