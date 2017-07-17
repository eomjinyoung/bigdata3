package step13.ex2;

public class Patient2 {
  // 레퍼런스로 직접 접근하지 못하도록 modifier를 붙인다.
  private String name;
  private int age;
  private float weight;
  private float height;
  private boolean gender;
  
  // 보통 인스턴스 변수의 값을 설정하기 위해 만든 메서드 이름은 set으로 시작한다.
  // 그래서 이런 메서드를 "세터(setter)"라 부른다.
  void setName(String name) {
    this.name = name;
  }
  void setAge(int age) {
    if (age < 1 || age > 150)
      return;
    this.age = age;
  }
  void setWeight(float weight) {
    if (weight < 1 || weight > 500f)
      return;
    this.weight = weight;
  }
  void setHeight(float height) {
    if (height < 1 || height > 300f)
      return;
    this.height = height;
  }
  void setGender(boolean gender) {
    this.gender = gender;
  }
}







