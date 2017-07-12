package step08.ex2;

public class Score {
  
  static String name;
  static int kor;
  static int eng;
  static int math;
  static int sum;
  static float aver;

  static void init(String name, int kor, int eng, int math) {
    Score.name = name;
    Score.kor = kor;
    Score.eng = eng;
    Score.math = math;
  }
  
  static void compute() {
    sum = kor + eng + math;
    aver = sum / 3f;
  }

  static void print() {
    System.out.printf("%s: %d, %d, %d, %d, %f\n", 
        name, kor, eng, math, sum, aver);
  }
}
