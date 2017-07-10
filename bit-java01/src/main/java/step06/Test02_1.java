/* 메서드 : 메서드 사용 후
 * => 반복해서 작성하는 코드가 있다면 별도의 블록으로 묶어 이름을 부여하라!
 * => 이렇게 이름이 부여된 블록을 "메서드(method; 함수)"라고 부른다.
 * => 문법
 *    리턴타입 메서드명(파라미터, ...) {
 *      반복해서 사용할 코드...
 *    }
 * => 메서드를 사용하려면 다음과 같이 메서드 이름을 작성하면 된다.
 *    메서드명(아규먼트,...);
 *    
 */
package step06;

public class Test02_1 {
  
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
    printGugudan(3);
    printGugudan(7);
    printGugudan(19);    
    printGugudan(27);    
    printGugudan(32);    
    printGugudan(33);    
    printGugudan(34);
    printGugudan(35);
    printGugudan(39);    
    printGugudan(40);    
    printGugudan(41);    
  }

}
