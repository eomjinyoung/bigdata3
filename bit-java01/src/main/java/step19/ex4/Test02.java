/* 제네릭(generic) 문법 사용 후
 * => 상자를 만들 때 어떤 타입의 값을 저장하고 꺼낼 지 알려준다.
 *    그런 후 상자를 사용하면 그 타입에 딱 맞춰서 사용할 수 있다.
 * => 특징
 *    - 상자를 만들 때 선언한 타입과 다른 값을 주면 컴파일 오류가 발생한다.
 *      즉 정확한 용도대로 상자를 사용할 수 있다.
 *    - 상자를 만들 때 선언한 타입에 맞춰서 메서드의 파라미터 값과 리턴 값이 자동으로 결정되기 때문에
 *      따로 형변환할 필요가 없다. 
 */

package step19.ex4;

public class Test02 {

  public static void main(String[] args) {
    Box<Keyboard> objectBox = new Box<>();
    
    // 키보드를 담는다.
    objectBox.add(new Keyboard(61, "기계식"));
    objectBox.add(new Keyboard(61, "기계식"));
    objectBox.add(new Keyboard(87, "기계식"));
    objectBox.add(new Keyboard(87, "기계식"));
    objectBox.add(new Keyboard(104, "멤브레인"));
    
    // Keyboard 외에 다른 타입의 레퍼런스를 담을 수 없다. 
    //objectBox.add(new Apple("red", 200)); // 컴파일 오류!
    
    // 키보드를 가져와서
    Keyboard[] objectList = objectBox.toArray(Keyboard.class);
    
    // 키보드의 유형만 출력한다.
    for (Keyboard keyboard : objectList) {
      System.out.println(keyboard.type); // 따로 배열의 항목을 형변환 할 필요가 없다. 
    }
    
    /* 이렇게 제네릭이라는 문법은 
     * 한 클래스를 만들어 다양한 타입에 대응하여 사용할 수 있도록 만든다.
     * 각각의 타입에 따라 여러 클래스를 만들어야 하는 번거로움을 덜 수 있다.
     */
  }
}







