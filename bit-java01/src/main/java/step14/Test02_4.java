/* String 클래스 - replace(), replaceAll()
 * => 지정된 문자열을 다른 문자열로 변경할 때 사용한다.
 */
package step14;

public class Test02_4 {

  public static void main(String[] args) {
    String s1 = "Hello, {name}!";
    String s2 = s1.replace("{name}", "홍길동");
    System.out.println(s1);
    System.out.println(s2);

    System.out.println("----------------");
    
    String s3 = "Hello, {name}!\n{name}님 안녕하세요!";
    String s4 = s3.replace("{name}", "임꺽정");
    System.out.println(s1);
    System.out.println(s2);
  }

}








