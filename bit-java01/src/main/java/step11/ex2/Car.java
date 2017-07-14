package step11.ex2;

// Car 는 Motor에 있는 설계도를 바탕으로 liter 변수를 추가하였다.
// Car 클래스에는 Motor 클래스에 대한 연결 정보가 있다.
// Car 클래스가 Motor 클래스의 전체 코드를 가지고 있는 것이 아니다!
// 그래서 Car 클래스를 사용하려면 Motor 클래스도 있어야 한다.
// 또한 Motor 클래스를 사용하려면 Vehicle 클래스도 있어야 한다.
public class Car extends Motor {
  int liter; // 연료 탱크 크기
}
