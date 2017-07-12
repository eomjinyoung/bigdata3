/* 2단계: 클래스 분리 
 */
package step08.ex2;

public class ScoreTest {
  
  public static void main(String[] args) {
    // 클래스 메서드(스태틱 메서드)를 호출할 때는 항상 메서드 이름 앞에 클래스명을 붙인다.
    // 그래야 어느 클래스의 메서드인지 알 수 있다.
    // 물론 같은 클래스에 소속된 멤버를 호출할 때는 클래스명을 생략할 수 있다. 
    Score.init("홍길동", 100, 90, 80);
    Score.compute();
    Score.print();
  }

}





