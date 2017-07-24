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
}
