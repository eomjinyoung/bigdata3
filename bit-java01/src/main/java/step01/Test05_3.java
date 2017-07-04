/* 제어 문자
 * => 출력을 제어할 때 사용하는 특별한 문자 및 그에 대한 코드 
 * \b
 * \t
 * \n
 * 
 * 
 */
package step01;

public class Test05_3 {
  public static void main(String[] args) {
    // 제어 문자의 유니 코드 값
    System.out.println(Integer.toHexString('\b')); 
    System.out.println(Integer.toHexString('\t'));
    System.out.println(Integer.toHexString('\n'));
    System.out.println(Integer.toHexString('\f'));
    System.out.println(Integer.toHexString('\r'));
    System.out.println(Integer.toHexString('\"'));
    System.out.println(Integer.toHexString('\''));
    System.out.println(Integer.toHexString('\\'));
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
- windows OS : CRLF(0x0D0A, 2바이트로 표현)
- Unix/Linux : LF(0x0A, 1바이트로 표현)
*/