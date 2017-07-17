/* 캡슐화 적용 후
 * => 클래스를 정의한 원래 목적과 다른 값이 저장되지 않도록
 *    인스턴스 변수에 직접 접근하는 것을 막는다.
 * => 메서드를 통해 값을 넣는데, 유효한 값만 설정되게 한다.
 */
package step13.ex2;

public class Test02 {

  public static void main(String[] args) {
    Patient2 p = new Patient2();
    
    // 인스턴스 변수에 직접 접근할 수 없다. 
    /*
    p.name = "홍길동";
    p.age = 200;
    p.weight = 300;
    p.height = 500;
    p.gender = false;
    */
    
    // 대신 메서드를 통해 값을 설정해야 한다.
    // => 직접 인스턴스 변수에 접근하지 않고, 메서드를 통해서 값을 설정한다면
    //    무효한 값을 인스턴스 변수에 저장되지 않을 것이다.
    // => 무효한 값이 인스턴스 변수에 저장되지 않으므로, 추상화도 무너지지 않는다.
    p.setName("홍길동"); // OK!
    p.setAge(200); // 유효 범위의 값이 아니기 때문에 200 이라는 값이 저장되지 않을 것이다.
    p.setWeight(300); // OK!
    p.setHeight(500); // 유효 범위의 값이 아니기 때문에 500 이라는 값이 저장되지 않을 것이다.
    p.setWoman(false); // OK!
    
    // 인스턴스 변수에 직접 접근할 수 없기 때문에,
    // 값을 꺼내주는 메서드를 호출해야 한다.
    System.out.println(p.getName());
    System.out.println(p.getAge());
    System.out.println(p.getWeight());
    System.out.println(p.getHeight());
    System.out.println(p.isWoman());

  }

}






