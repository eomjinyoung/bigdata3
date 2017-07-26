/* 예외 처리 문법: try-with-resources 사용법 II
 * => 문법
 *    try (java.lang.AutoCloseable 객체 준비) {
 *      ...
 *    } catch (...) {...}
 *    } finally {...}
 *    
 */
package step22.ex5;

public class Test06_4 {
  
  // AutoCloseable 인터페이스를 구현한 클래스는
  // try-with-resources 문법에서 사용될 수 있다.
  static class MyClass implements AutoCloseable {
    public MyClass() throws Exception {
      System.out.println("MyClass() 생성자 호출됨.");
    }
    
    public void test(int value) throws Exception {
      if (value < 0) 
        throw new Exception("음수입니다.");
      
      System.out.println("MyClass의 test() 호출됨");
    }
    
    // 다음 메서드는 AutoCloseable 인터페이스에 선언된 메서드이다.
    public void close() throws Exception {
      System.out.println("MyClass의 자원을 해제합니다.");
    }
  }
  
  public static void main(String[] args) {
    
    try ( // 이곳에는 java.lang.AutoCloseable 인터페이스를 구현한 객체만 둘 수 있다.
        MyClass obj = new MyClass();
    ) {
      obj.test(-10);
      
      // try 블록을 벗어나기 전에 obj에 대해 close()가 자동 호출 될 것이다.
    } catch (Exception e) {
      System.out.println("예외가 발생하였습니다.");
      
    }
  
  }
  
  // try-with-resources 문법 사용 전!
  public static void main0(String[] args) {
    MyClass obj = null;
    
    try {
      obj = new MyClass();
      obj.test(-10);
      
    } catch (Exception e) {
      System.out.println("예외가 발생하였습니다.");
      
    } finally {
      try {obj.close();} catch (Exception e) {/*자원 해제 중에 발생된 예외는 따로 처리하지 않는다.*/}
    }
  
  }

}










