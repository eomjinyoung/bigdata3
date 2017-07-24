package step18.ex10;

import java.util.ArrayList;

public class Factory {
  ArrayList list = new ArrayList();
  
  public Factory() {
    list.add(new Apple("red", 100));
    list.add(new Apple("red", 130));
    list.add(new Apple("red", 130));
    list.add(new Apple("red", 150));
    list.add(new Apple("red", 180));
    list.add(new Apple("red", 180));
    list.add(new Apple("red", 200));
    list.add(new Apple("yellow", 120));
    list.add(new Apple("yellow", 140));
    list.add(new Apple("yellow", 140));
    list.add(new Apple("yellow", 180));
    list.add(new Apple("yellow", 190));
    list.add(new Apple("green", 110));
    list.add(new Apple("green", 110));
    list.add(new Apple("green", 140));
    list.add(new Apple("green", 140));
    list.add(new Apple("green", 160));
    list.add(new Apple("green", 200));
  }
  
  // buy() 메서드는 파라미터 값으로 Selector를 요구하고 있다.
  // 즉 Selector 규칙에 따라 만든 객체를 요구한다.
  public ArrayList buy(Selector selector) {
    ArrayList box = new ArrayList();
    
    for (Object apple : list) {
      // list에서 꺼낸 객체가 Apple의 인스턴스가 맞기 때문에 형변환하여 Selector에게 전달한다.
      if (selector.test((Apple)apple)) { // selector의 test() 결과가 true일 때만 박스에 담는다. 
        box.add(apple);
      }
    }
    
    return box;
  }
}








