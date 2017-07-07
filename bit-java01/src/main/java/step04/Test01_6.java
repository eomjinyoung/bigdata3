/* 산술 연산자: 암시적 형변환의 규칙 II
 * => byte,char,short --> int --> long --> float --> double
 * => 여러 타입이 섞여 있을 경우, 항상 위의 규칙에 따라 오른쪽 타입에 맞춘 후 계산을 수행한다.
 */
package step04;

public class Test01_6 {
  public static void main(String[] args) {
    byte b = 10;
    short s = 20;
    char c = 30;
    int i = 40;
    long l = 50;
    float f = 60f;
    double d = 70;
    
    double result = s + b - i * c + d - f + l;
    
    System.out.println(result);
  }
}








