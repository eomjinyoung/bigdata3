/* String 클래스 - substring()
 * => 문자열에서 특정 위치의 문자열을 추출하기
 */
package step14;

public class Test02_5 {

  public static void main(String[] args) {
    String s1 = "abcdefghijklmn";
    String s2 = s1.substring(4); // 시작 인덱스만 주면 그 인덱스의 문자부터 끝까지 추출한다.
    System.out.println(s1);
    System.out.println(s2);
    
  }

}








