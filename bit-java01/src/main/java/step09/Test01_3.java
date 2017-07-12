/* 클래스 로딩과 메모리 영역 III
 * => Test01_3 실행 과정
 * 1) Test01_2 클래스 로딩(Method Area)
 * 2) Test01_2.main() 호출
 *    - 프레임 메모리 생성(Stack)
 * 3) Greeting 클래스 로딩(Method Area)
 * 4) Greeting.hello() 호출
 *    - 프레임 메모리 생성(Stack)
 * 
 */
package step09;

public class Test01_3 {
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
    
  }
}











