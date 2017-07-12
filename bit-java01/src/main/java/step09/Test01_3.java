/* 클래스 로딩과 메모리 영역 III
 * => Test01_3 실행 과정
 * Test01_3 클래스 로딩 : Method Area
 * Test01_3.main() 호출 
 *   => 프레임 메모리 준비 : Stack
 *   => Score 클래스 로딩 : Method Area
 *   => Score 인스턴스 변수 준비 : Heap
 *   => Score 인스턴스 변수에 값 저장
 *   => ScoreController 클래스 로딩 : Method Area
 *   => ScoreController.print() 호출
 *      => 프레임 메모리 준비 : Stack
 *      => 메서드 실행
 *      => 프레임 메모리 제거
 *   => 프레임 메모리 제거
 * OS에게 모든 메모리 반납!
 * 
 * 
 */
package step09;

public class Test01_3 {
  
  // 다른 클래스 안에 정의된 클래스를 nested 클래스(또는 inner 클래스)라 부른다.
  // 다른 클래스 안에 있더라도 컴파일 하면 각각의 클래스 블록이 별도의 .class 파일로 생성된다.
  // 클래스를 로딩할 때도 각각 따로 따로 로딩된다.
  // 즉 Test01_3 클래스가 로딩될 때, 이 안에 정의된 클래스들도 함께 로딩되는 것이 아니다.
  // 클래스 로딩은 무조건 .class 파일 단위다.
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
  }
  
  static class ScoreController {
    static void print(Score score) {
      System.out.printf("%s: %d, %d, %d\n", 
          score.name, score.kor, score.eng, score.math);
    }
  }
  
  public static void main(String[] args) {
    Score s = new Score();
    s.name = "홍길동";
    s.kor = 100;
    s.eng = 100;
    s.math = 100;
    
    ScoreController.print(s);
  }
}











