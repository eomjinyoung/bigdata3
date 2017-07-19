package step16;

import step16.other.MyClass;
import step16.other.MyClass2;

public class Test01 {

  public static void main(String[] args) {
    // 다형적 변수의 특징에 따르면,
    // 레퍼런스는 그 자신 또는 서브 클래스의 객체 주소를 저장할 수 있다.
    MyClass obj = new MyClass();
    
    // 따라서 obj에 저장된 MyClass 대신 그 서브 객체로 대체할 수 있다.
    obj = new MySub();
    
    // final 클래스의 레퍼런스는 그 자식들로 대체할 수 없다.
    // 왜? MyClass2의 자식 클래스를 만들 수 없기 때문이다.
    // 의미!
    // => 보안을 위해 다른 자식 객체로 대체할 수 없도록 만드는 문법이 
    //    클래스 앞에 final을 붙이는 것이다.
    // => 자식 클래스를 만들 수 있다면 부모 클래스의 기능을 재정의할 수 있다.
    //    즉 부모 클래스의 기능을 재정의 한다는 것은 원래 기능을 변형시킬 수 있음을 의미한다.
    //    원래의 의도와 다르게 동작시킬 수 있다는 뜻이다.
    // => 따라서 클래스를 상속 받지 못하게 하는 것은
    //    클래스의 원래 제작자 의도대로 사용하도록 강제시키고자 하는 것이다.
    MyClass2 obj2 = new MyClass2();
    
    
    

  }

}








