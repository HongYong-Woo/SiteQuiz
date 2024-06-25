package h_Class3.prob;

public class Account {
  private String AccNo;
  private int Balance;

  public void setAccNo(String accNo) {
    AccNo = accNo;
    System.out.printf("%s 계좌가 개설되었습니다.\n", this.AccNo);
  }

  public String getAccNo() {
    return AccNo;
  }

  public int getBalance() {
    return Balance;
  }

  public void save(int money) {

    this.Balance +=money;
    System.out.printf("%s 계좌에 %d만원이 입급되었습니다.\n", this.AccNo, this.Balance);
  }

  public void deposit(int money) {
    this.Balance -= money;
    System.out.printf("%s 계좌에 %d만원이 출금되었습니다.\n", this.AccNo, this.Balance);
  }
}
