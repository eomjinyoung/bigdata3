/* Object 클래스: equals() 오버라이딩 
 * => Object로부터 상속 받은 기능이 마음에 들지 않는다면 오버라이딩 하라!
 * => 비록 인스턴스가 다르더라도 값이 같은지 알고 싶은 경우가 있다.
 *    그런 경우 equals()를 오버라이딩한다.
 *    Object에서 상속 받은 원래의 equals()는 인스턴스 변수의 값을 비교하는 것이 아니라
 *    인스턴스가 같은지를 비교하기 때문에 그리 큰 쓸모가 없다.
 *    왜? 그냥 레퍼런스 주소를 비교하는 것이랑 같기 때문이다.
 *    
 */
package step14;

public class Test01_3 {
  
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
    
    // 인스턴스 주소를 비교하는 대신에 각각의 인스턴스 변수의 값이 같은지를 비교해보자!
    public boolean equals(Object obj) {
      if (!(obj instanceof Student)) return false;
      
      // 파라미터로 넘어온 주소가 Student의 인스턴스가 맞다면, 타입 캐스팅한다.
      Student other = (Student)obj;
      
      // String 값을 비교할 때는 == 대신 equals()를 사용해야 한다!
      if (!this.name.equals(other.name)) return false;
      
      // 자바 원시 타입(byte, short, char, int, long, float, double, boolean)의 값을 
      // 비교할 때는 그냥 관계 연산자(예: ==, != 등)를 사용한다.
      if (this.age != other.age) return false;
      
      return true;
    }
  }
  
  public static void main(String[] args) {
    Student s1 = new Student("홍길동", 20);
    Student s2 = new Student("홍길동", 20);

    System.out.println(s1);
    System.out.println(s2);
    
    if (s1 == s2) 
      System.out.println("s1 == s2");
    else 
      System.out.println("s1 != s2");
    
    if (s1.equals(s2)) 
      System.out.println("OK");
    else 
      System.out.println("NO");
  }

}








