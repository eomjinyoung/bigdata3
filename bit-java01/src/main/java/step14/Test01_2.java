/* Object 클래스: toString() 오버라이딩 
 * => Object로부터 상속 받은 기능이 마음에 들지 않는다면 오버라이딩 하라!
 */
package step14;

public class Test01_2 {
  
  static class Student {
    String name;
    int age;
    
    public Student(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }
  
  public static void main(String[] args) {
    Student s1 = new Student("홍길동", 20);
    Student s2 = new Student("임꺽정", 30);

    System.out.println(s1.toString());
    System.out.println(s2.toString());
  }

}








