package step18.ex10;

public class Apple {
  String color; // 색상
  int weight; // 무게(g)
  
  public Apple(String color, int weight) {
    super();
    this.color = color;
    this.weight = weight;
  }

  public String toString() {
    return "Apple [color=" + color + ", weight=" + weight + "]";
  }
}
