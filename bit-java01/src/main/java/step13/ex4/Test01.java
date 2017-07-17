package step13.ex4;

public class Test01 {

  public static void main(String[] args) {
    Score score = new Score("홍길동", 97, 88, 100);
    
    System.out.println(score.getSum());
    System.out.println(score.getAver());
    
    // 그 클래스의 내부에서만 사용하는 메서드는 
    // 다른 클래스가 사용할 수 없게 하는게 유지보수에 좋다!
    //score.compute();
    
    System.out.println("--------------------");
    
    score.setKor(80);
    System.out.println(score.getSum());
    System.out.println(score.getAver());

  }

}
