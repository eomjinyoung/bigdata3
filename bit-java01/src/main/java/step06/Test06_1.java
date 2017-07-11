/* 메서드 : 힙(heap) 메모리와 스택(stack) 메모리
 * => 힙(heap)
 *    - 배열 메모리나 클래스의 인스턴스를 만드는 메모리 영역 
 * => 스택(stack)
 *    - 메서드에 선언된 로컬 변수를 만드는 메모리 영역
 *    - 메서드가 호출되는 순간, 
 *      그 메서드를 위한 프레임(frame)이라 불리는 메모리가 준비되고 
 *      그 프레임 메모리 안에 로컬 변수가 생성된다.
 *    - 메서드 실행이 완료되면,
 *      그 메서드를 위해 준비했던 프레임을 제거한다.
 *  
 *    
 */
package step06;

public class Test06_1 {
  
  static void compute(int[] score) {
    // score 로컬 변수는 스택에 생성된다.
    score[3] = score[0] + score[1] + score[2];
  }

  public static void main(String[] args) {
    // args와 arr 로컬 변수는 스택에 생성된다.
    // new int[] 배열 메모리는 힙에 생성된다.
    int[] arr = new int[] {90, 80, 70, 0};
    compute(arr); 
    
    System.out.printf("%d, %d, %d, %d\n", arr[0], arr[1], arr[2], arr[3]);
  }

}





