package MorningTest.MT_20240627;

import java.io.*;
import java.util.Scanner;

//참조문제 7,8,9  클래스문제 20
public class TestMain {

  public static void main(String[] args) throws IOException{
    TestMain tm = new TestMain();
    //tm.Prob7();
    //System.out.println("=====================================");
    //tm.Prob8();
    //System.out.println("=====================================");
    //tm.Prob9();
    //System.out.println("=====================================");

    System.out.println("클래스 문제");
    /*Member user1 = new Member("홍길동", "hong");

    MemberService memberService = new MemberService();
    boolean result = memberService.login("hong", "12345");
    if(result) {
      System.out.println("로그인 되었습니다.");
      memberService.logout("hong");
    }
    else {
      System.out.println("id 또는 password가 올바르지 않습니다.");
    }*/


/*    System.out.println("=====================================");
    System.out.println("문제 16 ~ 17");
    Printer printer = new Printer();
//    printer.println(10);
//    printer.println(true);
//    printer.println(5.7);
//    printer.println("홍길동");

    Printer.println(10);
    Printer.println(true);
    Printer.println(5.7);
    Printer.println("홍길동");*/

    /*   System.out.println("=====================================");
    System.out.println("문제 18");

    ShopService obj1 = ShopService.getInstance();
    ShopService obj2 = ShopService.getInstance();

    if (obj1 == obj2) {
      System.out.println("같은 ShopService 객체입니다.");
    } else {
      System.out.println("다른 ShopService 객체입니다.");
    }*/

/*    System.out.println("=====================================");
    System.out.println("문제 19");
    Account account = new Account();
    account.setBalance(10000);
    System.out.println("현재 잔고: " + account.getBalance());

    account.setBalance(-100);
    System.out.println("현재 잔고: " + account.getBalance());

    account.setBalance(2000000);
    System.out.println("현재 잔고: " + account.getBalance());

    account.setBalance(300000);
    System.out.println("현재 잔고: " + account.getBalance());*/

    System.out.println("=====================================");
    System.out.println("문제 20");
    tm.Prob20();

  }



  /**
   * 참조문제7
   */
  public void Prob7() {
    System.out.println("문제7");
    int max = 0;
    int[] array = {1, 5, 4, 8, 2};
    for (int n = 0; n < array.length; n++) {
      if (max < array[n]) {
        max = array[n];
      }
    }
    System.out.println("최대값은 " + max);
  }

  /**
   * 참조문제8
   */
  public void Prob8() {
    System.out.println("문제8");
    int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
    int sum = 0, cnt = 0;
    double avg = 0;
    for (int v = 0; v < array.length; v++) {
      cnt += array[v].length;
      for (int h = 0; h < array[v].length; h++) {
        sum += array[v][h];
      }
    }
    avg = (double) sum / cnt;
    System.out.printf("전체 합은 : %d\n평균은 %.1f\n", sum, avg);
  }

  /**
   * 참조문제9
   */
  public void Prob9() {
    System.out.println("문제9");
    int select = 0;
    Scanner sc = new Scanner(System.in);
    int[] students = new int[0];
    int num = 1, score = 0, max = 0, sum = 0;
    while (select != 5) {
      Prob9MenuPrint();
      System.out.printf("선택> ");

      select = sc.nextInt();

      switch (select) {
        case 1:
          System.out.printf("학생수> ");
          num = sc.nextInt();
          sc.nextLine();
          students = new int[num];
          break;
        case 2:
          if (students.length > 0) {
            for (int n = 0; n < students.length; n++) {
              System.out.printf("score[%d]> ", n);
              score = sc.nextInt();
              students[n] = score;
              sc.nextLine();
            }
          } else {
            System.out.println("아직 학생 수를 입력하지 않았습니다.");
          }
          break;
        case 3:
          if (students.length > 0) {
            for (int n = 0; n < students.length; n++) {
              System.out.printf("score[%d] : %d\n", n, students[n]);
            }
          } else {
            System.out.println("아직 학생 수를 입력하지 않았습니다.");
          }
          break;
        case 4:
          if (students.length > 0) {
            for (int n = 0; n < students.length; n++) {
              sum += students[n];
              if (max < students[n]) {
                max = students[n];
              }
            }
            System.out.printf("최고 점수 : %d\n평균 점수 : %.1f\n", sum, (double) sum / students.length);
          } else {
            System.out.println("아직 학생 수를 입력하지 않았습니다.");
          }
          break;
        case 5:
          System.out.println("프로그램 종료");
          break;
        default:
          System.out.println("잘못 입력하셨습니다.");
          break;
      }
    }

  }

  public void Prob9MenuPrint() {
    System.out.println("---------------------------------------------------");
    System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
    System.out.println("---------------------------------------------------");
  }



  //public static Account[] BankApplication = new Account[100]; //statice 안해도 됨
  /** 클래스문제20 */
  public void Prob20() throws IOException{
    Account[] BankApplication = new Account[100];
    int select =0;
    while(select !=5) {
      Prob20Menu();
      System.out.printf("선택> ");
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      select = Integer.parseInt(br.readLine());
      switch (select) {
        case 1:
          for(int n=0; n<BankApplication.length ; n++) {
            if(BankApplication[n] == null) {
              BankApplication[n] = AccountDAO.createAccount();
              break;
            }
          }
          break;
        case 2:
          AccountDAO.listAccount(BankApplication);
          break;
        case 3:
          AccountDAO.insertAccount(BankApplication);
          break;
        case 4:
          AccountDAO.removeAccount(BankApplication);
          break;
        case 5:
          System.out.println("프로그램 종료");
          break;
        default:
          System.out.println("잘못 입력하셨습니다.");
          break;
      }
    }
  }

  public void Prob20Menu() {
    System.out.println("-----------------------------------------------");
    System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
    System.out.println("-----------------------------------------------");
  }
}


