package step15.ex2;

// static nested class 응용하여 상수를 계층 구조로 표현하기
public class Category2 {
  public static class computer {
    public static class peripheral {
      public static final int MOUSE = 1001;
      public static final int KEYBOARD = 1002;
    }
    public static class accessary {
      public static final int MOUSEPAD = 2001;
      public static final int KEYBOARDPAD = 2002;
      public static final int KEYBOARDSKIN = 2003;
    }
    public static class main {
      public static final int CPU = 3001;
      public static final int RAM= 3002;
      public static final int VGA = 3003;
    }
  }
  
  public static class life {
    public static final int FRIDGE = 4001;
    public static final int TV = 4002;
  }
  
  public static class furniture {
    public static final int CABINET = 5001;
    public static final int CHAIR = 5002;
  }
}
