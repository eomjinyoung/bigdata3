/* 명령어의 실행 흐름 제어: 조건문 if ~ else
 * => 여러 개의 조건을 나열할 경우,
 *    처음 조건이 맞는다 할지라도,
 *    다음 조건을 계속 비교하기 때문에 비효율적이다.
 * => 이를 해결하기 위해 나온 문법이 if ~ else 이다.
 *    첫 번째 조건이 맞으면 다음 조건은 비교도 하지 않는다.
 *    
 */
package step05;

public class Test01_3 {

  public static void main(String[] args) {
    int a = 10;

    if (a < 19) 
      System.out.println("미성년이다!");
    else { // if 조건이 거짓일 때만 else 블록을 실행한다.
      if (a >= 19 && a < 40)
        System.out.println("청년이다!");
      else {
        if (a >= 40 && a < 65)
          System.out.println("중년이다!");
        else
          System.out.println("노인이다!");
      }
    }
    
  } 

}









