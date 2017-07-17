package step13.ex2;

public class Test01 {

  public static void main(String[] args) {
    // 1) 환자 정보를 담을 메모리 준비
    Patient p = new Patient();
    
    // 2) 환자 정보를 저장
    p.name = "홍길동";
    p.age = 200;
    p.weight = 300;
    p.height = 500;
    p.gender = false;
    
    /* 나이나 몸무게, 키 값이 환자에 대한 유효한 값이 아니다.
     * 분명히 Patient는 환자 데이터를 저장하기 위해 새로 정의한 데이터 타입이다.
     * 그런데 환자 데이터로서 유효하지 않은 값을 저장하였다.
     * 이렇게 클래스를 만들 때의 원래 취지와 다른 값을 넣게 되면
     * 클래스를 정의(추상화; abstraction)한 목적을 무너뜨리게 된다.
     * 한 마디로 표현하면, "추상화를 무너뜨리게 된다".
     * 
     * 이런 추상화를 무너뜨리는 것을 막기 위한 문법이 "캡슐화(encapsulation)"이다.
     * 
     * 추상화(abstraction)?
     * => 어떤 실세계의 사람, 사물, 역할 및 기능을 데이터나 메서드로 표현하는 것.
     */
    

  }

}
