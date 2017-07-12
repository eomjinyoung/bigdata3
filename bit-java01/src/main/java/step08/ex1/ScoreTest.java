/* 메서드 : 힙(heap) 메모리와 스택(stack) 메모리 IV - 클래스 인스턴스 
 * => 힙에 생성된 메모리는 JVM이 종료될 때까지 유지된다.
 * => 스택에 생성된 로컬 변수는 메서드 호출이 끝나면 제거된다.
 */
package step08.ex1;

public class ScoreTest {
  
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  
  static Score create(String name, int kor, int eng, int math) {
    Score obj = new Score();
    obj.name = name;
    obj.kor = kor;
    obj.eng = eng;
    obj.math = math;
    return obj;
  }
  
  static void compute(Score obj) {
    obj.sum = obj.kor + obj.eng + obj.math;
    obj.aver = obj.sum / 3f;
  }

  static void print(Score obj) {
    System.out.printf("%s: %d, %d, %d, %d, %f\n", 
        obj.name, obj.kor, obj.eng, obj.math, obj.sum, obj.aver);
  }
  
  public static void main(String[] args) {
    Score s1 = create("홍길동", 100, 90, 80);
    Score s2 = create("임꺽정", 90, 80, 70);
    Score s3 = create("유관순", 80, 70, 60);
    
    compute(s1);
    compute(s2);
    compute(s3);
    
    print(s1);
    print(s2);
    print(s3);
  }

}





