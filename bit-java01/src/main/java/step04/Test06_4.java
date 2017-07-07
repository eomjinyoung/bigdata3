/* 증가/감소 연산자: 후위 연산자와 전위 연산자의 차이 III
 * => 변수의 값을 1 증가시키거나 1 감소시킨다.  
 * => n++ : 후위(postfix) 연산자
 *    - 변수의 값을 먼저 그 자리에 놓은 후, 변수의 값을 증가시킨다.
 * => ++n : 전위(prefix) 연산자
 *    - 변수의 값을 먼저 증가시킨 후, 그 자리에 변수의 값을 놓는다. 
 */
package step04;

public class Test06_4 {
  public static void main(String[] args) {
    int a = 10;
    
    int r = ++a + ++a + ++a;
    // 1) r = 11 + 12 + 13; <--- a 변수의 값을 증가시킨후 그자리에 a 값을 놓는다.
    // 2) r = 36;
    System.out.printf("%d, %d\n", a, r);
    
    a = 10;
    r = a++ + a++ + a++;
    // 1) r = 10 + 11 + 12; <--- a 값을 놓은 후에 a 변수의 값을 증가시킨다. 
    // 2) r = 33; 
    System.out.printf("%d, %d\n", a, r);
    
  }
}








