/* 명령어의 실행 흐름 제어: else의 소속 
 * => else는 가장 가까운 if에 종속된다.
 */
package step05;

public class Test01_6 {

  public static void main(String[] args) {
    int a = 20;

    if (a < 19) 
      if (a < 14)
        System.out.println("아동입니다.");
    else // 주의! 이 else는 바로 이전의 if에 묶인다.
      System.out.println("성년이다!");
    
    System.out.println("-------------------------");
    
    // 위에서 else가 첫 번째 if에 묶일려면 다음과 같이 중괄호를 사용하여
    // if (a < 14 ) 와 else를 떼어내야 한다.
    if (a < 19) {
      if (a < 14)
        System.out.println("아동입니다.");
    }
    else // 이 else는 if (a < 19) 문장에 소속된다.
      System.out.println("성년이다!");
      
   
  } 

}









