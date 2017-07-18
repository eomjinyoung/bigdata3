/* String 클래스 - chatAt(), indexOf(), lastIndexOf(), startsWith(), endsWith(),
 *               toLowerCase(), toUpperCase(), trim(), valueOf(),
 *               contains(), split(), getBytes()
 * => charAt(): 특정 위치의 문자를 추출하기
 * => indexOf(): 문자의 인덱스, 문자열의 시작 인덱스 
 *    lastIndexOf(): indexOf()랑 같다. 다만 문자열의 뒤쪽에서부터 찾는다.
 * => startsWith(): 문자열이 특정 문자열로 시작하는지 여부를 조사한다.
 * => endsWith(): 문자열이 특정 문자열로 끝나는지 여부를 조사한다.
 * => toLowerCase(): 모든 문자를 소문자로 만든 새 String 인스턴스를 리턴한다.
 * => toUpplerCase(): 모든 문자를 대문자로 만든 새 String 인스턴스를 리턴한다.
 * => trim(): 문자열의 시작과 끝에 있는 공백을 제거한다.
 * => valueOf(): 주어진 값을 문자열로 만든다. static이 붙은 클래스 메서드이다.
 * => contains(): 특정 문자열을 포함하고 있는지 확인하고 싶을 때.
 * => split(): 특정 문자열을 구분자로 하여 전체 문자열을 나눈다. 
 * => getBytes(): String 인스턴스로부터 바이트 배열을 추출하기.
 */
package step14;

public class Test02_6 {

  public static void main(String[] args) throws Exception {
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
    System.out.println("-------------------------");
    
    // 대소문자를 구분하지 않고 비교하는 방법
    // => 문자열을 모두 대문자 또는 소문자로 바꾼 후에 비교하라! 
    String name2 = name.toLowerCase();
    if (name2.startsWith("james")) System.out.println("OK!");
    if (name2.endsWith("dean")) System.out.println("OK!");
    System.out.println("-------------------------");
    
    String str = "    Hello,    홍길동!     ";
    System.out.printf(">%s<\n", str.trim());
    System.out.println("-------------------------");
    
    String x1 = String.valueOf(3.14f);
    String x2 = String.valueOf(2017);
    String x3 = String.valueOf(true);
    
    System.out.printf("%s, %s, %s\n", x1, x2, x3);
    System.out.println("-------------------------");
    
    String x4 = "I am studying Java programming.";
    System.out.println(x4.contains("Java"));
    System.out.println("-------------------------");
    
    String x5 = "홍길동,임꺽정,유관순,안중근,윤봉길";
    String[] names = x5.split(",");
    for (i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
    System.out.println("-------------------------");
    
    String x6 = "ABCabc123가각간";
    byte[] bytes = x6.getBytes("UTF-8");
    for (i = 0; i < bytes.length; i++) {
      System.out.println(Integer.toHexString(bytes[i]));
    }
    System.out.println("-------------------------");
  }

}








