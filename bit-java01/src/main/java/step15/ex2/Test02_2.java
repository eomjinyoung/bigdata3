/* static nested class 응용 I - 상수를 사용하기 전
 */
package step15.ex2;

public class Test02_2 {
  
  // 제품의 정보를 저장할 static nested class
  // => 주로 Test02_2 클래스에서만 사용할 것이라 가정하자! 
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
    Product p1 = new Product("마우스1", "비트", 1001, 20000);
    Product p2 = new Product("마우스2", "비트", 1001, 25000);
    Product p3 = new Product("키보드", "비트", 1002, 20000);
    Product p4 = new Product("마우스패드", "비트", 2001, 20000);
    Product p5 = new Product("키보드손받침대", "비트", 2002, 20000);
    Product p6 = new Product("인텔CPU1", "비트", 3001, 20000);
    Product p7 = new Product("삼성램4G", "비트", 3002, 20000);
    Product p8 = new Product("AMD그래픽1", "비트", 3003, 20000);
  }
}











