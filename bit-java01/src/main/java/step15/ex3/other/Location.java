package step15.ex3.other;

import java.util.ArrayList;

public class Location {
  String name;
  String tel;
  ArrayList rooms;
  
  public Location(String name, String tel) {
    super();
    this.name = name;
    this.tel = tel;
    this.rooms = new ArrayList();
  }
  
  public void addRoom(String name, int capacity) {
    
  }
  
  
  class Room {
    String name;
    int capacity;
    
    public Room(String name, int capacity) {
      super();
      this.name = name;
      this.capacity = capacity;
    }
    
    public void print() {
      System.out.printf("%s(%d명)\n", this.name, this.capacity);
    }
  }
  
}









