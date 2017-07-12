package step08.ex4;

public class Score {
  
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;

  // 인스턴스 변수를 다룰 인스턴스 메서드 선언
  // => static을 붙이지 않는다.
  // => 메서드를 호출할 때 넘겨준 인스턴스 주소가 
  //    메서드의 내장 변수 this에 저장되기 때문에
  //    인스턴스 주소를 받기 위해 파라미터를 선언할 필요가 없다.
  void init(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }
  
  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }

  void print() {
    System.out.printf("%s: %d, %d, %d, %d, %f\n", 
        this.name, this.kor, this.eng, this.math, this.sum, this.aver);
  }
}
