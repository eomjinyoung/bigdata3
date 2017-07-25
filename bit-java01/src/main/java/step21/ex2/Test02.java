/* 리플렉션(reflection) API : 클래스의 메서드 정보 알아내기 II
 * 
 */
package step21.ex2;

import java.lang.reflect.Method;

public class Test02 {

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("step21.ex2.Truck");
    
    // 해당 클래스의 모든 메서드 목록 알아내기
    // => 상속 받은 메서드는 제외한다.
    // => 이 클래스에 선언된 메서드만 추출한다.
    // => 모든 접근 범위의 메서드를 추출한다. 즉 private, (default), protected 메서드도 추출한다.
    Method[] methods = clazz.getDeclaredMethods();
    for (Method m : methods) {
      System.out.println(m.getName()); // 메서드 명 출력하기 
    }
  }

}








