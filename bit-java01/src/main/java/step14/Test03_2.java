/* StringBuffer: replace()
 * => replace(): 문자열에서 지정된 위치의 문자열을 다른 문자열로 바꾼다.
 *               리턴 값은 기존 객체(기존 인스턴스의 주소)이다. 
 */
package step14;

public class Test03_2 {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    StringBuffer sb2 = sb1.replace(2, 4, "xx"); 
    //String 클래스와 달리 새 인스턴스를 만들지 않는다. 기존 객체를 리턴한다.
     
    
    // replace()의 리턴 값은 기존 객체이다.
    if (sb1 == sb2) System.out.println("sb1 == sb2");
    
    // 원래의 값이 변경된다.
    System.out.println(sb1);
    
    // 기존의 문자열에 다른 문자열을 붙이기
    sb1.append(", world!");
    System.out.println(sb1);
  }

}





