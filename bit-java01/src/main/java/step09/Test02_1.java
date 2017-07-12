/* 클래스 변수
 * => 클래스가 로딩될 때 Method Area에 준비된다.
 * => 클래스 블록에 변수를 선언해야 한다.
 * => 변수 선언 앞에 static을 붙여야 한다.
 * 
 * => 클래스 변수 선언 문법
 *    static 데이터타입 변수명;
 *    static 데이터타입 변수명 = 값;
 *    예) static String name;
 *    예) static int age = 20;
 *    
 * => 클래스 변수 사용 문법
 *    클래스명.변수명 = 값
 *    예) Test02_1.name = "홍길동";
 *    
 *    같은 멤버라면, 클래스명을 생략해도 된다.
 *    예) name = "홍길동"
 *    
 */
package step09;

public class Test02_1 {
  
  static String name;
  static int age;
  
  static void printName() {
    // 클래스 변수를 사용할 때는 변수 이름 앞에 클래스명을 붙여야 한다.
    System.out.printf("name=%s\n", Test02_1.name);
  }
  
  static void printNameAndAge() {
    // 같은 멤버라면, 클래스 이름을 생략할 수 있다.
    System.out.printf("name=%s, age=%d\n", name, age);
  }
  
  static void setAge(int age) {
    // 클래스 변수 이름과 같은 로컬 변수가 있다면,
    // 클래스 변수 이름 앞에 클래스명을 붙여라!
    // 안 붙이면 기본이 로컬 변수이다.
    Test02_1.age = age;
  }
  
  public static void main(String[] args) {
    // main() 메서드가 호출되기 전에 Test02_1 클래스가 로딩되었을 것이고,
    // 클래스가 로딩될 때 클래스 변수가 자동으로 생성되기 때문에
    // main() 메서드가 실행되기 전에 클래스 변수는 반드시 존재한다!
    name = "홍길동"; // 같은 멤버라면 클래스 이름을 생략할 수 있다.
    Test02_1.age = 20; // 물론 클래스명을 생략하지 않아도 된다. 
    
    printName();
    printNameAndAge();
    
    setAge(30);
    printNameAndAge();
  }
}









