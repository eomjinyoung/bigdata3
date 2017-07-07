/* 산술 연산자: 암시적 형변환의 규칙
 * => byte,char,short --> int --> long --> float --> double
 */
package step04;

public class Test01_5 {
  public static void main(String[] args) {
    byte b1 = 10, b2 = 20;
    char c1 = 10, c2 = 20;
    short s1 = 10, s2 = 20;
    
    // 1) byte, char, short는 무조건 int로 형변환한 다음에 연산을 수행한다.
    //byte b3 = b1 + b2; // byte + byte = int + int = int
    //char c3 = c1 + c2; // char + char = int + int  = int
    //short s3 = s1 + s2; // short + short = int + int = int
    int i1 = b1 + b2;
    int i2 = c1 + c2;
    int i3 = s1 + s2; 
    
    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3);
    
  }
}








