/* 예외 처리 문법 사용 전
 * => 메서드의 리턴 값으로 예외 상황을 알리고 받아야 한다.
 */
package step22.ex4;

public class Test01 {

  public static void main(String[] args) {
    System.out.println(Calculator.plus(10, 20));
    System.out.println(Calculator.minus(10, 20));
    System.out.println(Calculator.multiple(10, 20));
    
    // 예외 처리 문법이 없던 시절에는
    // 나누기를 할 때 항상 리턴 값을 확인해야 한다.
    int result = Calculator.divide(20, 10);
    if (result == -989898) 
      System.out.println("0으로 나눌 수 없습니다.");
    else
      System.out.println(result);
    
    result = Calculator.divide(20, 0);
    if (result == -989898) 
      System.out.println("0으로 나눌 수 없습니다.");
    else
      System.out.println(result);

    
    // 리턴 값으로 예외 상황을 알리는 방법은
    // 한 가지 문제를 안고 있다.
    // 만약 리턴 값 자체가 유효한 나누기 결과 값이라면?
    result = Calculator.divide(989898, -1);
    if (result == -989898) 
      System.out.println("0으로 나눌 수 없습니다.");
    else
      System.out.println(result);
    
    // 위 코드는 0으로 나누는 것이 아닌데도 결과가 "0으로 나눌 수 없습니다."를 출력한다.
    // 즉 리턴 값으로 예외 상황을 알리는 방식은 항상 한계가 있다.
    // 이런 것을 해결하기 위해 나온 문법이 예외 처리 문법이다.
    
    
  }

}
