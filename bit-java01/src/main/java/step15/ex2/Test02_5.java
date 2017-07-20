/* static nested class 응용 I - 상수를 사용 
 * => 상수가 제품 분류코드처럼 여러 계층으로 이루어진 복잡한 구조라면
 *    상수만 따로 모아 별로의 클래스로 만드는 것도 괜찮다.
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
    Product p1 = new Product("마우스1", "비트", Category.COMPUTER_PERI_MOUSE, 20000);
    Product p2 = new Product("마우스2", "비트", Category.COMPUTER_PERI_MOUSE, 25000);
    Product p3 = new Product("키보드", "비트", Category.COMPUTER_PERI_KEYBOARD, 20000);
    Product p4 = new Product("마우스패드", "비트", Category.COMPUTER_ACC_MOUSEPAD, 20000);
    Product p5 = new Product("키보드손받침대", "비트", Category.COMPUTER_ACC_KEYBOARDPAD, 20000);
    Product p6 = new Product("인텔CPU1", "비트", Category.COMPUTER_MAIN_CPU, 20000);
    Product p7 = new Product("삼성램4G", "비트", Category.COMPUTER_MAIN_RAM, 20000);
    Product p8 = new Product("AMD그래픽1", "비트", Category.COMPUTER_MAIN_VGA, 20000);
    Product p9 = new Product("키보드스킨", "비트", Category.COMPUTER_ACC_KEYBOARDSKIN, 20000);
    Product p10 = new Product("냉장고1", "비트", Category.LIFE_FRIDGE, 20000);
    Product p11 = new Product("TV1", "비트", Category.LIFE_TV, 20000);
    Product p12 = new Product("장롱1", "비트", Category.FURNITURE_CABINET, 20000);
    Product p13 = new Product("장롱2", "비트", Category.FURNITURE_CABINET, 20000);
    Product p14 = new Product("의자1", "비트", Category.FURNITURE_CHAIR, 20000);
    
    /* 상수가 많지 않다면 그와 관련된 클래스에 두면 된다.
     * 그러나 상수가 분류코드처럼 구조가 복잡하고 많다면
     * 별도의 클래스로 분리하는 것이 좋다.
     */
  }
}











