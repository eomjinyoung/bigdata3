/* 캡슐화 적용 후 - 예외처리 살짝 맛보기 II
 * => 메서드 호출했는데 잘못 사용했다고 알림을 받게 된다면,
 *    그 알림에 대해 교정 작업을 수행할 수 있다. 
 * 
 */
package step13.ex2;

public class Test04 {

  public static void main(String[] args) {
    Patient3 p = new Patient3();
    
    // 메서드의 잘못된 사용에 대해 알림을 받을 수 있고, 
    // 교정 작업을 수행할 수도 있다.
    p.setName("홍길동"); // OK!
    try {
      p.setAge(200);
    } catch (RuntimeException e) { // 메서드를 잘못 사용했다고 알림을 받는다면, 
      p.setAge(30); // 기본 값으로 교정한다.
    }
    try {
      p.setWeight(300);
    } catch (RuntimeException e) {// 메서드를 잘못 사용했다고 알림을 받는다면, 
      p.setWeight(70);// 기본 값으로 교정한다.
    }
    try {
      p.setHeight(500);
    } catch (RuntimeException e) {// 메서드를 잘못 사용했다고 알림을 받는다면, 
      p.setHeight(170);// 기본 값으로 교정한다.
    }
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






