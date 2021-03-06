/* 비트 논리 연산자: &, |, ^, ~ 연산자의 응용 II
 */
package step04;

public class Test04_3 {
  public static void main(String[] args) {
    // 유닉스 시스템에서는 파일에 대한 권한을 설정할 때 3비트를 사용한다.
    // 파일 소유주와 소유주가 소속된 그룹, 기타 사용자에 대해 비트로 각 파일당 권한을 설정한다.
    // 소유주(rwx), 그룹(r--), 기타 사용자(r--)
    int auth = 0b111100100; // 0000_0000_0000_0000_0000_0001_1110_0100
    
    // 예제에서는 테스트를 쉽게 하기 위해 소유주의 권한만 3비트로 저장하고 검사해보자!
    int auth2 = 0b101; // r-x = 즉 읽고, 실행하는 권한이 있다는 것이다.
    
    if ((auth2 & 0b100) == 0b100) {
      System.out.println("소유주의 읽기 권한이 있습니다.");
    }
    
    if ((auth2 & 0b010) == 0b010) {
      System.out.println("소유주의 쓰기 권한이 있습니다.");
    }
    
    if ((auth2 & 0b001) == 0b001) {
      System.out.println("소유주의 실행 권한이 있습니다.");
    }
   
  }
}





