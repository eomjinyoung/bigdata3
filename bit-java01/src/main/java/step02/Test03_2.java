/* short와 char 비교
 * => 저장할 수 있는 값의 범위가 다름을 알고 있다.
 * 
 */
package step02;

public class Test03_2 {
  public static void main(String[] args) {
    short s = 66;
    char c = 66;

    // 메모리의 종류에 따라 그 값을 다르게 다룬다.
    // short 메모리에 저장된 값은 정수 값으로 다룬다.
    //   => 그래서 short 메모리에 들어 있는 값을 출력할 때는 그대로 정수를 출력한다.
    // char 메모리에 저장된 값은 유니코드로 다룬다.
    //   => 그래서 char 메모리에 들어 있는 값을 출력할 때는 유니코드에 해당하는 문자를
    //      폰트 파일에서 찾아서 출력한다.
    System.out.println(s);
    System.out.println(c);
  }

}
 