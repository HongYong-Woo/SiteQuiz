package MorningTest.MT_20240627;

import java.util.Scanner;
import java.io.*;

public class AccountDAO {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  /**
   * 계좌 생성
   */
  public static Account createAccount() throws IOException{
    System.out.println("----------");
    System.out.println("계좌생성");
    System.out.println("----------");
    System.out.printf("계좌번호 : ");
    String id = br.readLine();
    System.out.printf("계좌주 : ");
    String name = br.readLine();
    System.out.printf("초기입금액 : ");
    int money = 0;
    try {
      money = Integer.parseInt(br.readLine());

      Account account = new Account();
      account.setAccountNumber(id);
      account.setName(name);
      account.setBalance(money);
      System.out.println("계좌가 생성되었습니다.");
      return account;
    } catch (NumberFormatException e) {
      System.out.println("잘못 입력하셨습니다.");

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    return null;
  }

  /** 
   * 계좌목록 보기
   * @계좌 accounts
   */
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

  /**
   * 계좌 입금
   * @계좌 account
   */
  public static void insertAccount(Account[] account) throws IOException{
    System.out.println("----------");
    System.out.println("예금");
    System.out.println("----------");
    System.out.printf("계좌번호 : ");
    String accountNumber = br.readLine();
    System.out.printf("예금액 : " );
    try {
      int money = Integer.parseInt(br.readLine());
      for(int n=0; n<account.length ; n++) {
        if(account[n].getAccountNumber().equals(accountNumber)) {
          account[n].addBalance(money);

          break;
        }
      }
    } catch (NumberFormatException e) {
      System.out.println("잘못 입력하셨습니다. 숫자를 입력해 주세요.");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * 계좌 출금
   * @계좌 account
   */
  public static void removeAccount(Account[] account) throws IOException{
    System.out.println("----------");
    System.out.println("출금");
    System.out.println("----------");
    System.out.printf("계좌번호 : ");
    String accountNumber = br.readLine();
    System.out.printf("출금액 : " );
    try {
      int money = Integer.parseInt(br.readLine());
      for(int n=0; n<account.length ; n++) {
        if(account[n].getAccountNumber().equals(accountNumber)) {
          account[n].minusBalance(money);
          break;
        }
      }
    } catch (NumberFormatException e) {
      System.out.println("잘못 입력하셨습니다. 숫자를 입력해 주세요.");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }


}
