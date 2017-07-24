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

public class Test01 {

  public static void main(String[] args) {
    
    // 상자에 어떤 타입의 값을 담을 것인지 지정한다.
    // 문법
    // => 클래스명<타입,타입,...> 변수 = new 클래스명<타입,타입,...>();
    // => 클래스명<타입,타입,...> 변수 = new 클래스명<생략가능>();
    Box<Apple> objectBox = new Box<>();
    
    // 사과를 담는다.
    objectBox.add(new Apple("red", 120));
    objectBox.add(new Apple("red", 180));
    objectBox.add(new Apple("green", 110));
    objectBox.add(new Apple("green", 120));
    objectBox.add(new Apple("yelllow", 200));
    
    // 상자를 만들 때 사과를 담겠다고 선언했기 때문에 다른 타입의 값을 담을 수 없다.
    // 실행하기 전에 컴파일러에서 엄격하게 검사해 주기 때문에 
    // 개발자가 상자를 잘못 사용하는 실수를 미연에 방지해준다.
    
    //objectBox.add(new Pear("성주", 300)); // 컴파일 오류!
    
    // 사과를 가져와서
    // => 배열을 꺼낼 때도 상자를 만들 때 지정한 타입의 배열을 리턴한다.
    // => 개발자가 따로 형변환해야 하는 번거로움을 없애준다.
    // => 다만 배열을 리턴 받을 때 어떤 타입의 배열을 리턴 받을 것인지 파라미터로 알려준다.
    // => 자바의 모든 클래스에는 static 변수 "class"가 있다.
    //    이 변수에 해당 클래스의 타입 정보가 들어 있다. 
    //    조심하라! 자바 코드에서 문자열이 아닌 그냥 
    //           클래스명.class 
    //    라고 코드를 작성한다면
    //    ".class"는 파일 확장자가 아니라 그 클래스의 static 변수 "class"를 의미한다.
    Apple[] objectList = objectBox.toArray(Apple.class);
    
    // 사과의 색상만 출력한다.
    // => 당연히 상자에서 사과를 담는 배열을 받았기 때문에 그대로 사과 변수로 객체를 받으면 된다. 
    for (Apple apple : objectList) {
      // 형변환 할 필요가 없이 바로 사용할 수 있다.
      System.out.println(apple.color); 
    }
    

  }

}







