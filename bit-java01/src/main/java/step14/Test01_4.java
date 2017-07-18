/* Object 클래스: hashCode() 오버라이딩 
 * => Object로부터 상속 받은 기능이 마음에 들지 않는다면 오버라이딩 하라!
 * => Object로부터 상속 받은 hashCode()는 인스턴스 마다 고유의 4바이트 정수 값을 출력한다.
 *    인스턴스 변수의 값이 같더라도 인스턴스가 다르면 다른 해시 값을 리턴한다.
 *    인스턴스의 내용이 같을 때 같은 해시 값을 리턴하고 싶다면,
 *    hashCode() 메서드를 오버라이딩 하라!
 * => 자바에서는 내용물이 같은지 비교할 때 equals()와 hashCode()를 함께 비교하기 때문에
 *    오버라이딩 할 때도 가능한 두 메서드를 모두 재정의하라!
 */
package step14;

public class Test01_4 {
  
  static class Student {
    String name;
    int age;
    
    public Student(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String toString() {
      return "Student [name=" + name + ", age=" + age + "]";
    }

    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + age;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      return result;
    }

    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Student other = (Student) obj;
      if (age != other.age)
        return false;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      return true;
    }

  }
  
  public static void main(String[] args) {
    Student s1 = new Student("홍길동", 20);
    Student s2 = new Student("홍길동", 20);
    
    System.out.println(s1.equals(s2));
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    
    
    /* Student 클래스처럼 개발자가 새 데이터 타입을 만들고 난 후 
     * 그 클래스의 인스턴스 값이 같은 지 비교하고 싶다면,
     * equals()와 hashCode()를 반드시 재정의하라!
     */
  }

}








