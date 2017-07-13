/* 인스턴스 멤버 : 생성자(constructor)와 일반 인스턴스 메서드
 * => 생성자는 반드시 클래스 이름과 같아야 한다.
 * => 값을 리턴할 수 없다. 
 * => 리턴 타입을 적을 수 없다. 
 * => void도 적어서는 안된다.
 * => void나 리턴 타입을 적는 순간 일반 인스턴스 메서드가 된다.
 *   
 */
package step10;

class MyClass5 {
  String name;
  int age;
  
  // 다음 메서드는 리턴 타입을 적었기 때문에 일반 인스턴스 메서드이다.
  // 일반 인스턴스 메서드는 인스턴스 주소로 호출한다.
  void MyClass5() {
    System.out.println("일반 메서드 호출됨!");
  }
}

public class Test02_2 {
  public static void main(String[] args) {
    MyClass5 obj = new MyClass5();
    //obj.MyClass5();
  }
}










