package javaJungsuk;

import java.io.*;

public class practice4 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  static practice4 pr4 = new practice4();

  public static void main(String[] args) throws IOException {

    System.out.println("연습문제4");
    System.out.printf("1~10 중 하나를 입력하시오 : ");
    int selectnum = Integer.parseInt(br.readLine());

    switch (selectnum) {
      case 1 -> pr4.practice4_1_Main();
      case 2 -> pr4.practice4_2();
      case 3 -> pr4.practice4_3();
      case 4 -> pr4.practice4_4();
      case 5 -> pr4.practice4_5();
      case 6 -> pr4.practice4_6();
      case 7 -> pr4.practice4_7();
      case 8 -> pr4.practice4_8();
      case 9 -> pr4.practice4_9();
      case 10 -> pr4.practice4_10();
      default -> System.out.println("범위를 벗어났습니다.");
    }

  }

  /**
   * 연습문제4 -1 메뉴
   */
  public void practice4_1_Main() throws IOException {
    System.out.println("연습문제4-1");
    System.out.printf("1~8 중 하나를 입력하시오 : ");
    int x = Integer.parseInt(br.readLine());

    switch (x) {
      case 1 -> pr4.practice4_1_1();
      case 2 -> pr4.practice4_1_2();
      case 3 -> pr4.practice4_1_3();
      case 4 -> pr4.practice4_1_4();
      case 5 -> pr4.practice4_1_5();
      case 6 -> pr4.practice4_1_6();
      case 7 -> pr4.practice4_1_7();
      case 8 -> pr4.practice4_1_8();
      default -> System.out.println("잘못 입력하셨습니다.");
    }
  }

  /**
   * 연습문제 4-1-1
   */
  public void practice4_1_1() throws IOException {
    System.out.println("int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식");
    System.out.printf("숫자 하나 입력");
    int num = Integer.parseInt(br.readLine());
    boolean b = (num > 10 && num < 200);
    System.out.printf("int x가 %d 일때 boolean b는 %b\n", num, b);
  }

  /**
   * 연습문제 4-1-2
   */
  public void practice4_1_2() throws IOException {
    System.out.println("char형 변수 ch가 공백에나 탭이 아닐때 true인 조건식");
    System.out.printf("문자 하나 입력 : ");
    char ch = br.readLine().charAt(0);
    boolean b = (ch != ' ' || ch != 9);
    System.out.printf("char ch가 %c 일때 boolean b는 %b\n", ch, b);
  }

  /**
   * 연습문제 4-1-3
   */
  public void practice4_1_3() throws IOException {
    System.out.println("char형 변수 ch가 'x' 또는 'X' 일때 true인 조건식");
    System.out.printf("문자 하나 입력 : ");
    char ch = br.readLine().charAt(0);
    boolean b = (ch == 'x' || ch == 'X');
    System.out.printf("char ch가 %c 일때 boolean b는 %b\n", ch, b);
  }

  /**
   * 연습문제 4-1-4
   */
  public void practice4_1_4() throws IOException {
    System.out.printf("char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식");
    System.out.printf("문자 하나 입력 : ");
    char ch = br.readLine().charAt(0);
    boolean b = (ch >= '0' && ch <= '9');

    System.out.printf("char ch가 %c 일때 boolean b는 %b\n", ch, b);
  }

  /**
   * 연습문제 4-1-5
   */
  public void practice4_1_5() throws IOException {
    System.out.println("char형 변수 ch가 영문자 (대문자 또는 소문자)일 때 true인 조건식");
    System.out.printf("문자 하나 입력 : ");
    char ch = br.readLine().charAt(0);
    boolean b = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));

    System.out.printf("char year가 %c 일때 boolean b는 %b\n", ch, b);
  }

  /**
   * 연습문제 4-1-6
   */
  public void practice4_1_6() throws IOException {
    System.out.printf("int형 변수 year가 400으로 나눠 떨어지거나 또는 4로 나눠 떨어지고 100으로 나눠 떨어지지 않을때 true인 조건식");
    System.out.printf("숫자 입력 : ");
    int year = Integer.parseInt(br.readLine());
    boolean b = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    System.out.printf("int year가 %d 일때 boolean b는 %b\n", year, b);
  }

  /**
   * 연습문제 4-1-7
   */
  public void practice4_1_7() {
    System.out.println("boolean변수 powerOn가 false일 때 true인 조건식");
    boolean powerOn = false;
    boolean b = !powerOn;
    System.out.printf("boolean powerOn이 %b 일떄 boolean b는 %b", powerOn, b);
  }

  /**
   * 연습문제 4-1-8
   */
  public void practice4_1_8() throws IOException {
    System.out.println("문자열 참조변수 str이 \"yes\" 일 때 true인 조건식");
    System.out.printf("문자열 입력 : ");
    String str = br.readLine();
    boolean b = str.equals("yes");
    System.out.printf("String str이 %s 일때 boolean b는 %b", str, b);
  }

  /**
   * 연습문제 4-2
   */
  public void practice4_2() {
    System.out.println("1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.");
    int sum = 0;
    for (int n = 1; n <= 20; n++) {
      if (n % 2 != 0 || n % 3 != 0) {
        System.out.printf("%d ", n);
        sum += n;
      }
    }
    System.out.println("\n총합은 : " + sum);
  }

  /**
   * 연습문제 4-3
   */
  public void practice4_3() {
    System.out.println("1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오");
    int sum = 0;
    for (int n = 1; n <= 10; n++) {
      sum = sum + n;
    }
    System.out.println("\n총합은 : " + sum);
  }

  /**
   * 연습문제 4-4
   */
  public void practice4_4() {
    System.out.println("1+(-2)+3+(-4)+... ㅗ가 같은 식으로 계속 더해 나갔을때 몇까지 더해야 총합니 100이상 되는지 구하시오");
    int cnt = 1;
    int sum = 0;
    while (sum < 100) {

      sum += cnt;
      cnt = ++cnt * -1;
    }
    if (cnt < 0) {
      cnt *= -1;
    }

    System.out.println("결과값은 : " + cnt);

  }

  /**
   * 연습문제 4-5
   */
  public void practice4_5() {
    System.out.println("*찍기 for문을 while문으로");
    int cnt = 0;
    while (cnt < 10) {
      int dot = 0;

      while (dot <= cnt) {
        System.out.printf("*");
        dot++;
      }
      System.out.println();
      cnt++;
    }
  }

  /**
   * 연습문제 4-6
   */
  public void practice4_6() {
    System.out.println("두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.");
    for (int y = 1; y <= 6; y++) {
      for (int x = 1; x <= 6; x++) {
        if ((x + y) == 6) {
          System.out.printf("%d : %d   ", x, y);
        }
      }
      System.out.println();
    }
  }

  /**
   * 연습문제 4-7
   */
  public void practice4_7() throws IOException {
    System.out.println("숫자로 이루어진 문자열 str이 있을때, 각자리의 합을 더한 결과를 출력하는 코드를 완성하시오");
    System.out.printf("숫자로 이루어진 문자열을 입력하시오. : ");
    String str = br.readLine();
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
      int num = ((int) str.charAt(i) - 48);
      sum += num;

    }
    System.out.println("Sum = " + sum);
  }

  /**
   * 연습문제 4-8
   */
  public void practice4_8() {
    System.out.println("Math.random()을 이용해서 1부터 6사이의 임의 정수를 변수 valuew에 저장하는 코드를 완성하시오.");
    int value = (int) (Math.random() * 5) + 1;
    System.out.println("value : " + value);
  }

  /**
   * 연습문제 4-9
   */
  public void practice4_9() throws IOException {
    System.out.println("int타입의 변수 num이 있을때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.");
    //만일 변수num 값이 12345라면, 1+2+3+4+5의 결과인 15를 출력
    System.out.printf("숫자로 이루어진 문자열을 입력 하시오 : ");
    int inputNum = Integer.parseInt(br.readLine());
    int sum = 0, remain = 0;

    while (true) {
      remain = inputNum % 10;
      inputNum /= 10;

      sum += remain;

      if (inputNum <= 0) {
        break;
      }
      ;
    }
    System.out.println("sum = " + sum);
  }

  /**
   * 연습문제 4-10
   */
  public void practice4_10() throws IOException {
    System.out.println("1과 100 사이의 값을 반복적으로 입력해서 검퓨터가 생각한 값을 맞히면 게임 끝");
    int answer = (int) (Math.random() * 99) + 1;
    int input = 0;
    int count = 0;

    do {
      count++;
      System.out.print("1 과 100 사이의 값을 입력하세요 : ");
      input = Integer.parseInt(br.readLine());

      if (answer > input) {
        System.out.println("더 큰 수를 입력하세요.");
      } else if (answer < input) {
        System.out.println("더 작은 수를 입력하세요");
      } else {
        System.out.println("맞혔습니다.");
        System.out.printf("시도 횟수는 %d 번 입니다.\n", count);
        break;
      }

    } while (true);

  }

}




