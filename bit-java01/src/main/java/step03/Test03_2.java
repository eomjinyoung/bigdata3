/* 클래스 - 인스턴스와 레퍼런스
 */
package step03;

public class Test03_2 {
  public static void main(String[] args) {
    // 사용자 정의 데이터 타입 
    class StudentScore {
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float aver;
    }

    // StudentScore 인스턴스 주소를 저장할 레퍼런스
    StudentScore score1;
    StudentScore score2;
    StudentScore score3, score4;
    
    // StudentScore의 인스턴스 생성
    score1 = new StudentScore();
    score2 = new StudentScore();
    score3 = new StudentScore();
    score4 = new StudentScore();
    
    // 가비지 생성
    score1 = score2; // score1에 원래 있던 주소를 잃어 버렸기 때문에
                     // 그 주소의 인스턴스는 가비지가 된다.
    
    score1.name = "홍길동";
    score2.name = "임꺽정";
    score3.name = "유관순";
    score4.name = "윤봉길";
    
    System.out.println(score1.name);
    System.out.println(score2.name);
    System.out.println(score3.name);
    System.out.println(score4.name);
  }
}






