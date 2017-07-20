/* anonymous class - 인스턴스 생성
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
    
  }
}






