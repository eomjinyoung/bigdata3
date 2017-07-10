/* 메서드 : 메서드 사용 전 II
 * => 같은 코드를 쓸 때마다 반복해서 작성한다.
 * => 문제는 변경할 때이다.
 *    반복해서 작성한 코드를 모두 바꿔야 한다.
 */
package step06;

public class Test01_2 {

  public static void main(String[] args) {
    // 구구단을 출력할 때 홀수(1, 3, 5, 7, 9)만 출력되게 변경하라!
    // => 각 반복문에서 i++ 을 i += 2 문장으로 변경해야 한다.
    // => 모든 반복문을 변경해야 함으로 매우 번거롭다.
    
    int dan = 3;
    
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i += 2) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");
    
    dan = 7;
    
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i += 2) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");
    
    dan = 19;
    
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i += 2) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");
    
    dan = 27;
    
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i += 2) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");
    
    dan = 32;
    
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i += 2) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");
    
    dan = 33;
    
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i += 2) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");
    
    dan = 34;
    
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i += 2) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");  

    dan = 35;
    
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i += 2) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");
    
    dan = 39;
    
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i += 2) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");    
    
    dan = 40;
    
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i += 2) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");
    
    dan = 41;
    
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i += 2) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");
  }

}
