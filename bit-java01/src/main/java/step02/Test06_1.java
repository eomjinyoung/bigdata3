/* 문자의 유니코드 값을 저장할 메모리 만들기
 * => char(2바이트) 데이터 타입의 메모리를 만든다.
 *    
 */
package step02;

public class Test06_1 {
  public static void main(String[] args) {
    // 문자의 유니코드를 알고 있다면 직접 저장하라!
    char c1 = 65; // 10진수를 사용해도 되고
    char c2 = 0x41; // 16진수를 사용해도 된다. 편한 거 사용하라. 그러나 주로 16진수를 쓴다.
    char c3 = 0xAC00;
    char c4 = 0xac00;
    
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    

  }

}
 