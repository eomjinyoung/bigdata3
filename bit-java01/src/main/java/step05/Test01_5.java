/* 명령어의 실행 흐름 제어: 조건문 if ~ else III
 * => if ~ else 문이 여러 개 겹쳐있을 때는 
 *    보기 쉽게 코드를 일렬로 정렬한다.
 */
package step05;

public class Test01_5 {

  public static void main(String[] args) {
    int a = 70;

    if (a < 19) 
      System.out.println("미성년이다!");
    else if (a >= 19 && a < 40)
      System.out.println("청년이다!");
    else if (a >= 40 && a < 65)
      System.out.println("중년이다!");
    else
      System.out.println("노인이다!");
   
    /* if ~ else를 정렬하면 위와 같은 코드 구조가 되는데,
     * 그러다보니 개발자들이 if ~ else if ~ else if ~ else 라고 생각하며
     * else if 문이 있는 줄 착각한다. 주의하라!
     * 
     * VBSciprt는 if ~ elseif ~ else 라는 문법이 별도로 있다.
     * 그러나 자바에서는 else if 문법이 따로 없다!
     */
  } 

}









