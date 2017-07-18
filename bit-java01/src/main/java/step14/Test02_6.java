/* String 클래스 - chatAt(), indexOf(), lastIndexOf(), startsWith(), endsWith()
 * => charAt(): 특정 위치의 문자를 추출하기
 * => indexOf(): 문자의 인덱스, 문자열의 시작 인덱스 
 *    lastIndexOf(): indexOf()랑 같다. 다만 문자열의 뒤쪽에서부터 찾는다.
 * => startsWith(): 문자열이 특정 문자열로 시작하는지 여부를 조사한다.
 * => endsWith(): 문자열이 특정 문자열로 끝나는지 여부를 조사한다.
 */
package step14;

public class Test02_6 {

  public static void main(String[] args) {
    String s1 = "abcdefghicdefg";
    char ch = s1.charAt(4); // 인덱스는 0부터 시작한다.
    System.out.println(ch);
    System.out.println("-------------------------");
    
    int i = s1.indexOf('f'); // 5
    int i2 = s1.indexOf("cde"); // 2
    int i3 = s1.lastIndexOf("cde"); // 9
    System.out.printf("%d, %d, %d\n", i, i2, i3);
    System.out.println("-------------------------");
    
    String name = "James Dean";
    if (name.startsWith("James")) System.out.println("OK!");
    if (name.endsWith("Dean")) System.out.println("OK!");
  }

}








