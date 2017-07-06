/* 문자열을 저장할 메모리 만들기
 * => String 데이터 타입의 메모리를 만든다.
 *    
 */
package step02;

public class Test07_1 {
  public static void main(String[] args) {
    String s1 = "Hello";
    /* s1 변수는 몇 바이트인가?
     * Hello 문자열의 크기가 10바이트이니까,
     * 그럼 s1은 10바이트 크기를 갖는가?
     * => "Hello" 문자열은 "인스턴스"라고 불리는 복합 메모리에 저장된다.
     *    인스턴스 내부에는 char 배열이 있고, 문자열은 이 배열에 보관되어 있다.
     *    s1은 이 인스턴스라고 불리는 메모리의 주소를 보관한다.
     *    이렇게 주소를 보관하는 변수를 "레퍼런스(reference)"라고 부른다.
     * 
     * 그러나 지금 당장은 그냥 s1 변수에 "Hello"라는 문자열이 직접 저장된다고 생각하라!
     * 이후에 클래스와 객체를 배운 후에 s1의 정체에 대해서 정확하게 이해하자!
     *    
     */
    
    String s2 = "world!";
    
    System.out.println(s1);
    System.out.println(s2);
    
  }

}
 