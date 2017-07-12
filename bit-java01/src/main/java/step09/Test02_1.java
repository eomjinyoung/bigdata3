/* 클래스 변수
 * => 클래스가 로딩될 때 Method Area에 준비된다.
 *      
 */
package step09;

public class Test02_1 {
  
  static String name;
  static int age;
  
  static void printName() {
    System.out.printf("name=%s\n", name);
  }
  
  static void printNameAndAge() {
    System.out.printf("name=%s, age=%d\n", name, age);
  }
  
  public static void main(String[] args) {
    name = "홍길동";
    age = 20;
    
    printName();
    printNameAndAge();
  }
}









