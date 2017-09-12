package step27;

public class RegexTest01 {

  public static void main(String[] args) {
    System.out.println("a".matches("[a-z]")); // true => a에서 z까지 문자 한 개
    System.out.println("aa".matches("[a-z]")); // false => 문자 두 개이기 때문에
    System.out.println("aa".matches("[a-z]+")); // true
    System.out.println("".matches("[a-z]+")); // false => 1개 이상이어야 한다.
    System.out.println("".matches("[a-z]*")); // true
    System.out.println("A".matches("[a-z]*")); // false => 대문자이기 때문에
    System.out.println("A".matches("\\w*")); // true => 알파벳 + 숫자 + _ 
    System.out.println("Hello".matches("\\w*")); // true
    System.out.println("-------------------------");
    
    System.out.println("".matches("\\d")); // false => 숫자만 가능
    System.out.println("2".matches("\\d")); // true
    System.out.println("27".matches("\\d")); // false => 숫자가 한 개이어야 한다.
    System.out.println("27".matches("\\d+")); // true
    System.out.println(".".matches("\\.")); // true
    System.out.println(".2".matches("\\.\\d")); // true
    System.out.println("2.".matches("\\.\\d")); // false => 순서를 지켜야 한다.
    System.out.println(".2".matches("[\\.\\d]+")); // true => 순서에 상관없이 . 또는 숫자가 한 개 이상
    System.out.println("2.".matches("[\\.\\d]+")); // true
    System.out.println("2.".matches("\\d+\\.\\d+\\.\\d+\\.\\d+")); // false
    System.out.println("192.160.0.6".matches("\\d+\\.\\d+\\.\\d+\\.\\d+")); // true
    
  }

}
