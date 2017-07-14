package step11.ex6;

// B 클래스는 A 클래스를 상속한다.
// 부모(수퍼) 클래스: A
// 자식(서브) 클래스: B
public class B extends A {
  int v2;
  
  B() {
    super(); // 수퍼 클래스의 기본 생성자를 호출한다.
             // 만약 개발자가 이렇게 수퍼 클래스의 생성자를 호출하는 코드를 작성하지 않는다면,
             // 컴파일러가 자동으로 수퍼 클래스의 기본 생성자를 호출하는 코드를 넣는다.
             // 수퍼 클래스의 생성자를 호출하는 코드는 반드시 첫 명령어로 와야 한다.
    System.out.println("B() 생성자 실행");
  }
  
  void m2() {
    System.out.println(this.v2);
  }
}
