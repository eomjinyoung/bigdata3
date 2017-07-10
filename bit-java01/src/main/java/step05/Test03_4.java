/* 명령어의 실행 흐름 제어: 반복문 while - continue
 * => continue는 다음 명령문을 실행하지 않고 즉시 조건문으로 이동한다.
 */
package step05;

public class Test03_4 {

  public static void main(String[] args) {
    int a = 0;

    while (true) {
      a++;
      
      if ((a % 2) == 1) // 홀수이면, 출력하지 말고 조건문으로 바로 이동한다.
        continue;
      
      System.out.println(a);
      
      if (a == 100)
        break; // 현재의 반복문 실행을 멈추고 반복문을 나간다.
    }
    
    System.out.println("끝!");
  } 

}









