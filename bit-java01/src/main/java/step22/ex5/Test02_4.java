/* 예외 처리 문법: throw 명령 사용법 - 사용자 정의 예외
 * => 애플리케이션에서 예외가 발생하면 보통 Exception 계열에서 적당한 예외 클래스를 찾아
 *    그 인스턴스를 호출자에게 전달한다.
 *    그러나 때론 예외 상황에 꼭 맞는 예외를 찾을 수 없는 경우가 있다.
 *    물론 대충 Exception 예외를 전달해도 되지만,
 *    이왕이면 예외 상황에 적합한 이름을 가진 예외를 던진다면 유지보수에 더 도움이 될 것이다.
 *    
 * => 이런 경우 개발자들은 Exception을 상속 받아 
 *    이런 예외 상황에 꼭 들어 맞는 이름을 가진 서브 클래스를 만들어 사용한다.
 *    
 */
package step22.ex5;

public class Test02_4 {

  // Exception을 사용하여 대충 예외 상황을 전달하는 메서드
  static void addBoard() throws Exception {
    throw new Exception("게시글 등록 중 오류 발생!"); // 이렇게 대충 Exception을 던져도 된다.
  }
  
  /* 사용자 정의 예외
   * => BoardException 클래스는 Exception을 상속 받고 있는데
   *    특별히 추가하는 변수나 메서드가 없습니다. 
   *    이런 서브 클래스를 왜 만듭니까?
   *    아무것도 추가하지 않을 거면 그냥 Exception 쓰지?
   * => 사용자 정의 예외 클래스를 만들 때 이와 같은 경우가 많다.
   *    이런 클래스를 만드는 이유는,
   *    단지 클래스 이름 만으로 어떤 예외인지 빠르게 이해할 수 있기 때문이다.
   */ 
  static class BoardException extends Exception {
    public BoardException() {}
    public BoardException(String message) {
      super(message);
    }
  }
  
  // 사용자 정의 예외를 전달하는 메서드
  static void addBoard2() throws BoardException {
    throw new BoardException("게시글 등록 중 오류 발생!"); // 좀 더 의미있는 예외를 전달한다.
  }
  
  public static void main(String[] args) {
    /*
    try {
      addBoard();
    } catch (Exception e) { 
      e.printStackTrace(); // 예외가 발생한 상황을 자세하게 출력한다.
    }
    */
    
    try {
      addBoard2();
    } catch (BoardException e) { // 클래스 이름만으로 예외 상황을 능히 짐작할 수 있다. 
      e.printStackTrace(); // 예외 상황을 자세히 출력한 내용을 보더라도 클래스 이름을 통해 예외를 
                           // 빠르게 파악할 수 있다.
                           // BoardException에 비록 추가한 기능이 없지만,
                           // 유지보수를 위해 사용자 정의 클래스를 만든 것이다.
                           // 자바 API에서 제공하는 대부분의 예외 클래스들이 이와 같다.
                           // 사실 예외는 Error, Exception 클래스로 모두 처리 가능하다. 
    }
    
  }

}










