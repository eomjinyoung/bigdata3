/* 메서드 : call by value 와 call by reference III - 객체 주소 넘기기
 * => call by value
 *    - 메서드를 호출할 때 값을 넘기는 것.
 * => call by reference
 *    - 메서드를 호출할 때 주소를 넘기는 것. 
 *    
 */
package step06;

public class Test05_3 {
  // 메모리를 만들 때 사용할 설계도 정의 
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  
  static void compute(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3f;
  }
  
  static void print(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %f\n", 
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }

  public static void main(String[] args) {
    Score obj; // Score 설계도에 따라 준비한 메모리의 주소를 보관하는 변수 선언
    obj = new Score(); // Score 설계도에 따라 메모리를 준비하고, 그 준비된 메모리의 주소를 obj에 저장.
    
    // 준비한 메모리에 값을 넣기 => 메모리 주소를 이용하여 특정 메모리에 값을 저장한다.
    obj.name = "홍길동";
    obj.kor = 90;
    obj.eng = 80;
    obj.math = 70;
    
    compute(obj); // 메서드를 호출할 때 Score 인스턴스의 주소를 넘긴다. = call by reference
    print(obj); // 메서드를 호출할 때 Score 인스턴스의 주소를 넘긴다. = call by reference
  }

}





