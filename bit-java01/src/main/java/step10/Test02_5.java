/* 인스턴스 멤버 : this()
 * => 생성자에서 다른 생성자를 호출하는 특별한 명령어
 */
package step10;

class MyClass8 {
  String name;
  int age;
  
  // 기본 생성자 : 파라미터가 없다.
  MyClass8() {
    // 다른 생성자를 호출할 때는 반드시 첫 번째 명령어가 되어야 한다.
    this("아무게");
    System.out.println("MyClass8()");
  }
  
  MyClass8(String name) {
    this(name, 20);
    System.out.println("MyClass8(String)");
  }
  
  MyClass8(int age) {
    this("아무게", 20);
    System.out.println("MyClass8(int)");
  }
  
  MyClass8(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("MyClass8(String,int)");
  }
  
  MyClass8(int age, String name) {
    this(name, age);
    System.out.println("MyClass8(int, String)");
  }
}

public class Test02_5 {
  public static void main(String[] args) {
    MyClass8 obj = new MyClass8(); 
    // MyClass8() => MyClass8(String) => MyClass8(String, int)
    
    System.out.printf("%s, %d\n", obj.name, obj.age);
  }
}










