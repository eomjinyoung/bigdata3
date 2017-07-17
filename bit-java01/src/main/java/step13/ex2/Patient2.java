package step13.ex2;

public class Patient2 {
  // 레퍼런스로 직접 접근하지 못하도록 modifier를 붙인다.
  private String name;
  private int age;
  private float weight;
  private float height;
  private boolean woman;
  
  // 보통 인스턴스 변수의 값을 설정하기 위해 만든 메서드 이름은 set으로 시작한다.
  // 그래서 이런 메서드를 "셋터(setter)"라 부른다.
  void setName(String name) {
    this.name = name;
  }
  
  // 보통 인스턴스 변수의 값을 꺼내주기 위해 만든 메서드 이름은 get으로 시작한다.
  // 그래서 이런 메서드를 "겟터(getter)"라 부른다.
  String getName() {
    return this.name;
  }
  
  void setAge(int age) {
    if (age < 1 || age > 150)
      return;
    this.age = age;
  }
  int getAge() {
    return this.age;
  }
  
  void setWeight(float weight) {
    if (weight < 1 || weight > 500f)
      return;
    this.weight = weight;
  }
  float getWeight() {
    return this.weight;
  }
  
  void setHeight(float height) {
    if (height < 1 || height > 300f)
      return;
    this.height = height;
  }
  float getHeight() {
    return this.height;
  }
  
  void setWoman(boolean woman) {
    this.woman = woman;
  }
  
  // 리턴 값이 boolean인 겟터 메서드 만들 때 그 이름을 "get" 대신에 "is"를 주로 사용한다.
  boolean isWoman() {
    return this.woman;
  }
}







