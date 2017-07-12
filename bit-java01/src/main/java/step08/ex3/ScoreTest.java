/* 3단계: 인스턴스 변수를 사용하여 새 데이터 타입 정의(새 메모리 설계도 작성)
 */
package step08.ex3;

public class ScoreTest {
  
  public static void main(String[] args) {
    Score.init("홍길동", 100, 90, 80);
    Score.compute();
    Score.print();
  }

}





