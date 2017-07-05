/* 부동소수점 변수를 사용하면서 가장 많이 오해하는 것!
 * => 컴파일할 때 오류가 발생하지 않았다고 해서 정상적이라고 생각하는 것!
 */
package step02;

public class Test04_2 {
  public static void main(String[] args) {    
    float f = 987654321.987654321f; 
    System.out.println(f); // 부동소수점은 메모리의 크기를 넘는, 
                           // 즉 유효범위를 벗어난 값을 넣으면 
                           // 오류가 발생하지 않고 단지 값이 짤릴 뿐이다.
  }

}
 