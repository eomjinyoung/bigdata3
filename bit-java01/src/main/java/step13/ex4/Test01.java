/* 캡슐화 적용
 * => 변수 뿐만 아니라 메서드에 대해서도 private을 사용한다는 것을 잊지말라!
 * => 변수이든 메서드이든 공개를 최소화시키는 게 유지보수에 좋다.
 *    즉 클래스를 목적에 따라 제대로 사용하지 못하고 잘못 사용하는 것을 막을 수 있다. 
 */
package step13.ex4;

public class Test01 {

  public static void main(String[] args) {
    Score score = new Score("홍길동", 97, 88, 100);
    
    System.out.println(score.getSum());
    System.out.println(score.getAver());
    
    // 그 클래스의 내부에서만 사용하는 메서드는 
    // 다른 클래스가 사용할 수 없게 하는게 유지보수에 좋다!
    //score.compute();
    
    System.out.println("--------------------");
    
    score.setKor(80);
    
    System.out.println(score.getSum());
    System.out.println(score.getAver());

  }

}
