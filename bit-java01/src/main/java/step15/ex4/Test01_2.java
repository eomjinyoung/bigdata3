/* local class - 인스턴스 생성
 *     
 */
package step15.ex4;

public class Test01_2 {
  public static void main(String[] args) {
    // local class 
    class Location {
      String name;
      String tel;
      public Location(String name, String tel) {
        super();
        this.name = name;
        this.tel = tel;
      }
    }
    
    // 로컬 클래스는 그 클래스가 선언된 메서드에서만 사용 가능하다.
    Location loc = new Location("강남교육센터", "1111-1111");
  }
  
  static void m() {
    // 다른 메서드에서 정의한 로컬 클래스를 사용할 수 없다.
    //Location loc = new Location("강남교육센터", "1111-1111"); // 컴파일 오류!
  }
}





