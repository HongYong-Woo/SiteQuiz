package MorningTest.MT_20240627;

import lombok.Getter;

@Getter
public class Account {

  static final int MIN_BALANCE = 0; //상수(값이 정해져서 변경 불가) ==> static final로 정의
  static final int MAX_BALANCE = 1000000;
  private int balance;
  private String name;
  private String AccountNumber;


  public void setBalance(int balance) {
    if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
      this.balance = balance;
    }
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAccountNumber(String accountNumber) {
    AccountNumber = accountNumber;
  }

  public void addBalance(int money) {
    this.balance += money;
    System.out.println("성공적으로 입금되었습니다.");
  }

  public void minusBalance(int money) {
    try {
      if (this.balance - money < MIN_BALANCE) {
        throw new IllegalArgumentException("잔액이 부족합니다.");
      }

      this.balance -= money;
      System.out.println("성공적으로 출금되었습니다.");
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}
