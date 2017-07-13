/* 클래스 메서드의 인스턴스 멤버 사용  
 * => 클래스 메서드는 인스턴스의 주소를 저장할 this 변수가 없다.
 *    그래서 인스턴스 멤버(변수나 메서드)를 사용할 수 없다.
 */
package step10;

class Student6 {
  static int count;
  
  String name;
  int age;
  
  void printName() {
    System.out.printf("name=%s\n", /*this.*/name);
  }
  
  void printAge() {
    System.out.printf("age=%d\n", /*this.*/age);
  }
  
  static void printCount() {
    // count 변수는 클래스 변수이기 때문에 this가 붙지 않는다.
    // 또한 클래스 메서드는 this 변수가 없다. 그래서 this를 쓰고 싶어도 못쓴다.
    System.out.printf("count=%d\n", count);
  }
  
  static void printAll() {
    // 인스턴스 변수는 인스턴스 레퍼런스가 있어야만 사용할 수 있다.
    // 클래스 메서드는 this라는 변수가 없다. 그래서 인스턴스 변수를 사용할 수 없다.
    //System.out.printf("name=%s\n", this.name); // 컴파일 오류!
    //System.out.printf("age=%d\n", this.age); // 컴파일 오류!
    
    // 또한 인스턴스 메서드도 사용할 수 없다.
    //this.printName(); // 컴파일 오류!
    //this.printAge(); // 컴파일 오류!
  }
}

public class Test04_3 {
  public static void main(String[] args) {
    Student6.printAll();
  }
}










