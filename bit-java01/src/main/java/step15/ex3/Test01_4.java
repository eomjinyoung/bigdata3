/* non-staic nested class : 인스턴스 만들기 III
 * => inner 클래스에서 바깥 클래스의 인스턴스 변수를 사용하기
 *     
 *  
 */
package step15.ex3;

import step15.ex3.other.Location;

public class Test01_4 {
  
  public static void main(String[] args) {
    Location loc1 = new Location("강남교육센터", "1111-1111");
    loc1.addRoom("301", 30);
    loc1.addRoom("302", 30);
    loc1.addRoom("401", 35);
    loc1.addRoom("402", 35);
    
    Location loc2 = new Location("부산교육센터", "1111-2222");
    loc2.addRoom("401", 25);
    loc2.addRoom("402", 25);
    loc2.addRoom("403", 25);
    loc2.addRoom("701", 25);
    loc2.addRoom("702", 25);

    
    loc1.print();
    System.out.println("-------------------");
    
    loc2.print();
  }
}











