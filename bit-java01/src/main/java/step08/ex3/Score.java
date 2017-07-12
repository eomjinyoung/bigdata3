package step08.ex3;

public class Score {
  
  // 인스턴스 변수 선언
  // => 인스턴스 변수는 클래스 변수와 달리 클래스가 로딩될 때 자동으로 생성되지 않는다.
  // => 반드시 new 명령을 사용하여 메모리(인스턴스 변수들)를 생성해야 한다.
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;

  // 클래스 변수에서 특정 인스턴스의 변수를 다루려면,
  // 인스턴스 주소를 받아야 한다.
  static void init(Score that, String name, int kor, int eng, int math) {
    that.name = name;
    that.kor = kor;
    that.eng = eng;
    that.math = math;
  }
  
  static void compute(Score that) {
    that.sum = that.kor + that.eng + that.math;
    that.aver = that.sum / 3f;
  }

  static void print(Score that) {
    System.out.printf("%s: %d, %d, %d, %d, %f\n", 
        that.name, that.kor, that.eng, that.math, that.sum, that.aver);
  }
}
