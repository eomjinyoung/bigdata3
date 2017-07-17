package step13.ex3.other;

public class MyChild extends step13.ex3.MyClass {
  void m1() {
    // MyClass의 설계도에 따라 만든 인스턴스 변수를 자식 클래스의 멤버로 접근해보기
    
    // private: 자식 클래스에서 접근 불가!
    //this.v1 = 100;
    
    // (default): 같은 패키지가 아니라서 접근 불가!
    //this.v2 = 200;
    
    // protected: 비록 패키지는 다르지만 자식 클래스이기 때문에 접근 가능!
    this.v3 = 300;
    
    // public: 모두 접근 가능!
    this.v4 = 400;
    
  }
  
  void m2() {
    step13.ex3.MyClass obj = new step13.ex3.MyClass();
    
    // private: 같은 클래스의 멤버만 가능
    //obj.v1 = 100;
    
    // (default): 같은 패키지만 가능
    //obj.v2 = 200;
    
    // protected: 다른 패키지더라도 자식 클래스는 가능하지만, 같은 클래스여야 한다.
    //obj.v3 = 300; // obj는 MyClass이고, 현재 메서드는 MyChild이다.
    
    // public: 모두 가능
    obj.v4 = 400;
  }
  
  void m3() {
    //this.v1 = 100;
    //this.v2 = 200;
    this.v3 = 300;
    this.v4 = 400;
    
    step13.ex3.other.MyChild obj = new step13.ex3.other.MyChild();
    //obj.v1 = 100;
    //obj.v2 = 200;
    obj.v3 = 300;
    obj.v4 = 400;
    
    
  }
  
  
  
  
}







