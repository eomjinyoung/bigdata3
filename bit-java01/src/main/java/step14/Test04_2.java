/* Wrapper 클래스: Auto-boxing, Auto-unboxing
 * => 원시 타입을 랩퍼 객체로, 랩퍼 객체를 원시 타입으로 자동 변환하는 기법 
 */
package step14;

public class Test04_2 {
  public static void main(String[] args) {
    int i = 100;
    Integer obj = new Integer(200);
    
    int j = i;
    
    // auto-unboxing 의 예)
    j = obj; // = obj.intValue() : 즉 랩퍼 객체에 보관된 정수 값을 자동으로 꺼내서 리턴한다.
    
    // auto-boxing 의 예) 
    Integer obj2;
    obj2 = i; // = new Integer(i) : 즉 원시 타입의 값을 랩퍼 객체에 포장해서 리턴한다. 
    
    
  }
  

}










