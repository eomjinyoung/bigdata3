/* 증가/감소 연산자: ++, --
 * => 변수의 값을 1 증가시키거나 1 감소시킨다.  
 * => n++ : 후위(postfix) 연산자
 *    - 변수의 값을 먼저 그 자리에 놓은 후, 변수의 값을 증가시킨다.
 * => ++n : 전위(prefix) 연산자
 *    - 변수의 값을 먼저 증가시킨 후, 그 자리에 변수의 값을 놓는다. 
 */
package step04;

public class Test06_1 {
  public static void main(String[] args) {
    int a1 = 10, a2 = 10, 
        b1 = 10, b2 = 10;
    
    a1++;
    ++a1;
    System.out.println(a1);
    System.out.println(a2);
    
    b1--;
    --b1;
    System.out.println(b1);
    System.out.println(b2);
    
  }
}








