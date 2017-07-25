/* 리플렉션(reflection) API : Class 도구를 이용하여 객체 생성하기
 * 
 */
package step21.ex1;

public class Test02 {

  public static void main(String[] args) throws Exception {
    Class<?> clazz = Class.forName("step21.ex1.Truck");
    
    // 클래스 도구(Class 객체)를 사용하여 인스턴스를 생성할 수 있다.
    Truck obj = (Truck)clazz.newInstance();
    
    System.out.println(obj);
    
  }

}








