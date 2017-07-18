/* StringBuffer: mutable 객체
 * => String 클래스와 다른점
 *    1) 문자열을 변경할 수 있다.
 *    2) Object의 equals()를 오버라이딩 하지 않았기 때문에, 내용을 비교하지 못한다.
 */
package step14;

public class Test03_1 {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    StringBuffer sb2 = new StringBuffer("Hello");
    
    System.out.println(sb1);
    System.out.println(sb2);
    
    if (sb1.equals(sb2)) System.out.println("같다!");
    else System.out.println("다르다!");
  }

}





