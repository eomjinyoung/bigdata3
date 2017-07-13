/* 인스턴스 메서드
 * => 인스턴스의 변수를 다루는 메서드이다.
 * => 반드시 유효한 인스턴스의 주소로 호출해야 한다.
 * => 인스턴스 메서드가 호출될 때, 
 *    내장 변수 this에 인스턴스 주소가 저장된다. 
 */
package step10;

class Student4 {
  static int count;
  
  String name;
  int age;
  
  void setNameAndAge(String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  String getName() {
    return name; // 인스턴스 변수의 이름과 같은 이름을 가진 로컬 변수가 없다면, this를 생략해도 된다.
  }
  
  int getAge() {
    return age; // this를 생략하면 컴파일 할 때 자동으로 붙는다.
  }
}

public class Test04_1 {
  public static void main(String[] args) {
    Student4 obj = new Student4();
    obj.setNameAndAge("홍길동", 20); 
    // obj에 들어 있는 인스턴스 주소가 setNameAndAge() 메서드에 전달되고,
    // 그 주소는 setNameAndAge()의 내장 변수 this에 보관된다.
    // 따라서 인스턴스 메서드를 호출할 때 어떤 인스턴스 주소를 주느냐에 따라
    // this 변수의 값이 바뀐다.
    
    obj = new Student4();
    obj.setNameAndAge("임꺽정", 30);
    
    
  }
}










