/* 인스턴스 메서드의 인스턴스 멤버 사용  
 * => 인스턴스 메서드에서 다른 인스턴스 멤버(변수나 메서드)를 사용할 때
 *    this를 붙여야 한다.
 *    this를 붙이지 않으면 컴파일러가 자동으로 붙인다.
 */
package step10;

class Student5 {
  static int count;
  
  String name;
  int age;
  
  void printName() {
    System.out.printf("name=%s\n", /*this.*/name);
  }
  
  void printAge() {
    System.out.printf("age=%d\n", /*this.*/age);
  }
  
  void printAll() {
    /*this.*/printName(); // 인스턴스 메서드 호출 시 this를 붙이지 않으면 컴파일러가 자동으로 붙인다.
    /*this.*/printAge();
  }
}

public class Test04_2 {
  public static void main(String[] args) {
    Student5 obj = new Student5();
    obj.name = "홍길동";
    obj.age = 20;
    
    //obj.printName();
    //obj.printAge();
    obj.printAll();
  }
}










