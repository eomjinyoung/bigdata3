/* import
 * => java.lang 패키지의 클래스를 사용할 때는 패키지명을 적을 필요가 없다.
 *    그 외(java.lang의 하위 패키지까지 포함하여) 다른 패키지의 클래스를 사용할 때는
 *    반드시 패키지 이름까지 적어야 한다.
 */
package step06;

public class Test07_1 {

  public static void main(String[] args) throws Exception {
    java.lang.Integer obj1;
    Integer obj2; // 패키지명 생략 가능!
    
    // 오직 java.lang 패키지에 소속된 클래스만 패키지명 생략가능!
    // 그 하위 패키지도 생략 불가능!
    java.lang.reflect.Method obj3;
    //Method obj4; // 컴파일 오류!
    
    // 변수를 선언하든 인스턴스를 생성하든
    // 다음과 같이 항상 패키지명을 적어야 한다.
    // 그래야 컴파일러가 해당 클래스를 찾을 수 있다.
    java.net.Socket obj5;
    obj5 = new java.net.Socket("localhost", 8080);
    
    java.io.File obj6;
    obj6 = new java.io.File("test.txt");
  }

}
