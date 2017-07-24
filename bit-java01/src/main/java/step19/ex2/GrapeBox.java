package step19.ex2;

public class GrapeBox {
  Grape[] arr = new Grape[100];
  int cursor; // 포도를 담을 위치(인덱스)를 가리킨다. 0 ~ 99
  
  public int add(Grape grape) {
    if (cursor == arr.length) // 상자에 더이상 담을 수 없다면 -1을 리턴.
      return -1;
    arr[cursor++] = grape; // 현재 커서가 가리키는 곳에 포도를 담고 커서의 위치를 증가시킨다.
    return 0;
  }
  
  public Grape[] toArray() {
    Grape[] newArr = new Grape[cursor];
    
    for (int i = 0; i < cursor; i++) {
      newArr[i] = arr[i];
    }
    
    return newArr;
  }
  
}
