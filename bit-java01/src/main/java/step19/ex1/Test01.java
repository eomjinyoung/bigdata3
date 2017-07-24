package step19.ex1;

public class Test01 {

  public static void main(String[] args) {
    // 사과 상자 준비
    AppleBox appleBox = new AppleBox();
    
    // 사과를 담는다.
    appleBox.add(new Apple("red", 120));
    appleBox.add(new Apple("red", 180));
    appleBox.add(new Apple("green", 110));
    appleBox.add(new Apple("green", 120));
    appleBox.add(new Apple("yelllow", 200));
    
    // 사과 목록을 가져와서
    Apple[] appleList = appleBox.toArray();
    
    // 출력한다.
    for (Apple apple : appleList) {
      System.out.println(apple);
    }
    
    

  }

}
