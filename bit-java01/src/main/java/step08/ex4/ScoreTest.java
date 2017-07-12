/* 4단계: 인스턴스 메서드를 사용하여 인스턴스 변수 다루기
 */
package step08.ex4;

public class ScoreTest {
  
  public static void main(String[] args) {
    Score s1 = new Score();
    Score s2 = new Score();
    Score s3 = new Score();
    
    Score.init(s1, "홍길동", 100, 90, 80);
    Score.init(s2, "임꺽정", 80, 70, 60);
    Score.init(s3, "유관순", 70, 50, 40);
    
    Score.compute(s1);
    Score.compute(s2);
    Score.compute(s3);
    
    Score.print(s1);
    Score.print(s2);
    Score.print(s3);
    
  }

}





