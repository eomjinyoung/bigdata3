/* String 클래스 - String은 immutable 객체이다.
 * => 한 번 String 인스턴스가 생성되면 내부 문자열을 변경할 수 없다. 
 */
package step14;

public class Test02_3 {

  public static void main(String[] args) {
    // 스트링 인스턴스 생성
    String s1 = new String("Hello");
    
    // replace() 메서드는 기존의 문자열을 가지고 변경 작업을 수행한 후 
    // 그 결과 문자열을 새 String 인스턴스에 저장한다.
    // 그리고 새로 만든 String 인스턴스 주소를 리턴한다.
    // 즉 replace()의 의미?
    // => 기존 문자열의 l을 x로 바꾼 새 String 인스턴스를 만들라는 명령어이다.
    String s2 = s1.replace('l', 'x');
    
    System.out.println(s1);
    System.out.println(s2);
  }

}








