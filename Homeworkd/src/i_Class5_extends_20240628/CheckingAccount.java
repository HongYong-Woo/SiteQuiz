package i_Class5_extends_20240628;

public class CheckingAccount extends Account{
  private String cardNo;

  public CheckingAccount(String accid, String owner, long balance , String cardNo) {
    super(accid,balance,owner);
    this.cardNo = cardNo;
  }

  public void pay(String cardNo, long amount) {
    if (this.cardNo.equals(cardNo) && this.getBalance() > amount) {
      this.withdraw(amount);
    } else {
      System.out.println("지불이 불가능합니다.");
    }
  }

  @Override
  public void calcRate() {

  }
}
