package step21.ex1;

public abstract class Engine {
  int capacity;
  int fuelType;
  int liter;
  
  public void start() {
    System.out.println("모터를 돌려 시동을 건다.");    
  }
  
  public void stop() {
    System.out.println("연료를 끊어 시동을 끈다.");
  }
  
  public abstract void run();
  
  public void breaking() {
    System.out.println("속도를 줄인다.");
  }
  
  public int getCapacity() {
    return capacity;
  }
  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }
  public int getFuelType() {
    return fuelType;
  }
  public void setFuelType(int fuelType) {
    this.fuelType = fuelType;
  }
  public int getLiter() {
    return liter;
  }
  public void setLiter(int liter) {
    this.liter = liter;
  }
  
  
}
