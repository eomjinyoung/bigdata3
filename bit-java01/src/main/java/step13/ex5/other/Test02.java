package step13.ex5.other;

public class Test02 {

  public static void main(String[] args) {
    // MyClass는 같은 패키지이기 때문에 패키지명을 지정하지 않아도 된다.
    MyClass obj = new MyClass();
    
    // MyClass2는 공개되지 않았지만 같은 패키지에 소속된 클래스는 사용할 수 있다.
    MyClass2 obj2 = new MyClass2(); //OK!

  }

}
