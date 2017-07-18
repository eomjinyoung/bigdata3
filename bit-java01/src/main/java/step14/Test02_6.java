/* String 클래스 - chatAt(), indexOf(), 
 * => charAt(): 특정 위치의 문자를 추출하기
 * => indexOf(): 문자의 인덱스, 문자열의 시작 인덱스 
 */
package step14;

public class Test02_6 {

  public static void main(String[] args) {
    String s1 = "abcdefghijklmn";
    char ch = s1.charAt(4); // 인덱스는 0부터 시작한다.
    System.out.println(ch);
    System.out.println("-------------------------");
    
    int i = s1.indexOf('f'); // 5
    int i2 = s1.indexOf("cde"); // 2
    System.out.printf("%d, %d\n", i, i2);
    System.out.println("-------------------------");
    
    
  }

}








