/* 배열 
 * => 같은 종류의 메모리를 연속해서 여러 개 만드는 명령
 */
package step03;

public class Test01_1 {
  public static void main(String[] args) {
    // 문제: 이름, 국어, 영어, 수학, 합계, 평균을 저장할 변수를 만들어라!
    
    // 배열 사용 전
    String name;
    int kor, eng, math, sum;
    float aver;
    
    // 변수에 값을 넣는다.
    name = "홍길동";
    kor = 100;
    eng = 100;
    math = 100;
    sum = kor + eng + math;
    aver = sum / 3f;
    
    /* %s : 문자열. 즉 String 값 
     * %d : 정수 값. 10진수로 표시한다.
     * %f : 부동소수점 값.
     */
    System.out.printf("%s: %d, %d, %d, %d, %f\n", name, kor, eng, math, sum, aver);
    
    
  }
}






