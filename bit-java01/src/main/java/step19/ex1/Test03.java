/* 제네릭(generic) 문법 사용 전 
 * => Apple, Pear, Grape 과일 마다 그 과일을 담을 상자 클래스를 정의하였다.
 *    비록 상자 클래스의 이름이 다르더라도 그 내부의 코드는 거의 같다. 
 *    즉 계속 중복된 코드를 작성하는 문제가 있다.
 * => 해결 방안? 
 *    다음 패키지에 ...
 */
package step19.ex1;

public class Test03 {

  public static void main(String[] args) {
    // 포도 상자 준비
    GrapeBox grapeBox = new GrapeBox();
    
    // 포도를 담는다.
    grapeBox.add(new Grape("머루", 800));
    grapeBox.add(new Grape("머루", 1500));
    grapeBox.add(new Grape("머루", 2000));
    grapeBox.add(new Grape("켐벨", 3000));
    grapeBox.add(new Grape("켐벨", 3000));
    
    // 포도 목록을 가져와서
    Grape[] grapeList = grapeBox.toArray();
    
    // 출력한다.
    for (Grape grape : grapeList) {
      System.out.println(grape);
    }
    
    

  }

}
