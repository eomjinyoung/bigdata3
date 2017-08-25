/* 스레드 - Critical Section(크리티컬 섹션)을 "Thread Safe"로 만들기
 * => 크리티컬 섹션에 오직 한 개의 스레드만이 진입하게 제한한다.
 *    synchronized 키워드를 메서드 앞에 붙이면 된다.
 *     
 */
package step25;

public class Test06 {
  
  static class Account {
    long balance;
    
    public Account(long balance) {
      this.balance = balance;
    }
    
    // 메서드나 블록 앞에 synchronized를 붙이면 
    // 뮤텍스(MUTual EXclusion; 상호배제) 방식으로 진입을 관리한다.
    // 즉 한 번에 한 개의 스레드만이 호출할 수 있다.
    // 나머지 스레드는 다른 스레드가 호출을 끝낼 때까지 기다려야 한다.
    // => 단점 결국 이 메서드를 호출할 때는 한 번에 한 개의 스레드 만이 지나갈 수 있기 때문에
    //    애플리케이션 실행 속도를 늦추는 "병목지점"이 된다.
    synchronized public long withdraw(long money) {
      long temp = balance;
      if ((temp - money) >= 0) {
        temp = temp - money;
        balance = temp;
        return money;
      }
      return 0;
    }
  }
  
  static class ATM extends Thread {
    Account account;
    
    public ATM(String name) {
      super(name);
    }
    
    public void setAccount(Account account) {
      this.account = account;
    }
    
    @Override
    public void run() {
      long sum = 0;
      for (int i = 0; i < 10000; i++) {
        long money = account.withdraw(100); // 100원을 인출한다.
        if (money == 0)
          break;
        sum += money;
      }
      System.out.printf("[%s] 찾은 돈=%d\n", this.getName(), sum);
    }
  }
  

  public static void main(String[] args) {
    Account account = new Account(1000000);
    
    ATM t1 = new ATM("강남");
    ATM t2 = new ATM("신촌");
    ATM t3 = new ATM("부산");
    
    t1.setAccount(account);
    t2.setAccount(account);
    t3.setAccount(account);
    
    t1.start();
    t2.start();
    t3.start();
    
    // main() 호출이 끝나더라도 
    // 실행하고 있는 스레드가 있다면
    // 해당 스레드가 모두 종료할 때까지 JVM은 종료되지 않는다.
    System.out.println("main() 호출 끝!");
  }
}

/* 스택 메모리 
 * => "JVM 스택"이라고 부른다.
 * => Stack 메모리는 스레드 별로 존재한다.
 *    스레드가 관리하는 메모리다.
 * => Method Area와 Heap 메모리는 모든 스레드가 공유하는 메모리다.
 *     
 */






