/* 메서드 : 메서드 사용 후 III
 * => 반복해서 사용할 코드를 메서드로 묶어 정의해 두면
 *    코드를 간략하게 작성할 수 있다.
 * => 또한 변경이 용이하다.
 *    
 */
package step06;

public class Test02_3 {
  
  // 메서드 정의 
  // => 반복해서 사용하는 코드를 블록으로 묶은 것.
  static void printGugudan(int dan) {
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i += 2) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");
  }

  public static void main(String[] args) {
    // 구구단을 출력할 때 홀수(1, 3, 5, 7, 9)만 출력되게 변경하라!
    // => 반복문에서 i++ 을 i += 2 문장으로 변경해야 한다.
    // => 메서드의 코드만 변경하면 된다. 변경이 매우 쉽다.
    
    // 메서드 호출
    // => 별도의 블록으로 정의된 코드를 실행하는 것.
    int[] numList = {3, 7, 18, 27, 32, 33, 34, 35, 39, 40, 41};
    
    for (int num : numList) 
      printGugudan(num);
  }

}







