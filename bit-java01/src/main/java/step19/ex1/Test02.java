package step19.ex1;

public class Test02 {

  public static void main(String[] args) {
    // 배 상자 준비
    PearBox pearBox = new PearBox();
    
    // 배를 담는다.
    pearBox.add(new Pear("성주", 220));
    pearBox.add(new Pear("성주", 280));
    pearBox.add(new Pear("성주", 210));
    pearBox.add(new Pear("나주", 220));
    pearBox.add(new Pear("나주", 200));
    
    // 배 목록을 가져와서
    Pear[] pearList = pearBox.toArray();
    
    // 출력한다.
    for (Pear pear : pearList) {
      System.out.println(pear);
    }
    
    

  }

}
