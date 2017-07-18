/* 인스턴스 목록 다루기 : 레퍼런스 배열
 * => 레퍼런스 배열을 사용하여 여러 개의 인스턴스 주소를 저장할 수 있다.
 */
package step14;

public class Test05_1 {
  static class Student {
    String name;
    int age;
    boolean working;
    
    public Student(String name, int age, boolean working) {
      super();
      this.name = name;
      this.age = age;
      this.working = working;
    }

    public String toString() {
      return "Student [name=" + name + ", age=" + age + ", working=" + working + "]";
    }
  }
  public static void main(String[] args) {
    
  }
}
