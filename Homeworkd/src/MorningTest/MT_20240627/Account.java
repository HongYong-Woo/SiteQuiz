package MorningTest.MT_20240627;

public class Account {
  static final int MIN_BALANCE =0; //상수(값이 정해져서 변경 불가) ==> static final로 정의
  static final int MAX_BALANCE =1000000;
  private int balance;
  private String name;
  private String AccountNumber;


  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    if(balance>=MIN_BALANCE && balance <= MAX_BALANCE)
      this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAccountNumber() {
    return AccountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    AccountNumber = accountNumber;
  }

public void addBalance(int money) {
    this.balance +=money;
}
public void minusBalance(int money) {
    this.balance -= money;
}
}
