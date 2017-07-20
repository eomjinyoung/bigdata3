/* anonymous class - 익명 클래스 사용 후
 * 
 */
package step15.ex5;

public class Test01_3 {
  
  static class Member {
    String name;
    int age;
    
    public Member(String name, int age) {
      super();
      this.name = name;
      this.age = age;
    }
    
    public void print() {
      System.out.printf("이름=%s; 나이=%d\n", this.name, this.age);
    }
  }
  
  public static void main(String[] args) {
    Member m1 = new Member("홍길동", 20);
    m1.print();
    
    // 1) 익명 클래스(anonymous class)는 이름이 없다.
    //    => 생성자를 만들 수 없다.
    // 2) 익명 클래스의 레퍼런스 변수를 만들 수 없다.
    //    => 그래서 수퍼 클래스의 레퍼런스를 만든다.
    // 3) new 연산자를 사용하여 익명 클래스의 인스턴스를 만들 수 없다.
    //    => 클래스를 정의하는 것과 함께 인스턴스를 생성해야 한다.
    // 4) 익명 클래스의 생성자가 없다.
    //    => 인스턴스를 만들 때 수퍼 클래스의 생성자를 호출해야 한다.
    // 5) 필요없는 코드는 제거한다.
    //    => class 키워드와 extends 키워드 제거
    String tel2 = "1111-2222";
    
    Member m2 = new Member("임꺽정", 30) {
      String tel = tel2; // 로컬 변수를 통해 익명 객체의 인스턴스 변수 값을 초기화시킨다.
      public void print() {
        System.out.printf("이름=%s; 나이=%d; 전화=%s\n", 
            this.name, this.age, this.tel);
      }
    };
    
    m2.print();
  }
}






