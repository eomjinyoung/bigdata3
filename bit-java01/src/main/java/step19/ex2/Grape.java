package step19.ex2;

public class Grape extends Fruit {
  String type;
  
  public Grape(String type, int weight) {
    super(weight);
    this.type = type;
  }

  public String toString() {
    return "Grape [type=" + type + ", weight=" + weight + "]";
  }
}
