package step19.ex3;

public class Apple extends Fruit {
  String color;
  
  public Apple(String color, int weight) {
    super(weight);
    this.color = color;
  }

  public String toString() {
    return "Apple [color=" + color + ", weight=" + weight + "]";
  }
}
