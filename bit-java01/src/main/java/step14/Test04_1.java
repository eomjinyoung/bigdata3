/* Wrapper 클래스: 원시 타입을 인스턴스로 다루기 위해 추가한 클래스
 * => 원시 타입을 객체로 포장한다고 해서 "랩퍼(wrapper) 클래스"라 부른다.
 * => 원시 타입 각각에 해당하는 클래스가 있다.
 *    byte      --> java.lang.Byte
 *    short     --> java.lang.Short
 *    char      --> java.lang.Character
 *    int       --> java.lang.Integer
 *    long      --> java.lang.Long
 *    float     --> java.lang.Float
 *    double    --> java.lang.Double
 *    boolean   --> java.lang.Boolean
 */
package step14;

public class Test04_1 {
  public static void main(String[] args) {
    int i = 10;
    
    Integer obj = new Integer(10);
    
    // Integer 클래스에는 int로 작업할 수 없는 다양한 기능을 보유하고 있다.
    String str = obj.toString(); // 숫자를 문자열로 바꾸는 기능
    byte b = obj.byteValue(); // 다른 타입의 값을 리턴하는 기능
    System.out.println(Integer.MAX_VALUE); // int의 최대 값과 최소값을 리턴하는 기능
    System.out.println(Integer.MIN_VALUE);
    
  }
}










