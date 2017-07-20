/* static nested class 응용 I - 상수를 사용 
 * => 상수 변수를 그와 관련된 클래스(Product)로 옮긴다. 
 */
package step15.ex2;

public class Test02_3 {
  
  static class Product {
    // 분류코드를 쉽게 이해할 수 있도록 상수 변수로 정의한다.
    public static final int COMPUTER_PERI_MOUSE = 1001;
    public static final int COMPUTER_PERI_KEYBOARD = 1002;
    public static final int COMPUTER_ACC_MOUSEPAD = 2001;
    public static final int COMPUTER_ACC_KEYBOARDPAD = 2002;
    public static final int COMPUTER_ACC_KEYBOARDSKIN = 2003;
    public static final int COMPUTER_MAIN_CPU = 3001;
    public static final int COMPUTER_MAIN_RAM= 3002;
    public static final int COMPUTER_MAIN_VGA = 3003;
    
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
    Product p1 = new Product("마우스1", "비트", Product.COMPUTER_PERI_MOUSE, 20000);
    Product p2 = new Product("마우스2", "비트", Product.COMPUTER_PERI_MOUSE, 25000);
    Product p3 = new Product("키보드", "비트", Product.COMPUTER_PERI_KEYBOARD, 20000);
    Product p4 = new Product("마우스패드", "비트", Product.COMPUTER_ACC_MOUSEPAD, 20000);
    Product p5 = new Product("키보드손받침대", "비트", Product.COMPUTER_ACC_KEYBOARDPAD, 20000);
    Product p6 = new Product("인텔CPU1", "비트", Product.COMPUTER_MAIN_CPU, 20000);
    Product p7 = new Product("삼성램4G", "비트", Product.COMPUTER_MAIN_RAM, 20000);
    Product p8 = new Product("AMD그래픽1", "비트", Product.COMPUTER_MAIN_VGA, 20000);
    Product p9 = new Product("키보드스킨", "비트", Product.COMPUTER_ACC_KEYBOARDSKIN, 20000);
    
    /* Product와 관련된 상수를 Product 클래스에 두면
     * 다른 클래스에 두는 것 보다 재사용할 때 편리하다.
     */
  }
}











