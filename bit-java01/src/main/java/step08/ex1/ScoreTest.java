/* 1단계: 클래스 변수와 클래스 메서드 
 */
package step08.ex1;

public class ScoreTest {
  
  // 클래스 변수 선언
  static String name;
  static int kor;
  static int eng;
  static int math;
  static int sum;
  static float aver;
  
  // static이 붙은 메서드는 "클래스 메서드"이다. "스태틱 메서드"라고도 부른다.
  static void init(String name, int kor, int eng, int math) {
    // 로컬 변수의 이름과 클래스 변수의 이름이 같을 경우,
    // 클래스 변수 이름 앞에 클래스명을 붙여라!
    ScoreTest.name = name;
    ScoreTest.kor = kor;
    ScoreTest.eng = eng;
    ScoreTest.math = math;
  }
  
  static void compute() {
    // 클래스 변수와 이름이 같은 로컬 변수가 없다면,
    // 클래스 변수 이름 앞에 클래스명을 생략해도 된다.
    sum = kor + eng + math;
    aver = sum / 3f;
  }

  static void print() {
    System.out.printf("%s: %d, %d, %d, %d, %f\n", 
        name, kor, eng, math, sum, aver);
  }
  
  public static void main(String[] args) {
    init("홍길동", 100, 90, 80);
    compute();
    print();
  }

}





