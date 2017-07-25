/* 리플렉션(reflection) API : 메서드 추출과 호출
 * 
 */
package step21.ex2;

import java.lang.reflect.Method;

public class Test03 {

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("step21.ex2.Truck");
    
    // 특정 메서드만 추출할 수 있다.
    Method method = clazz.getMethod("run");
    
    // 추출한 메서드 정보를 가지고 호출하기
    // => 만약 추출한 메서드가 인스턴스 메서드라면 인스턴스 주소를 줘야지만 호출할 수 있다.
    Object obj = clazz.newInstance(); // 해당 클래스의 인스턴스를 만든 다음에
                                      // 그 인스턴스 주소를 사용하여 메서드를 호출해 보자!
    method.invoke(obj); // run() 메서드 호출하기
                        // 이 메서드는 인스턴스 메서드이기 때문에
                        // 호출할 때 invoke()의 파라미터로 인스턴스 주소를 줘야 한다.
    
    // 이렇게 메서드 정보를 통해 간접적으로 메서드를 호출할 수 있다.
  }

}








