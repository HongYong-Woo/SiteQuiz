package MorningTest.MT_20240627;

import java.util.Scanner;
import java.io.*;

public class AccountDAO {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static Account createAccount() throws IOException{
    System.out.println("----------");
    System.out.println("계좌생성");
    System.out.println("----------");
    System.out.printf("계좌번호 : ");
    String id = br.readLine();
    System.out.printf("계좌주 : ");
    String name = br.readLine();
    System.out.printf("초기입금액 : ");
    int money = Integer.parseInt(br.readLine());

    Account account = new Account();
    account.setAccountNumber(id);
    account.setName(name);
    account.setBalance(money);
    System.out.println("계좌가 생성되었습니다.");
    return account;
  }

  public static void listAccount(Account[] accounts) {
    System.out.println("----------");
    System.out.println("계좌목록");
    System.out.println("----------");
    for(int n=0; n< accounts.length ; n++) {
      if(accounts[n] == null)
        break;;
      System.out.printf("%s\t%s\t%d\n", accounts[n].getAccountNumber(), accounts[n].getName(), accounts[n].getBalance());
    }
  }

  public static void insertAccount(Account[] account) throws IOException{
    System.out.println("----------");
    System.out.println("예금");
    System.out.println("----------");
    System.out.printf("계좌번호 : ");
    String accountNumber = br.readLine();
    System.out.printf("예금액 " );
    int money = Integer.parseInt(br.readLine());
    for(int n=0; n<account.length ; n++) {
      if(account[n].getAccountNumber().equals(accountNumber)) {
        account[n].addBalance(money);
        System.out.println("성공적으로 입금되었습니다.");
        break;
      }
    }
  }

  public static void removeAccount(Account[] account) throws IOException{
    System.out.println("----------");
    System.out.println("출금");
    System.out.println("----------");
    System.out.printf("계좌번호 : ");
    String accountNumber = br.readLine();
    System.out.printf("출금액 " );
    int money = Integer.parseInt(br.readLine());
    for(int n=0; n<account.length ; n++) {
      if(account[n].getAccountNumber().equals(accountNumber)) {
        account[n].minusBalance(money);
        System.out.println("성공적으로 출금되었습니다.");
        break;
      }
    }
  }


}
