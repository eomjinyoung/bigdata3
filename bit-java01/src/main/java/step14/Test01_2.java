/* Object 클래스: toString() 오버라이딩 
 * => Object로부터 상속 받은 기능이 마음에 들지 않는다면 오버라이딩 하라!
 * => 자바 프로그램을 실행 할 때 특정 객체의 값이 무엇인지 확인해야 하는 경우가 있다.
 *    이런 경우를 대비해 개발자들은 toString() 오버라이딩 한다.
 *    즉 현재 객체의 인스턴스 변수의 값을 리턴하도록 toString()을 재정의한다.
 *    
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
    
    // Object에서 상속 받은 메서드를 이 클래스의 역할에 맞게 재정의한다.
    public String toString() {
      return String.format("name=%s, age=%d", this.name, this.age);
    }
  }
  
  public static void main(String[] args) {
    Student s1 = new Student("홍길동", 20);
    Student s2 = new Student("임꺽정", 30);

    System.out.println(s1.toString());
    System.out.println(s2.toString());
    
    // println()을 호출할 때 문자열을 주지 않으면,
    // println() 메서드 내부에서 그 객체의 toString()을 호출한 후 그 리턴 값을 출력한다.
    // 따라서 다음은 위의 코드와 결과가 같다.
    System.out.println(s1);
    System.out.println(s2);
  }

}








