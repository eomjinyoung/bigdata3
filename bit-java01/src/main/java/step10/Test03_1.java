/* 인스턴스 변수와 클래스 변수 
 * => 클래스 변수는 한 개만 생성된다.
 * => 인스턴스 변수는 new 명령을 실행할 때마다 생성된다.
 * => 그래서 클래스 변수는 모든 인스턴스가 공유하는 값을 저장하는 용도.
 *    그래스 인스턴스 변수는 개별적으로 구분해서 저장할 값.
 */
package step10;

class Student1 {
  // 클래스 변수: Method Area, 딱 한 개, 모든 인스턴스가 공유.
  static int count;
  
  // 인스턴스 변수: Heap, new 명령마다 생성, 개별적으로 구분할 값.
  String name;
  int age;
  
  Student1(String name, int age) {
    this.name = name;
    this.age = age;
    Student1.count++; // 로컬 변수 중에 count와 이름이 같은 변수가 없다면, 클래스명을 생략해도 된다.
  }
}

public class Test03_1 {
  public static void main(String[] args) {
    Student1 obj1 = new Student1("홍길동", 20);
    Student1 obj2 = new Student1("임꺽정", 30);
    Student1 obj3 = new Student1("유관순", 16);
    
    System.out.printf("학생수: %d\n", Student1.count);
    System.out.printf("%s, %d\n", obj1.name, obj1.age);
    System.out.printf("%s, %d\n", obj2.name, obj2.age);
    System.out.printf("%s, %d\n", obj3.name, obj3.age);
  }
}










