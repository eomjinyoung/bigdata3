package step17.ex4;

public class Vehicle {
  int capacity;
  
  public void breaking() {
    System.out.println("속도를 늦춘다.");
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }
}