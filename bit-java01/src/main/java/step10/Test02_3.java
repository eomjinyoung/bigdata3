/* 인스턴스 멤버 : 생성자(constructor)와 일반 인스턴스 메서드 II
 * => 생성자는 일반 인스턴스 메서드와 달리 딱 한 번만 호출할 수 있다.
 *    인스턴스를 생성할 때 딱 한 번만 호출할 수 있다.
 *   
 */
package step10;

class MyClass6 {
  String name;
  int age;
  
  MyClass6() {
    System.out.println("생성자 호출됨!");
  }
}

public class Test02_3 {
  public static void main(String[] args) {
    MyClass6 obj = new MyClass6();
    //obj.MyClass5();
  }
}










