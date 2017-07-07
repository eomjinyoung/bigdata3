/* 산술 연산자: 암시적 형변환과 명시적 형변환을 섞어 쓰기
 */
package step04;

public class Test01_9 {
  public static void main(String[] args) {
    System.out.println(5 / (float)2);
    // 값 2에 대해서는 명시적으로 형변환을 수행하여 2f를 만들었다.
    // 5와 2f를 연산하려니 두 개의 데이터 타입이 맞지 않아 불가능하다.
    // 이때 5에 대해서 암시적 형변환이 수행된다.
    // 즉 int 5를 가지고 float 5f를 만든다.
    // 그래서 5f 와 2f를 연산할 수 있다.
    
  }
}








