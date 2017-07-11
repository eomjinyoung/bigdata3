/* 메서드 : 힙(heap) 메모리와 스택(stack) 메모리 III - 클래스 인스턴스 
 * => 힙에 생성된 메모리는 JVM이 종료될 때까지 유지된다.
 * => 스택에 생성된 로컬 변수는 메서드 호출이 끝나면 제거된다.
 */
package step06;

public class Test06_3 {
  
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  
  static Score create() {
    Score obj = new Score();
    obj.name = "홍길동";
    obj.kor = 90;
    obj.eng = 80;
    obj.math = 70;
    return obj;
  }
  
  static void compute(Score obj) {
    obj.sum = obj.kor + obj.eng + obj.math;
    obj.aver = obj.sum / 3f;
  }

  public static void main(String[] args) {
    Score obj = create();
    compute(obj); 
    System.out.printf("%s: %d, %d, %d, %d, %f\n", 
        obj.name, obj.kor, obj.eng, obj.math, obj.sum, obj.aver);
  }

}





