/* Object 클래스
 * => 자바의 최상위 클래스이다.
 *    즉 자바의 모든 클래스는 Object의 자손이다.
 * => 객체의 필수 기능을 정의하고 있다.
 *    1) toString():String
 *       - 클래스의 간단한 정보를 리턴하는 메서드
 *       - "패키지명+클래스명@16진수해시값"
 *    2) equals():boolean
 *       - 인스턴스가 같은 지를 비교하는 메서드
 *       - 비교 연산자 "==" 와 같다.
 *    3) hashCode():int
 *       - 인스턴스를 구분하기 위한 정수 식별자를 리턴하는 메서드
 *       - 인스턴스가 다르면 다른 정수 값을 리턴한다.
 *       - 인스턴스의 주소가 아니다.
 *    4) getClass():Class
 *       - 인스턴스의 클래스 정보를 리턴하는 메서드 
 *    5) finalize():void
 *       - 가비지 컬렉터가 호출하는 메서드
 */
package step14;

public class Test01_1 {
  
  // 자바 클래스를 정의할 때 어떤 클래스를 상속 받을 지 지정하지 않으면, 자동으로 Object를 상속 받는다.
  static class MyClass /* extends Object */{}
  
  public static void main(String[] args) {
    MyClass obj = new MyClass();
    MyClass obj2 = new MyClass();
    
    // MyClass는 Object의 자손이기 때문에, Object의 모든 기능을 갖고 있다.
    System.out.println(obj.toString()); // Object로부터 상속 받은 toString()
    /* toString()
     * => 클래스명@해시값
     * => 해시값? hashCode()의 리턴 값
     */
    
    System.out.println(obj.equals(obj2)); // Object로부터 상속 받은 equals()
    /* equals()
     * => 인스턴스의 주소가 같은지를 비교한다.
     */
    
    System.out.println(Integer.toHexString(obj.hashCode())); // Object로부터 상속 받은 hashCode()
    /* hashCode()
     * => 인스턴스를 식별할 때 사용하는 4바이트 정수 값.
     * => toString() 리턴 값에도 포함된다.
     */
    
    System.out.println(obj.getClass()); // Object로부터 상속 받은 getClass()
    /* getClass()
     * => 인스턴스의 클래스 정보를 리턴한다.
     */
  }

}








