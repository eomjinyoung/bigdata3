package step12.ex1;

public class B extends A {
  int v2;
  
  // B의 인스턴스 값을 출력할 메서드를 새로 만든다.
  // A의 print()를 호출하여 A 설계도를 통해 만든 변수를 출력하고,
  // print2()에서는 B의 설계도를 통해 만든 변수만 출력한다.
  void print2() {
    this.print();
    System.out.printf("v2 = %d\n", this.v2);
  }
}
