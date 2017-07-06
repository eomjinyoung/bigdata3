/* 배열 다루기 
 * => 배열 초기화
 */
package step03;

public class Test02_2 {
  public static void main(String[] args) {
    // 배열 레퍼런스와 배열 메모리를 한 번에 선언할 수 있다.
    int[] arr1 = new int[3];
    arr1[0] = 100;
    arr1[1] = 200;
    arr1[2] = 300;
    
    // 배열을 만들 때 배열에 들어갈 값을 미리 지정할 수 있다.
    // 단 이럴 경우, 배열의 개수를 지정하면 안된다.
    //int[] arr2 = new int[3]{100, 200, 300}; // 컴파일 오류!
    int[] arr2 = new int[]{100, 200, 300}; 
    
    // 배열 값을 미리 지정할 때 new int[] 생략 가능!
    int[] arr3 = {100, 200, 300};
    
    // 그러나 배열 레퍼런스를 따로 만든 후 나중에 배열 메모리를 만들 때는 new int[] 생략 불가능!
    int[] arr4;
    //arr4 = {100, 200, 300}; // 컴파일 오류! new int[] 생략 불가!
    arr4 = new int[]{100, 200, 300}; // 이렇게 반드시 new int[]를 적어야 한다.
    
     
  }
}

















