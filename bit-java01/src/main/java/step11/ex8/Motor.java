/* 상속의 구현 방식
 * => 용어
 *    1) "수퍼(super) 클래스" 또는 "부모(parent) 클래스"
 *       - 상속을 해주는 클래스
 *    2) "서브(sub) 클래스" 또는 "자식(child) 클래스"
 *       - 기존 코드를 상속 받는 클래스
 * => 주의
 *    상속이라는 말 때문에 초보 개발자들이 많은 오해를 한다.
 *    즉 기존 클래스의 코드를 그대로 물려 받는다고 생각을 한다.
 *    실제는 그렇지 않다.
 *    
 * => 실제
 *    수퍼 클래스의 모든 코드를 그대로 가져오는 것이 아니라,
 *    상속 받는 클래스(서브 클래스/자식 클래스)는 단지 상속 해주는 클래스(수퍼 클래스/부모 클래스)와의
 *    연결 정보를 갖는다.
 *    그래서 서브 클래스를 사용하려면 서브 클래스와 연결된 수퍼 클래스가 반드시 있어야 한다.
 *    
 * => 수퍼 클래스로부터 코드를 완전히 받았다면, 실행할 때 수퍼 클래스가 필요 없을 것 아닌가!
 *    하지만 코드를 받지 않았기 때문에 실행할 때 반드시 수퍼 클래스가 있어야 한다.
 *    
 *    
 *    
 */
package step11.ex8;
 
// 부모(수퍼) 클래스: Vehicle
// 자식(서브) 클래스: Motor
//
// 상속의 이점!
// - 다음과 같이 기존 코드를 재 작성할 필요가 없다.
public class Motor extends Vehicle {
  int fuelType; //0=무연료, 1=휘발유, 2=경유
}








