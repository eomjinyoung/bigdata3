package step19.ex2;

public class FruitBox {
  Fruit[] arr = new Fruit[100];
  int cursor; // 과일을 담을 위치(인덱스)를 가리킨다. 0 ~ 99
  
  public int add(Fruit fruit) {
    if (cursor == arr.length) // 상자에 더이상 담을 수 없다면 -1을 리턴.
      return -1;
    arr[cursor++] = fruit; // 현재 커서가 가리키는 곳에 과일을 담고 커서의 위치를 증가시킨다.
    return 0;
  }
  
  public Fruit[] toArray() {
    Fruit[] newArr = new Fruit[cursor];
    for (int i = 0; i < cursor; i++) {
      newArr[i] = arr[i];
    }
    return newArr;
  }
}

