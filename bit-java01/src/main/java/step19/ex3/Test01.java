/* 제네릭(generic) 문법 사용 전 
 * => Apple, Pear, Grape, Keyboard 까지 모두 담을 수 있는 상자를 만들기 위해
 *    Object 타입을 사용하였다.
 *    ObjectBox는 자바의 모든 객체를 담을 수 있다.
 *    왜? 자바의 모든 클래스는 Object의 서브 클래스이기 때문이다.
 * 
 * => 단점!
 *    - 상자에서 값을 꺼내 원래대로 사용하려면 형변환(타입캐스팅)을 수행해야 한다.
 */
package step19.ex3;

public class Test01 {

  public static void main(String[] args) {
    // 사과를 담을 상자 준비
    ObjectBox objectBox = new ObjectBox();
    
    // 사과를 담는다.
    objectBox.add(new Apple("red", 120));
    objectBox.add(new Apple("red", 180));
    objectBox.add(new Apple("green", 110));
    objectBox.add(new Apple("green", 120));
    objectBox.add(new Apple("yelllow", 200));
    
    // 사과를 가져와서
    Object[] objectList = objectBox.toArray();
    
    // 사과의 색상만 출력한다.
    for (Object object : objectList) {
      // objectList 배열에는 실제 Apple 객체의 주소들이 들어 있다.
      // 비록 objectList에서 꺼낸 object 변수의 값이 Apple 객체의 주소일지라도 
      // 다음과 같이 Apple 객체의 color 변수에 접근할 수 없다.
      // 왜? 문법적으로는 object 변수의 타입은 Object이기 때문이다.
      // 즉 Object 클래스에는 color라는 변수가 없다. 그래서 컴파일 오류가 발생한다.
      
      //System.out.println(object.color); // 컴파일 오류!
      
      // 제대로 사용하고 싶다면 원래 값의 타입으로 형변환 해야 한다.
      Apple apple = (Apple) object;
      System.out.println(apple.color); 
    }
    

  }

}







