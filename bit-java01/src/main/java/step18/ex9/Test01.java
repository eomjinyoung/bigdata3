package step18.ex9;

public class Test01 {

  public static void main(String[] args) {
    // 인터페이스의 상수 변수 사용하기
    System.out.println(A.a);
    System.out.println(A.b);
    
    // 인터페이스의 변수는 상수이기 때문에 값을 변경할 수 없다.
    //A.a = 200; // 컴파일 오류!
    //A.b = 300; // 컴파일 오류!
  }

}
