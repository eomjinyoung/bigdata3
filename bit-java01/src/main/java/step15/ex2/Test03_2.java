/* static nested class 응용 II - 패키지 대신 클래스 안에 두기
 * => 클래스가 작은 경우 패키지 멤버로 만들기 보다 
 *    다른 클래스에 내장하는 것이 
 *    소스 코드 관리에 편리할 경우가 있다.
 * 
 */
package step15.ex2;

import step15.ex2.other.Camp;

public class Test03_2 {
  public static void main(String[] args) {
    // static nested class를 사용한 예:
    Camp.Location loc1 = new Camp.Location("강남교육센터", "111-1111");
    Camp.Location loc2 = new Camp.Location("부산교육센터", "111-1112");
    Camp.Location loc3 = new Camp.Location("대전교육센터", "111-1113");
    
    Camp.ClassRoom room1 = new Camp.ClassRoom("701", 30);
    Camp.ClassRoom room2 = new Camp.ClassRoom("702", 35);
    Camp.ClassRoom room3 = new Camp.ClassRoom("601", 25);
  }
}
