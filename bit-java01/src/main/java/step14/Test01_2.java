/* Object 클래스: toString() 오버라이딩 
 * => Object로부터 상속 받은 기능이 마음에 들지 않는다면 오버라이딩 하라!
 */
package step14;

public class Test01_2 {
  
  static class Student {
    String name;
    int age;
    
    public Student(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }
  
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








