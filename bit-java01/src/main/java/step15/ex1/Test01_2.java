/* 패키지 멤버 클래스 사용하기
 */
package step15.ex1;

public class Test01_2 {
  public static void main(String[] args) {
    // 같은 패키지에 소속된 클래스라면,
    // => 패키지명을 지정하지 않고 클래스 이름만 사용해도 된다. 
    MyClass obj = new MyClass();
    
    // 다른 패키지에 소속된 클래스라면,
    // => 패키지명을 포함하여 클래스를 지정해야 한다.
    //    반드시 전체 패키지명을 적어야 한다. 
    //    일부만 적으면 안된다.
    // => 물론 import를 하면 패키지명을 적을 필요는 없다.
    step15.ex1.other.MyClass2 obj2 = 
        new step15.ex1.other.MyClass2();
  }
}








