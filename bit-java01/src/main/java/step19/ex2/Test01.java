/* 제네릭(generic) 문법 사용 전 
 * => Apple, Pear, Grape 과일 마다 그 과일을 담을 상자 클래스를 
 *    따로 정의하는 방식은 유지보수에 좋지 않다.
 *    과일이 추가될 때마다 계속 상자 클래스를 만들어야 하기 때문이다.
 *    해결책?
 *    1) Apple, Pear, Grape를 한 조상 밑에 둬라!
 *       즉 Fruit 클래스를 만들어 Apple, Pear, Grape의 조상이 되게 한다.
 *    2) 그러면 과일마다 상자를 따로 만들 필요가 없이 
 *       FruitBox 하나면 된다. 
 */
package step19.ex2;

public class Test01 {

  public static void main(String[] args) {
    // 과일 상자 준비
    FruitBox fruitBox = new FruitBox();
    
    // 과일을 담는다.
    fruitBox.add(new Apple("red", 120));
    fruitBox.add(new Apple("red", 180));
    fruitBox.add(new Apple("green", 110));
    fruitBox.add(new Apple("green", 120));
    fruitBox.add(new Apple("yelllow", 200));
    fruitBox.add(new Pear("성주", 220));
    fruitBox.add(new Pear("성주", 280));
    fruitBox.add(new Pear("성주", 210));
    fruitBox.add(new Pear("나주", 220));
    fruitBox.add(new Pear("나주", 200));
    fruitBox.add(new Grape("머루", 800));
    fruitBox.add(new Grape("머루", 1500));
    fruitBox.add(new Grape("머루", 2000));
    fruitBox.add(new Grape("켐벨", 3000));
    fruitBox.add(new Grape("켐벨", 3000));
    
    // 과일 목록을 가져와서
    Fruit[] fruitList = fruitBox.toArray();
    
    // 출력한다.
    for (Fruit fruit : fruitList) {
      System.out.println(fruit);
    }
    
    

  }

}
