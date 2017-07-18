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
 * => 참고 : Java 버전
 *    java 1.1, java 1.2, java 1.3, java 1.4, java 1.5(java 5),
 *    java 1.6(java 6), java 1.7(java 7), java 1.8(java 8) 
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
    int value = Integer.parseInt("2345"); // 문자열을 int로 바꿔주는 기능
    System.out.println(value);
    value = Integer.decode("0x7fdd"); // 특정 진수로 표현된 문자열을 분석하여 숫자로 바꿔주는 기능 
    System.out.println(value);
    str = Integer.toHexString(44032); // 숫자를 특정 진수로 표현한 문장을 리턴하는 기능
    System.out.println(str);
    
    // 결론, 정수 값을 저장하는 int라는 원시 타입이 있음에도 불구하고
    // 정수 값을 다루는 Integer라는 클래스를 따로 만든 이유는
    // 위와 같이 다양한 기능을 추가하기 위함이다.
    // 또한 원시 타입을 객체로 다뤄야 하는 상황에 대비하기 위함이다.
    //
    // 정리!
    // 1) 원시 타입을 직접 사용하는 것 보다 더 많은 기능이 있다.
    // 2) 원시 타입의 값을 객체로 다룰 수 있다.
    
    printValue(new String("Hello")); // 문자열 인스턴스의 주소를 넘긴다.
    
    // 원시 타입을 printValue()에 넘기려고 할 때,
    // 원시 타입은 객체가 아니기 때문에 넘길 수 가 없다.(JDK1.4까지는 그랬다!)
    // 이런 경우 원시 타입의 값을 객체로 포장하는 기술이 필요한데,
    // 이 경우를 위해 만든 클래스가 랩퍼 클래스(wrapper class)이다.
    // 
    printValue(new Integer(10));
    
    // JDK5(JDK1.5)에서는 Autoboxing 기능을 제공하기 때문에 원시 타입의 값을 직접 줘도 된다.
    printValue(10); // 컴파일러가 10 대신 new Integer(10)으로 바꾼다. 그래서 오토박싱이다.
  }
  
  // 다음은 객체(객체의 주소 = 인스턴스의 주소)를 주면 그 객체의 값을 출력하는 메서드이다.
  static void printValue(Object obj) {
    System.out.println("---------------------");
    System.out.println(obj);
    System.out.println("---------------------");
  }
}










