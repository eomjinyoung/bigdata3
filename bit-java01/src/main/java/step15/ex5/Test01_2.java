/* anonymous class - 익명 클래스 사용 전
 * 
 */
package step15.ex5;

public class Test01_2 {
  
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
    
    // 딱 한 회원에 대해서만 전화번호를 입력 받아 출력한다면,
    // 따로 클래스를 만들지 말고 익명 클래스를 활용하라!
    // 익명 클래스라는 문법이 없다면,
    // 다음과 같이 일일이 서브 클래스를 명확히 만들어 사용해야 한다.
    class Member2 extends Member {
      String tel;
      public Member2(String name, int age, String tel) {
        super(name, age);
        this.tel = tel;
      }
      public void print() {
        System.out.printf("이름=%s; 나이=%d; 전화=%s\n", 
            this.name, this.age, this.tel);
      }
    }
    
    Member2 m2 = new Member2("임꺽정", 30, "1111-1111");
    m2.print();
  }
}






