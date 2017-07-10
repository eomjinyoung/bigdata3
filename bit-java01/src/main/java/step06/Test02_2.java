/* 메서드 : 메서드 사용 후 II
 * => 반복문과 배열을 사용하여 호출하는 명령어를 줄이자!
 *    
 */
package step06;

public class Test02_2 {
  
  // 메서드 정의 
  // => 반복해서 사용하는 코드를 블록으로 묶은 것.
  static void printGugudan(int dan) {
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i++) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");
  }

  public static void main(String[] args) {
    // 메서드 호출
    // => 별도의 블록으로 정의된 코드를 실행하는 것.
    int[] numList = {3, 7, 18, 27, 32, 33, 34, 35, 39, 40, 41};
    
    for (int num : numList) 
      printGugudan(num);
  }

}







