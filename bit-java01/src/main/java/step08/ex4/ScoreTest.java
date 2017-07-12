/* 4단계: 인스턴스 메서드를 사용하여 인스턴스 변수 다루기
 */
package step08.ex4;

public class ScoreTest {
  
  public static void main(String[] args) {
    Score s1 = new Score();
    Score s2 = new Score();
    Score s3 = new Score();
    
    // 인스턴스 메서드를 호출할 때는 
    // 메서드 호출 앞 부분에 클래스명 대신으로 인스턴스 주소를 지정한다.
    // 메서드 앞에 지정한 인스턴스 변수의 주소 값은 
    // 호출하는 메서드의 내장 변수 this에 저장된다. 
    s1.init("홍길동", 100, 90, 80);
    s2.init("임꺽정", 80, 70, 60);
    s3.init("유관순", 70, 50, 40);
    
    s1.compute();
    s2.compute();
    s3.compute();
    
    s1.print();
    s2.print();
    s3.print();
    
  }

}





