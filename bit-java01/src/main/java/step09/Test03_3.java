/* 스태틱 블록 : 클래스가 로딩되는 경우
 * => 클래스가 로딩될 때 클래스 변수가 생성되고 스태틱 블록이 실행된다.
 *    이것을 가지고 클래스가 언제 실행되는지 알아보자! 
 * 
 */
package step09;

class MyClass3 {
  static int a;
  
  static {
    System.out.println("MyClass3 스태틱 블록 실행:");
  }
  
  static void print() {
    System.out.printf("MyClass3.a=%d\n", a);
  }
}

public class Test03_3 {
  static {
    System.out.println("Test03_3 스태틱 블록 실행:");
  }
  
  public static void main(String[] args) {
    System.out.println("Hello!");
    
    // 1) 레퍼런스를 선언할 때? No
    // => 레퍼런스를 선언할 때는 클래스를 로딩하지 않는다. 
    //MyClass3 obj;
    
    // 2) 인스턴스를 만들 때? Yes
    // => 인스턴스를 만들려면 메모리 설계도가 있어야 하기 때문에 클래스를 로딩한다.
    // => 물론 클래스는 한 번만 로딩된다.
    /*
    new MyClass3();
    new MyClass3(); // 클래스는 한 번만 로딩된다. 즉 메모리 설계도는 한 번만 로딩되면 된다.
    new MyClass3(); // 클래스는 한 번만 로딩된다. 즉 메모리 설계도는 한 번만 로딩되면 된다.
    */
    
    // 3) 클래스 변수를 사용할 때? Yes
    // => 클래스 변수를 사용하려면 클래스가 로딩되어야 하기 때문에 당연히 클래스 로딩이 일어난다.
    //MyClass3.a = 100;
    
    // 4) 클래스 메서드 호출할 때? Yes
    // => 클래스 메서드를 호출하려면 먼저 클래스가 로딩되어야 한다.
    MyClass3.print();
    
  }
}









