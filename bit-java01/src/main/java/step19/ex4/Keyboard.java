package step19.ex4;

public class Keyboard {
  int keys; //키 개수: 104, 87, 61
  String type; // 유형: 기계식, 멤브레인, 무접점정전식
  
  public Keyboard(int keys, String type) {
    super();
    this.keys = keys;
    this.type = type;
  }

  public String toString() {
    return "Keyboard [keys=" + keys + ", type=" + type + "]";
  }
  
}
