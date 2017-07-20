package step15.ex3.other;

import java.util.ArrayList;

public class Location {
  String title;
  String tel;
  ArrayList rooms;
  
  public Location(String title, String tel) {
    super();
    this.title = title;
    this.tel = tel;
    this.rooms = new ArrayList();
  }
  
  public void addRoom(String name, int capacity) {
    this.rooms.add(new Room(name, capacity));
  }
  
  public void print() {
    System.out.printf("지역: %s\n", this.title);
    System.out.printf("전화: %s\n", this.tel);
    System.out.println("교실:");
    
    for (int i = 0; i < rooms.size(); i++) {
      Room room = (Room)rooms.get(i);
      room.print();
    }
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
      System.out.printf("%s(%d명) - %s\n", 
          this.name, this.capacity, /*Location.this.*/title);
      // title 변수가 print()의 로컬 변수가 아닌지 찾아 본다.
      // 로컬 변수가 아니라면, 인스턴스 변수인지 찾아본다.
      // 인스턴스 변수도 아니라면, 바깥 객체의 인스턴스 변수인지 찾아본다.
      // 그래서 title 변수를 찾을 수 있었던 것이다.
      // 주의!
      // this.title 하면 안된다. 이것은 현재 Room 객체의 인스턴스 변수로 간주하기 때문이다.
      // 만약 정확하게 바깥 클래스의 인스턴스 변수를 가리키고 싶다면,
      // 바깥클래스명.this.title 이라고 작성하라!
    }
  }
  
}









