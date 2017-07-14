/* 상속 : 생성자 호출 시 꼭대기에 있는 클래스는?
 * => B 생성자는 A 생성자를 호출한다.
 *    그러면 A 생성자는 어떤 클래스의 생성자를 호출할까?
 *    아니면 A가 마지막이라서 호출 안하는가?
 * => 제일 꼭대기 있는 생성자는 Object 클래스의 생성자이다.
 *    이 클래스는 "최상위 클래스(root class)"라 부른다. 
 *     
 */
package step11.ex7;

// Test01 클래스도 Object의 서브 클래스이다.
public class Test01 /* extends Object */{

  public static void main(String[] args) {
    B obj = new B(); // 기본 생성자 호출

  }

}







