/* 클래스 변수와 인스턴스 변수, 로컬 변수의 기본 값 
 * => 클래스 변수와 인스턴스 변수는 다음의 규칙에 따라 메모리를 생성한 후 기본 값을 설정한다.
 *    byte, short, char, int, long = 0
 *    float, double = 0.0
 *    boolean = false
 *    그 밖의 레퍼런스 = null
 *    
 * => 로컬 변수는 자동으로 초기화 되지 않는다.
 *    그래서 로컬 변수의 값을 꺼내기 전에 반드시 초기화시켜야 한다.
 *    
 */
package step10;

class Student7 {
  static byte sb;
  static short ss;
  static char sc;
  static int si;
  static long sl;
  static float sf;
  static double sd;
  static boolean sbool;
  static String sstr;
  
  byte ib;
  short is;
  char ic;
  int ii;
  long il;
  float ifloat;
  double id;
  boolean ibool;
  String istr;
  
  static void printStaticVars() {
    System.out.println(Student7.sb);
    System.out.println(Student7.ss);
    System.out.println(Student7.sc);
    System.out.println(Student7.si);
    System.out.println(Student7.sl);
    System.out.println(Student7.sf);
    System.out.println(Student7.sd);
    System.out.println(Student7.sbool);
    System.out.println(Student7.sstr);
  }
  
  void printInstanceVars() {
    System.out.println(this.ib);
    System.out.println(this.is);
    System.out.println(this.ic);
    System.out.println(this.ii);
    System.out.println(this.il);
    System.out.println(this.ifloat);
    System.out.println(this.id);
    System.out.println(this.ibool);
    System.out.println(this.istr);
  }
}

public class Test05_1 {
  public static void main(String[] args) {
    // 1) 값을 넣지 않은 클래스 변수의 값을 출력한다면?
    Student7.printStaticVars();
    
    System.out.println("---------------------------");
    
    // 2) 값을 넣지 않은 인스턴스 변수의 값을 출력한다면?
    Student7 obj = new Student7();
    obj.printInstanceVars();
    
    System.out.println("---------------------------");
    
    // 3) 로컬 변수는 클래스 변수나 인스턴스 변수와 달리 0으로 초기와 되지 않는다.
    // 그래서 값을 넣지 않고 꺼내 쓸 수 없다.
    int localVar;
    
    //System.out.println(localVar); // 초기화시키지 않은 로컬 변수의 값을 꺼낼 수 없다. 컴파일 오류!
    
    
  }
}










