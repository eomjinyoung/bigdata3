/* static nested class 응용 I - 상수를 사용 
 */
package step15.ex2;

public class Test02_3 {
  // 분류코드를 쉽게 이해할 수 있도록 상수 변수로 정의한다.
  public static final int COMPUTER_PERI_MOUSE = 1001;
  public static final int COMPUTER_PERI_KEYBOARD = 1002;
  public static final int COMPUTER_ACC_MOUSEPAD = 2001;
  public static final int COMPUTER_ACC_KEYBOARDPAD = 2002;
  public static final int COMPUTER_ACC_KEYBOARDSKIN = 2003;
  public static final int COMPUTER_MAIN_CPU = 3001;
  public static final int COMPUTER_MAIN_RAM= 3002;
  public static final int COMPUTER_MAIN_VGA = 3003;
  
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
    Product p1 = new Product("마우스1", "비트", COMPUTER_PERI_MOUSE, 20000);
    Product p2 = new Product("마우스2", "비트", COMPUTER_PERI_MOUSE, 25000);
    Product p3 = new Product("키보드", "비트", COMPUTER_PERI_KEYBOARD, 20000);
    Product p4 = new Product("마우스패드", "비트", COMPUTER_ACC_MOUSEPAD, 20000);
    Product p5 = new Product("키보드손받침대", "비트", COMPUTER_ACC_KEYBOARDPAD, 20000);
    Product p6 = new Product("인텔CPU1", "비트", COMPUTER_MAIN_CPU, 20000);
    Product p7 = new Product("삼성램4G", "비트", COMPUTER_MAIN_RAM, 20000);
    Product p8 = new Product("AMD그래픽1", "비트", COMPUTER_MAIN_VGA, 20000);
    Product p9 = new Product("키보드스킨", "비트", COMPUTER_ACC_KEYBOARDSKIN, 20000);
    
    /* 분류 코드를 작성할 때 숫자를 직접 사용하는 것 보다
     * 위와 같이 변수에 저장해 놓고 변수를 사용하는 것이 
     * 코드를 읽고 이해하는데 더 도움이 된다. 더 쉽다.
     * 이것이 상수를 사용하는 이유다!
     * ip 주소 대신 도메인 이름을 사용하는 이유와 같다!
     */
  }
}











