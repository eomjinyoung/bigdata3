/* 제네릭(generic) 문법 사용 전 
 * => Apple, Pear, Grape 과일 마다 그 과일을 담을 상자 클래스를 정의하였다.
 *    비록 상자 클래스의 이름이 다르더라도 그 내부의 코드는 거의 같다. 
 *    즉 계속 중복된 코드를 작성하는 문제가 있다.
 * => 해결 방안? 
 *    다음 패키지에 ...
 */
package step19.ex2;

public class Test02 {

  public static void main(String[] args) {
    // 배 상자 준비
    PearBox pearBox = new PearBox();
    
    // 배를 담는다.
    pearBox.add(new Pear("성주", 220));
    pearBox.add(new Pear("성주", 280));
    pearBox.add(new Pear("성주", 210));
    pearBox.add(new Pear("나주", 220));
    pearBox.add(new Pear("나주", 200));
    
    // 배 목록을 가져와서
    Pear[] pearList = pearBox.toArray();
    
    // 출력한다.
    for (Pear pear : pearList) {
      System.out.println(pear);
    }
    
    

  }

}
