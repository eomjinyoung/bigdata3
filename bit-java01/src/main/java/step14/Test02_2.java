/* String 클래스 - 상수 스트링으로 String 인스턴스를 생성하는 방법
 * => 큰 따옴표를 사용하여 만든 스트링 인스턴스는 Heap이 아닌,
 *    "상수 풀(Constants Pool)"이라는 별도의 메모리 영역에 생성된다.
 * => 중복 생성되지 않는다.
 */
package step14;

public class Test02_2 {

  public static void main(String[] args) {
    // 상수 스트링 생성
    String s1 = "Hello"; // s1에 저장되는 것은 문자열이 아니라 스트링 인스턴스의 주소이다.
                         // 다만 상수 스트링은 Heap이 아닌 상수풀이라는 영역에 인스턴스가 생성된다.
                         // 즉 문자열 리터럴 자리에는 String 인스턴스의 주소가 놓인다.
    
    String s2 = "Hello"; // 기존에 이미 Hello라는 문자열을 갖고 있는 스트링 인스턴스가
                         // 상수풀에 존재하기 때문에 새로 String 인스턴스를 생성하지 않고,
                         // 기존의 인스턴스 주소를 그대로 리턴한다.
    
    String s3 = "Hello"; // s1, s2와 같은 인스턴스 주소를 저장한다.
    
    if (s1 == s2) System.out.println("s1 == s2");
    else System.out.println("s1 != s2");
    
    if (s2 == s3) System.out.println("s2 == s3");
    else System.out.println("s2 != s3");

    /* 문자열 리터럴로 만든 String 인스턴스는 "상수풀"에 생성되고,
     * 중복하여 생성되지 않는다.
     * 같은 상수 문자열을 여러 개 만들지 않음으로써 메모리를 절약할 수 있다.
     */
    
    // 그러나 다음과 같이 new를 사용하여 명시적으로 문자열 인스턴스를 만들 경우에는
    // 값이 같더라도 중복 생성한다. 또한 Heap영역에 String 인스턴스를 만든다.
    // 이유는? 개발자가 문자열을 생성할 때 상수 문자열 대신 new 명령을 사용했다는 것은 
    //       뭔가 의도적으로 문자열을 분리 생성하고 싶었다는 뜻으로 해석한다.       
    String s4 = new String("Hello");
    String s5 = new String("Hello");
    
    if (s1 == s4) System.out.println("s1 == s4");
    else System.out.println("s1 != s4");
    
    if (s5 == s4) System.out.println("s5 == s4");
    else System.out.println("s5 != s4");
    
  }

}








