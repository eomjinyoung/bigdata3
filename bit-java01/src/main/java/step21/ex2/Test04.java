/* 리플렉션(reflection) API : 파라미터가 있는 메서드를 추출하여 호출하기
 * 
 */
package step21.ex2;

import java.lang.reflect.Method;

public class Test04 {

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("step21.ex2.Truck");
    
    // 파라미터가 있는 메서드 정보를 추출할 때는 메서드 이름 뿐만아니라 파라미터의 타입 정보도 줘야 한다.
    // 주목!
    // => 자바 원시 타입은 클래스가 아니지만, 원시 타입에 대한 정보를 추출할 때 예외적으로
    //    일반 자바 클래스처럼 "class"라는 변수를 사용할 수 있다.
    // => 예를 들면 int.class는 int의 타입을 가리킨다.
    Method method = clazz.getMethod("setCapacity", int.class);
    
    // 호출할 때 파라미터를 넘겨야 하는 메서드 호출하기
    // 먼저 인스턴스 메서드를 호출하려면 인스턴스가 필요하다.
    Object obj = clazz.newInstance();
    
    // invoke()에 인스턴스 주소와 파라미터 값을 주면된다.
    method.invoke(obj, 5);
    
    // 다른 인스턴스 메서드 호출하기 
    method = clazz.getMethod("setFuelType", int.class);
    method.invoke(obj, 1);
    
    // 또 다른 인스턴스 메서드 호출하기
    method = clazz.getMethod("setLiter", int.class);
    method.invoke(obj, 60);
    
    // toString() 메서드 호출하기
    method = clazz.getMethod("toString");
    String str = (String)method.invoke(obj); 
    // 메서드를 호출할 때 파라미터가 없는 메서드는 인스턴스 주소만 주면 된다.
    // 값을 리턴하는 메서드라면 변수로 받으면 된다.
    
    System.out.println(str);
    
    
  }

}








