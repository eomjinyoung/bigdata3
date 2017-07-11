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
  
  static void computer(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3f;
  }
  
  static void print(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %f\n", 
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }

  public static void main(String[] args) {
    int[] arr = {90, 80, 70, 0};
    callByReference(arr); // 메서드를 호출할 때 배열의 주소를 넘긴다.
    
    System.out.printf("%d, %d, %d, %d\n", arr[0], arr[1], arr[2], arr[3]);
  }

}





