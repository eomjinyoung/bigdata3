/* 캡슐화 적용 후
 * => 클래스를 정의한 원래 목적과 다른 값이 저장되지 않도록
 *    인스턴스 변수에 직접 접근하는 것을 막는다.
 * => 메서드를 통해 값을 넣는데, 유효한 값만 설정되게 한다.
 */
package step13.ex2;

public class Test02 {

  public static void main(String[] args) {
    Patient2 p = new Patient2();
    
    // 인스턴스 변수에 직접 접근할 수 없다. 
    /*
    p.name = "홍길동";
    p.age = 200;
    p.weight = 300;
    p.height = 500;
    p.gender = false;
    */
    
    // 대신 메서드를 통해 값을 설정해야 한다.
    
    

  }

}
