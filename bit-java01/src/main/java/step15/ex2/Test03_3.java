/* static nested class 응용 II - import 하기
 * => 패키지 멤버 클래스처럼 static nested class도 import 할 수 있다.
 */
package step15.ex2;

// static nested class를 다음과 같이 import 할 수 있다.
import step15.ex2.other.Camp.ClassRoom;
import step15.ex2.other.Camp.Location;

public class Test03_3 {
  public static void main(String[] args) {
    // static nested class를 사용할 때 import 하는 방법!
    Location loc1 = new Location("강남교육센터", "111-1111");
    Location loc2 = new Location("부산교육센터", "111-1112");
    Location loc3 = new Location("대전교육센터", "111-1113");
    
    ClassRoom room1 = new ClassRoom("701", 30);
    ClassRoom room2 = new ClassRoom("702", 35);
    ClassRoom room3 = new ClassRoom("601", 25);
  }
}
