package step19.ex4;

import java.lang.reflect.Array;

/* Box 클래스가 어떤 타입의 값을 저장하고 꺼낼 지 클래스에 변수를 선언한다.
 * class 클래스명<타입을저장할변수> {
 *   ...
 * }
 * 
 * => 보통 타입을 저장할 변수는 다음의 관례를 따른다.
 * T - 다뤄야할 타입이 한 개일 때.
 * E - 어떤 목록의 항목일 때.
 * K - 키일 경우.
 * N - 숫자 타입일 경우.
 * V - 값을 의미하는 타입일 경우.
 * S,U,V etc. - 여러 개의 타입을 다뤄야 한다면 이와 같이 두번째, 세번째, 네번째 타입에 대한 변수를 지정한다.
 */
@SuppressWarnings("unchecked")
public class Box<T> {
  T[] arr = (T[]) new Object[100];
  int cursor; // 객체를 담을 위치(인덱스)를 가리킨다. 0 ~ 99
  
  public int add(T obj) {
    if (cursor == arr.length) // 상자에 더이상 담을 수 없다면 -1을 리턴.
      return -1;
    arr[cursor++] = obj; // 현재 커서가 가리키는 곳에 객체를 담고 커서의 위치를 증가시킨다.
    return 0;
  }
  
  public T[] toArray(Class<T> type) {
    // 사용자가 지정한 타입의 배열을 만들어야 하는 경우 
    // 그 타입의 실제 정보를 알아야 한다. 
    // 그래서 toArray() 이 메서드의 파라미터로 타입의 정보를 받도록 하였다.
    // 배열을 만들 때도 new 연산자 대신, 배열을 만들어주는 Array 클래스를 사용하였다.
    T[] newArr = (T[]) Array.newInstance(type, cursor);
    for (int i = 0; i < cursor; i++) {
      newArr[i] = arr[i];
    }
    return newArr;
  }
}







