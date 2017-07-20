package step15.ex3.other;

import java.util.ArrayList;

public class Location2 {
  String name;
  String tel;
  ArrayList rooms;
  
  public Location2(String name, String tel) {
    super();
    this.name = name;
    this.tel = tel;
    this.rooms = new ArrayList();
  }
  
  public void addRoom(String name, int capacity) {
    this.rooms.add(new Room(name, capacity));
  }
  
  public void print() {
    System.out.printf("지역: %s\n", this.name);
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
          Room.this.name, Room.this.capacity, Location2.this.name);
      
      // 만약 위의 name 변수와 같이 inner 클래스 "Room"의 인스턴스 변수 이름과 
      // 바깥 클래스 "Location2"의 인스턴스 변수 이름이 같을 경우
      // 다음과 같이 그냥 변수명을 작성하면 현재 Room의 인스턴스 변수로 간주한다.
      //  name
      // 바깥 클래스 "Location2" 의 인스턴스 변수를 콕 집어서 가리키고 싶다면,
      // 다음과 같이 명확하게 바깥 객체의 주소를 지정하라
      //  Location2.this.name
    }
  }
  
}









