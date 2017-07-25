package step22.ex2;

public class AppleBox {
  Apple[] arr;
  int cursor; 
  
  public AppleBox(int size) {
    arr = new Apple[size];
  }
  
  // 예외 처리 문법을 사용하여 예외 상황을 호출자에게 보다 쉽게 알릴 수 있다.
  // 오류에 대한 정보도 호출자에게 전달할 수 있다.
  // 단 메서드에 어떤 예외가 호출자에게 전달될 수 있는지 선언해야 한다.
  public void add(Apple apple) throws Exception {
    // 예외 상황이 발생하면 예외 정보를 Exception 객체에 담아 호출자에게 전달한다.
    if (cursor == arr.length) // 상자에 더이상 담을 수 없다면 -1을 리턴.
      throw new Exception("상자가 꽉 찼습니다."); 
    arr[cursor++] = apple; // 현재 커서가 가리키는 곳에 사과를 담고 커서의 위치를 증가시킨다.
  }
  
  public Apple[] toArray() {
    Apple[] newArr = new Apple[cursor];
    
    for (int i = 0; i < cursor; i++) {
      newArr[i] = arr[i];
    }
    
    return newArr;
  }
  
}
