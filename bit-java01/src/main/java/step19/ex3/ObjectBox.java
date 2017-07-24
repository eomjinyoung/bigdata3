package step19.ex3;

public class ObjectBox {
  Object[] arr = new Object[100];
  int cursor; // 객체를 담을 위치(인덱스)를 가리킨다. 0 ~ 99
  
  public int add(Object obj) {
    if (cursor == arr.length) // 상자에 더이상 담을 수 없다면 -1을 리턴.
      return -1;
    arr[cursor++] = obj; // 현재 커서가 가리키는 곳에 객체를 담고 커서의 위치를 증가시킨다.
    return 0;
  }
  
  public Object[] toArray() {
    Object[] newArr = new Object[cursor];
    for (int i = 0; i < cursor; i++) {
      newArr[i] = arr[i];
    }
    return newArr;
  }
}

