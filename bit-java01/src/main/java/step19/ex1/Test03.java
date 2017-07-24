package step19.ex1;

public class Test03 {

  public static void main(String[] args) {
    // 포도 상자 준비
    GrapeBox grapeBox = new GrapeBox();
    
    // 포도를 담는다.
    grapeBox.add(new Grape("머루", 800));
    grapeBox.add(new Grape("머루", 1500));
    grapeBox.add(new Grape("머루", 2000));
    grapeBox.add(new Grape("켐벨", 3000));
    grapeBox.add(new Grape("켐벨", 3000));
    
    // 포도 목록을 가져와서
    Grape[] grapeList = grapeBox.toArray();
    
    // 출력한다.
    for (Grape grape : grapeList) {
      System.out.println(grape);
    }
    
    

  }

}
