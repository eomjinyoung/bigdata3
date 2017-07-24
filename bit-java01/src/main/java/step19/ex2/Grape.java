package step19.ex2;

public class Grape {
  String type;
  int weight;
  
  public Grape(String type, int weight) {
    super();
    this.type = type;
    this.weight = weight;
  }

  public String toString() {
    return "Grape [type=" + type + ", weight=" + weight + "]";
  }
}
