package step18.ex9;

public interface A {
  // 인터페이스는 직접 인스턴스를 생성할 수 없기 때문에
  // 인스턴스 변수를 선언할 수 없다.
  // 대신 상수 변수는 선언할 수 있다.
  // 즉 public, static, final 변수를 선언할 수 있다.
  // 단 public static final은 생략 할 수 있다.
  public static final int a = 100;
  
  //public static final을 붙이지 않으면 컴파일러가 자동으로 붙인다.
  /*public static final*/ int b = 200;
}
