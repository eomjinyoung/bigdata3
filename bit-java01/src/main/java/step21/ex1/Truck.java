package step21.ex1;

public class Truck extends Engine {
  public void run() {
    System.out.println("덜그럭 덜그럭 달린다.");
  }
  
  public void dumpUp() {
    System.out.println("덤프를 올린다.");
  }
  
  public void dumpDown() {
    System.out.println("덤프를 내린다.");
  }
}
