package step19.ex3;

public class Pear extends Fruit {
  String local;
  
  public Pear(String local, int weight) {
    super(weight);
    this.local = local;
  }
  
  public String toString() {
    return "Pear [local=" + local + ", weight=" + weight + "]";
  }
  
  
}
