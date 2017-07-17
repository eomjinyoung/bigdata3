package step13.ex4;

public class Score {
  private String name;
  private int kor;
  private int eng;
  private int math;
  private int sum;
  private float aver;
  
  Score() {}
  
  Score(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    if (kor < 0 || kor > 100)
      return;
    this.kor = kor;
    compute();
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    if (eng < 0 || eng > 100)
      return;
    this.eng = eng;
    compute();
  }

  public int getMath() {
    return math;
  }

  public void setMath(int math) {
    if (math < 0 || math > 100)
      return;
    this.math = math;
    compute();
  }

  public int getSum() {
    return sum;
  }

  public float getAver() {
    return aver;
  }
  
  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }

}








