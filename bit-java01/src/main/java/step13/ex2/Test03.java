/* 캡슐화 적용 후 - 예외처리 살짝 맛보기 
 * => 메서드를 잘못 사용할 때 알려주는 방법!
 */
package step13.ex2;

public class Test03 {

  public static void main(String[] args) {
    Patient3 p = new Patient3();
    
    // Patient2에서는 무효한 값을 저장하더라도 개발자에게 알려주지 않는다.
    // 그래서 환자 데이터를 출력하면, 나이와 키 값이 0으로 출력된다.
    // 어떤 상황에서는 제대로 값을 설정하지 않으면 실행할 때 호출자에게 알려줘야 한다.
    // 이런 상황을 위해 만든 문법이 "예외처리(exception)"이다.
    p.setName("홍길동"); // OK!
    p.setAge(200); // 유효 범위의 값이 아니라면?
                   // 메서드의 알림 내용을 출력하고 즉시 실행을 멈춘다!
    p.setWeight(300); // OK!
    p.setHeight(500); // 유효 범위의 값이 아니라면?
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






