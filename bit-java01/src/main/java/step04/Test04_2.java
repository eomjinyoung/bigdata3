/* 비트 논리 연산자: &, |, ^, ~ 연산자의 응용
 */
package step04;

public class Test04_2 {
  public static void main(String[] args) {
    int a = 0b0110_1010, // 0000_0000_0000_0000_0000_0000_0110_1010 
        b = 0b0011_0011; // 0000_0000_0000_0000_0000_0000_0011_0011
    
    // & 응용: 특정 비트의 값을 뽑아내거나 거를 때 사용한다.
    //        그래픽 관련 분야에서 많이 사용한다. 즉 필터를 구현할 때 많이 사용한다.
    System.out.println(Integer.toBinaryString(a & 0b1111_0000));
    System.out.println(Integer.toBinaryString(a & 0b0011_1000));
    
    // | 응용: 기존의 값을 강화할 때 사용한다.
    //        그래픽 관련 분야에서 특정 색상이나 밝기를 더 높일 때 사용한다.
    System.out.println(Integer.toBinaryString(a | 0x55555555));
    
   
  }
}





