/* static nested class 응용 I - 상수를 사용 
 * => 상수가 제품 분류코드처럼 여러 계층으로 이루어진 복잡한 구조라면
 *    상수만 따로 모아 별로의 클래스로 만드는 것도 괜찮다.
 * => 여기에 static nested class를 적용하면
 *    계층 구조를 좀더 명확하게 표현할 수 있어 좋다.
 */
package step15.ex2;

public class Test02_5 {
  
  static class Product {
    String title;
    String maker;
    int category;
    int price;
    
    public Product(String title, String maker, int category, int price) {
      super();
      this.title = title;
      this.maker = maker;
      this.category = category;
      this.price = price;
    }
  }
  
  public static void main(String[] args) {
    Product p1 = new Product("마우스1", "비트", Category2.computer.peripheral.MOUSE, 20000);
    Product p2 = new Product("마우스2", "비트", Category2.computer.peripheral.MOUSE, 25000);
    Product p3 = new Product("키보드", "비트", Category2.computer.peripheral.KEYBOARD, 20000);
    Product p4 = new Product("마우스패드", "비트", Category2.computer.accessary.MOUSEPAD, 20000);
    Product p5 = new Product("키보드손받침대", "비트", Category2.computer.accessary.KEYBOARDPAD, 20000);
    Product p6 = new Product("인텔CPU1", "비트", Category2.computer.main.CPU, 20000);
    Product p7 = new Product("삼성램4G", "비트", Category2.computer.main.RAM, 20000);
    Product p8 = new Product("AMD그래픽1", "비트", Category2.computer.main.VGA, 20000);
    Product p9 = new Product("키보드스킨", "비트", Category2.computer.accessary.KEYBOARDSKIN, 20000);
    Product p10 = new Product("냉장고1", "비트", Category2.life.FRIDGE, 20000);
    Product p11 = new Product("TV1", "비트", Category2.life.TV, 20000);
    Product p12 = new Product("장롱1", "비트", Category2.furniture.CABINET, 20000);
    Product p13 = new Product("장롱2", "비트", Category2.furniture.CABINET, 20000);
    Product p14 = new Product("의자1", "비트", Category2.furniture.CHAIR, 20000);
    
    /* static nested class를 사용하여 상수를 계층구조로 정의할 수 있다.
     * 상수를 사용할 때는 OGNL 방식으로 표현한다.
     * OGNL? "aaa.bbb.ccc.ddd"와 같이 표현하는 것.
     */
  }
}











