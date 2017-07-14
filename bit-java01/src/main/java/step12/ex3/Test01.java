/* 다형성 : 오버라이딩(overriding)과 super 명령어    
 */
package step12.ex3;

public class Test01 /* extends Object */{

  public static void main(String[] args) {
    B obj = new B(); 
    obj.v1 = 100;
    obj.v2 = 200;
    
    // B 클래스에서 A 클래스와 똑 같은 이름과 형식을 가진 메서드가 있다.
    // 그래서 일관된 방식으로 메서드를 호출할 수 있어서 유지보수에 좋다.
    obj.print(); // B 클래스에 재정의한 print() 호출!
    
  }

}







