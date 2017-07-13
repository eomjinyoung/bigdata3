/* 인스턴스 멤버 : 인스턴스 블록 II
 * 
 */
package step10;

class MyClass3 {
  String name;
  int age;
  
  { // 인스턴스 블록
    // => 인스턴스를 찾아 갈 수 있도록 인스턴스의 주소가 this라는 내장변수(built-in)에 저장되어 있다.
    //    물론 this를 생략해도 된다.
    this.name = "홍길동";
    this.age = 30;
  }
}

public class Test01_3 {
  public static void main(String[] args) {
    MyClass3 obj = new MyClass3();
    System.out.println(obj.name);
    System.out.println(obj.age);
    
  }
}










