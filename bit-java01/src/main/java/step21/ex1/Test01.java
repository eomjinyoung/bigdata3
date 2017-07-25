/* 리플렉션(reflection) API : Class 도구 얻기
 * => 리플렉션 API는 자바 클래스, 메서드, 필드 등의 정보를 다루는 도구이다.
 * => Class 라는 도구는 클래스 정보를 다루는 도구이다.
 * 
 */
package step21.ex1;

public class Test01 {

  public static void main(String[] args) throws Exception {
    // 1) Class의 forName() 메서드를 통해 특정 클래스를 다루는 도구를 얻을 수 있다.
    //    => Class.forName("클래스 전체 이름")
    //    => 문자열로 클래스 이름을 지정할 때는 반드시 패키지명을 포함한 전체이름이어야 한다. 
    Class clazz = Class.forName("step21.ex1.Truck");
    
    // 위와 같이 Class 객체가 어떤 클래스를 다룰 것인지 지정하지 않으면,
    // 컴파일러는 "어떤 클래스를 다룰 건데?"하고 궁금해 하며 경고를 띄운다.
    
    Class<?> clazz2 = Class.forName("step21.ex1.Truck");
    // 위와 같이 generic 문법을 사용하여 다이어몬드 연산자 <> 안에 물음표(?)를 지정하면,
    // 임의의 클래스를 다루겠다는 의미다.
    // 즉 컴파일러가 "어떤 클래스를 다룰 건데?" 라고 물으면,
    // "어~ 그냥 아무 클래스나 다룰 거야!" 라고 답변하는 것이다.
    
    
    // 2) 클래스의 스태틱 변수인 "class"를 사용하여 얻을 수 있다.
    Class<?> clazz3 = Truck.class;
    
    // 3) 만약 인스턴스를 알고 있다면, 인스턴를 통해 얻을 수 있다.
    Truck truck = new Truck();
    Class<?> clazz4 = truck.getClass();
    
    // 위 세가지 방법 중에서 Class 도구를 얻는 방법으로 forName()을 가장 많이 사용한다.
    // 이유는?
    // => 클래스명을 문자열로 다룰 수 있기 때문이다.
    // => 즉 문자열로 임의의 클래스명을 받아서 언제든지 그 도구를 얻을 수 있다.
    // => 나머지 두 개의 방법은 코드 상에 정확하게 클래스를 명시하기 때문에 
    //    다른 클래스를 로딩할 수 없다.
    
    // forName()이 편하다는 것을 바로 증명!
    String[] classNames = 
      {"step21.ex1.Engine", "step21.ex1.Truck", "step21.ex1.Test01"};
    
    // 이렇게 클래스 이름을 알고 있다면 문자열로 클래스 이름을 입력 받아
    // 그 클래스를 다루는 도구를 얻을 수 있다.
    Class<?> clazz5 = Class.forName(classNames[0]);
    Class<?> clazz6 = Class.forName(classNames[1]);
    Class<?> clazz7 = Class.forName(classNames[2]);
    
  }

}








