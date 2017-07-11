/* 메서드 : call by value 와 call by reference
 * => call by value
 *    - 메서드를 호출할 때 값을 넘기는 것.
 * => call by reference
 *    - 메서드를 호출할 때 주소를 넘기는 것. 
 *    
 */
package step06;

public class Test05_1 {
  
  static void callByValue(int age) {
    age = 50;
    System.out.printf("age=%d\n", age);
  }

  public static void main(String[] args) {
    int value = 20;
    callByValue(value); // 메서드를 호출할 때 value 변수의 값을 전달한다.
    
    System.out.println(value);
  }

}





