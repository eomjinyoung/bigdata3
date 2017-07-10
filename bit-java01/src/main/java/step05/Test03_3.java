/* 명령어의 실행 흐름 제어: 반복문 while - break
 * => break는 현재의 반복문 실행을 중지한다.
 */
package step05;

public class Test03_3 {

  public static void main(String[] args) {
    int a = 0;

    while (true) {
      a++;
      System.out.println(a);
      
      if (a == 100)
        break; // 현재의 반복문 실행을 멈추고 반복문을 나간다.
    }
    
    System.out.println("끝!");
  } 

}









