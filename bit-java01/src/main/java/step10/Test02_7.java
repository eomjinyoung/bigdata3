/* 인스턴스 멤버 : 컴파일러와 기본 생성자 II
 * => 생성자가 있다면, 컴파일러는 기본 생성자를 추가하지 않는다.
 */
package step10;

class MyClass10 {
  String name;
  int age;
  
  MyClass10(String name) {
    this.name = name;
    System.out.println("MyClass10(String)");
  }
  
  // 이렇게 생성자가 한 개라도 있다면, 컴파일러는 기본 생성자를 추가하지 않는다.
}

public class Test02_7 {
  public static void main(String[] args) {
    //new MyClass10(); // MyClass10에는 기본 생성자가 없기 때문에 컴파일 오류 발생!
    
    new MyClass10("홍길동"); // OK!
  }
}










