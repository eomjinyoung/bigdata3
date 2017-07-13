/* 인스턴스 멤버 : 기본 생성자와 파라미터 생성자
 * => 파라미터가 없는 생성자를 "기본 생성자(default constructor)"라고 부른다.
 * => 생성자도 일반 메서드처럼 파라미터의 타입과 개수만 다르다면 
 *    여러 개를 정의할 수 있다.
 * => 여러 개 생성자 중에서 호출할 생성자를 선택하기
 *    - 인스턴스를 생성할 때 넘겨주는 아규먼트로 판단한다.
 *    new 클래스명(아규먼트, ...);
 */
package step10;

class MyClass7 {
  String name;
  int age;
  
  // 기본 생성자 : 파라미터가 없다.
  MyClass7() {
    System.out.println("MyClass7()");
  }
  
  MyClass7(String name) {
    System.out.println("MyClass7(String)");
  }
  
  MyClass7(int age) {
    System.out.println("MyClass7(int)");
  }
  
  MyClass7(String name, int age) {
    System.out.println("MyClass7(String,int)");
  }
  
  MyClass7(int age, String name) {
    System.out.println("MyClass7(int, String)");
  }
  
  // 생성자든 메서드든 파라미터의 타입과 개수가 달라야 한다.
  // 파라미터 이름이 다른 것은 같은 메서드로 보기 때문에 중복으로 간주하여 컴파일 오류가 발생한다.
  /*
  MyClass7(int age2, String name2) {
    System.out.println("MyClass7(int, String)");
  }
  */
}

public class Test02_4 {
  public static void main(String[] args) {
    new MyClass7(); // 기본 생성자를 호출한다.
    new MyClass7("홍길동", 20); // MyClass7(String, int) 생성자를 호출한다.
    new MyClass7(30, "임꺽정"); // MyClass7(int, String) 생성자를 호출한다.
    //new MyClass7(40, 50); // MyClass7(int, int) 생성자가 없기 때문에 컴파일 오류이다!
  }
}










