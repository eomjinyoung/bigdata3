/* 예외 처리 문법 사용 전
 * => 메서드의 리턴 값으로 예외 상황을 알리고 받아야 한다.
 */
package step22.ex4;

public class Test01 {

  public static void main(String[] args) {
    System.out.println(Calculator.plus(10, 20));
    System.out.println(Calculator.minus(10, 20));
    System.out.println(Calculator.multiple(10, 20));
    
    // 예외 처리 문법을 사용:
    // 예외가 발생할 수 있는 메서드는 try 블록에서 실행하고,
    // 예외 처리는 catch 블록에서 실행한다.
    try {
      int result = Calculator.divide(20, 10);
      System.out.println(result);
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
    try {
      System.out.println(Calculator.divide(20, 0));
      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
    // 위와 같이 메서드의 리턴 값이 아닌 별도의 경로로 예외 정보를 받기 때문에
    // 정상적인 나누기가 수행되지 않을 가능성이 제거된다.
    
    
    
  }

}
