/* static nested class 응용 I - 상수를 사용하기 전
 */
package step15.ex2;

public class Test02_1 {
  
  // 제품의 정보를 저장할 static nested class
  // => 주로 Test02_1 클래스에서만 사용할 것이라 가정하자! 
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
    Product p9 = new Product("키보드스킨", "비트", 2003, 20000);
    /* 제품을 등록할 때 분류 코드를 입력하였다.
     * 분류 코드는 주로 숫자로 입력한다.
     * 문제는 코드를 작성한 후 일정 시간이 지나면,
     * 해당 숫자가 어떤 분류인지 알아채기 쉽지 않다는 것이다.
     * 왜? 숫자에 부여된 의미를 암기하기 쉽지 않다.
     * 해결책? 숫자에 의미를 부여하라! 어떻게? 변수명을 활용하라! 즉 상수 변수를 활용하라!
     */
  }
}











