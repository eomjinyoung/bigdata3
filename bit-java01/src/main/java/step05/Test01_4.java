/* 명령어의 실행 흐름 제어: 조건문 if ~ else II
 * => else 문장 없이 if 문장을 작성할 순 있지만,
 *    else 문만 따로 작성할 수 없다.
 * => else문만 따로 작성할 수 없으니까, 
 *    if ~ else ~ 문은 한 문장으로 취급한다.
 * => if (조건문) 명령문;
 * => if (조건문) 명령문; else 명령문;
 *  
 *    
 *    
 */
package step05;

public class Test01_4 {

  public static void main(String[] args) {
    int a = 70;

    if (a < 19) 
      System.out.println("미성년이다!");
    else  // if ~ else ~는 한 문장이기 때문에 중괄호로 묶을 필요가 없다.
      if (a >= 19 && a < 40)
        System.out.println("청년이다!");
      else // if ~ else ~는 한 문장이기 때문에 중괄호로 묶을 필요가 없다. 
        if (a >= 40 && a < 65)
          System.out.println("중년이다!");
        else
          System.out.println("노인이다!");
  } 

}









