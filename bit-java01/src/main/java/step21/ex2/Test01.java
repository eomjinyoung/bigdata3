/* 리플렉션(reflection) API : 클래스의 메서드 정보 알아내기
 * 
 */
package step21.ex2;

import java.lang.reflect.Method;

public class Test01 {

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("step21.ex2.Truck");
    
    // 클래스의 모든 메서드 목록 알아내기
    // => 상속 받은 메서드까지 알아내기
    // => 단 public 메서드만 추출한다.
    Method[] methods = clazz.getMethods();
    for (Method m : methods) {
      System.out.println(m.getName()); // 메서드 명 출력하기 
    }
  }

}








