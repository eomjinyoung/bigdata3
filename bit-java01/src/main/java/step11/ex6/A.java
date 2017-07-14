package step11.ex6;

/* 클래스를 정의할 때 수퍼 클래스를 지정하지 않으면,
 * 컴파일러는 자동으로 java.lang.Object 클래스를 상속 받도록 코드를 추가한다.
 * 따라서 자바의 모든 클래스는 제일 꼭대기에 Object 클래스가 있다.
 * 즉 자바의 모든 클래스는 Object 클래스의 자손이다.
 */
public class A /* extends Object */ {
  int v1;
  
  // A 클래스는 기본 생성자(파라미터가 없는 생성자)가 없다!
  // 예) A() {}
  
  A(int value) {
    super(); // 어느 클래스 생성자인가? Object 클래스의 생성자이다.
    this.v1 = value;
    System.out.println("A(int) 생성자 실행");
  }
  
  void m1() {
    System.out.println(this.v1);
  }
}
