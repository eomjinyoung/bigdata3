package step15.ex5;

public class Test05_1 {
  public static void main(String[] args) {
    class MyClass extends Object {
      String name;
      void m() {
        System.out.println("Hello!");
      }
    }
    
    MyClass obj = new MyClass();
    obj.m();
  }
}
