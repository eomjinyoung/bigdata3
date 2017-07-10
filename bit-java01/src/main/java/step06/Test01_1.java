package step06;

public class Test01_1 {

  public static void main(String[] args) {
    int dan = 3;
    
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i++) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");
    
    dan = 7;
    
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i++) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");
    
    dan = 19;
    
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i++) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");
    
    dan = 27;
    
    System.out.printf("[%d 단]\n", dan);
    
    for (int i = 1; i <= 9; i++) {
      System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }
    
    System.out.println("---------------------------");
  }

}
