/* String 클래스
 * => 자바에서 문자열을 저장할 때 내부적으로 char 배열에 저장한다.
 * => 불변의 값이다. 즉 한 번 스트링이 배열에 저장되면 변경할 수 없다.
 *    이렇게 불변의 값을 "immutable 객체"라 부른다.
 * => 인스턴스 생성 방법
 *    1) new 연산자를 이용하여 문자열 만들기
 *       - Heap에 문자열을 저장할 char 배열을 만든다.
 *    2) 큰 따옴표("")를 이용하여 문자열 만들기
 *       - Constants Pool에 문자열을 저장할 char 배열을 만든다.
 *       - 값을 중복해서 만들지 않는다.
 * => 스트링은 원시 타입이 아니다. 인스턴스이다. 
 */
package step14;

public class Test02_1 {

  public static void main(String[] args) {
    // 1) new 연산자 이용하여 스트링 인스턴스 생성
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    
    // 스트링이 인스턴스 임을 확인해보자!
    if (s1 == s2) System.out.println("s1 == s2");
    else System.out.println("s1 != s2");

    // 인스턴스가 아니라 인스턴스 메모리에 저장된 문자열의 값이 같음을 비교하는 방법
    if (s1.equals(s2)) System.out.println("내용이 같다.");
    else System.out.println("내용이 다르다.");
    
    /* Object로부터 상속 받는 equals()는 원래 인스턴스의 주소가 같은지를 비교한다.
     * 그런데 String 클래스에서는 그 인스턴스의 내용물(문자열)이 같은지를 비교한다.
     * 이유는? String 클래스가 Object로부터 상속 받은 equals()를 오버라이딩 하였기 때문이다.
     *       즉 인스턴스 주소가 아닌 문자열을 비교하도록 재정의 하였다.
     */
  }

}








