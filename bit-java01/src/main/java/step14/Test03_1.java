/* StringBuffer: mutable 객체
 * => String 클래스와는 달리 문자열을 변경할 수 있다.
 */
package step14;

public class Test03_1 {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    StringBuffer sb2 = new StringBuffer("Hello");
    
    System.out.println(sb1);
    System.out.println(sb2);

  }

}
