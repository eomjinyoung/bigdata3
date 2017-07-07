/* 산술 연산자: 문자열에 대한  + 연산자
 */
package step04;

public class Test01_2 {
  public static void main(String[] args) {
    String s1 = "Hello,",
           s2 = "world!";
    String s3 = s1 + s2; // 문자열에 대해 + 연산을 수행하면,
                         // 두 개의 문자열을 연결한 새 문자열을 만든다.
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    
    s1 = "10";
    s2 = "20";
    s3 = s1 + s2; // 혹시나가 역시나임을 명심하라!
    System.out.println(s3); // 문자열에 대한 + 연산은 그냥 두 문자열을 연결하여 새 문자열을 만든다.
    
    // 문자열 + 숫자 = 문자열 + (숫자-->문자열) = 문자열 + 문자열
    // 즉 문자열이 아닌 것을 문자열로 만들어서 두 문자열을 붙인다.
    System.out.println("10" + 3);
    System.out.println(3 + "10");
    System.out.println("10" + 3.14);
    System.out.println("true" + false);
    System.out.println("A" + 'B');
    
    // + 연산자 외에 다른 연산자를 사용할 수 없다.
    //s3 = s1 - s2;
    //s3 = s1 * s2;
    //s3 = s1 / s2;
    
  }
}








