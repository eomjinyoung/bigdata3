package step11.ex5;

// B 클래스는 A 클래스를 상속한다.
// 부모(수퍼) 클래스: A
// 자식(서브) 클래스: B
public class B extends A {
  int v2;
  
  void m2() {
    System.out.println(this.v2);
  }
}
