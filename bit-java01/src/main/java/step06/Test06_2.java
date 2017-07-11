/* 메서드 : 힙(heap) 메모리와 스택(stack) 메모리 II
 * => 힙에 생성된 메모리는 JVM이 종료될 때까지 유지된다.
 * => 스택에 생성된 로컬 변수는 메서드 호출이 끝나면 제거된다.
 */
package step06;

public class Test06_2 {
  
  static int[] create() {
    int[] score = {90, 80, 70, 0};
    return score;
    // create() 메서드 호출이 끝나면,
    // create()의 로컬 변수인 score는 스택 메모리에서 제거된다.
    // 그러나 힙에 생성된 배열 메모리는 제거되지 않는다.
  }
  
  static void compute(int[] score) {
    score[3] = score[0] + score[1] + score[2];
  }

  public static void main(String[] args) {
    int[] arr = create();
    compute(arr); 
    System.out.printf("%d, %d, %d, %d\n", arr[0], arr[1], arr[2], arr[3]);
  }

}





