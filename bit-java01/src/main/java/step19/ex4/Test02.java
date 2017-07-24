/* 제네릭(generic) 문법 사용 후
 * => 상자를 만들 때 어떤 타입의 값을 저장하고 꺼낼 지 알려준다.
 *    그런 후 상자를 사용하면 그 타입에 딱 맞춰서 사용할 수 있다.
 * => 특징
 *    - 상자를 만들 때 선언한 타입과 다른 값을 주면 컴파일 오류가 발생한다.
 *      즉 정확한 용도대로 상자를 사용할 수 있다.
 *    - 상자를 만들 때 선언한 타입에 맞춰서 메서드의 파라미터 값과 리턴 값이 자동으로 결정되기 때문에
 *      따로 형변환할 필요가 없다. 
 */
pack
package step19.ex4;

public class Test02 {

  public static void main(String[] args) {
    // 키보드를  담을 상자 준비
    // => ObjectBox는 키보드도 담을 수 있다.
    //    왜? 파라미터 타입이나 리턴 타입이 Object이기 때문이다.
    //    자바의 모든 클래스는 Object의 자손이다.
    Box objectBox = new Box();
    
    // 키보드를 담는다.
    objectBox.add(new Keyboard(61, "기계식"));
    objectBox.add(new Keyboard(61, "기계식"));
    objectBox.add(new Keyboard(87, "기계식"));
    objectBox.add(new Keyboard(87, "기계식"));
    objectBox.add(new Keyboard(104, "멤브레인"));
    
    // 키보드를 가져와서
    Object[] objectList = objectBox.toArray();
    
    // 키보드의 유형만 출력한다.
    for (Object object : objectList) {
      // objectList 배열에는 실제 Keyboard 객체의 주소들이 들어 있다.
      // 비록 objectList에서 꺼낸 object 변수의 값이 Keyboard 객체의 주소일지라도 
      // 다음과 같이 Keyboard 객체의 type 변수에 접근할 수 없다.
      // 왜? 문법적으로는 object 변수의 타입은 Object이기 때문이다.
      // 즉 Object 클래스에는 type라는 변수가 없다. 그래서 컴파일 오류가 발생한다.
      
      //System.out.println(object.type); // 컴파일 오류!
      
      // 제대로 사용하고 싶다면 원래 값의 타입으로 형변환 해야 한다.
      Keyboard keyboard = (Keyboard) object;
      System.out.println(keyboard.type); 
    }
  }
}







