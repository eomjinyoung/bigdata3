/* 명령어의 실행 흐름 제어: 반복문 for 와 변수의 범위
 */
package step05;

public class Test05_9 {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) { 
      System.out.println(i);
    }
    
    // for 문에 선언된 변수는 for 문 안에서만 사용가능하다.
    // for 문을 벗어나면 해당 변수는 제거된다.
    //System.out.println(i); // 컴파일 오류!
  } 

}









