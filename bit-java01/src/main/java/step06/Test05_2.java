/* 메서드 : call by value 와 call by reference II - 배열 주소 넘기기
 * => call by value
 *    - 메서드를 호출할 때 값을 넘기는 것.
 * => call by reference
 *    - 메서드를 호출할 때 주소를 넘기는 것. 
 *    
 */
package step06;

public class Test05_2 {
  
  static void callByReference(int[] score) {
    score[3] = score[0] + score[1] + score[2];
  }

  public static void main(String[] args) {
    int[] arr = {90, 80, 70, 0};
    callByReference(arr); // 메서드를 호출할 때 배열의 주소를 넘긴다.
    
    System.out.printf("%d, %d, %d, %d\n", arr[0], arr[1], arr[2], arr[3]);
  }

}





