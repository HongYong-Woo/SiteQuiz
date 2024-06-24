package a_BasicForLoopQUiz;

import java.io.*;
import java.util.regex.Pattern;

public class ForLoopQuiz {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void main(String[] args) throws IOException{
    ForLoopQuiz flq = new ForLoopQuiz();

    //flq.prob0();
    //flq.prob1();
    //flq.prob2();
    flq.prob3();
  }

  /** 문제0 */
  public void prob0() {
    System.out.println("문제0\n1부터 1000까지의 홀수의 합, 짝수의 합, 총합을 출력하세요.");
    int sum = 0, oddSum = 0, evenSum = 0;

    for (int n = 1; n <= 1000; n++) {
      sum += n;
      if (n % 2 == 0) {
        evenSum += n;
      } else {
        oddSum += n;
      }
    }

    System.out.println("1부터 1000까지의 총합 : " + sum);
    System.out.println("1부터 1000까지의 홀수의 합 : " + oddSum);
    System.out.println("1부터 1000까지의 짝수의 합 : " + evenSum);
  }

  /** 문제1 */
  public void prob1() throws IOException{
    System.out.println("문제1\n1 보다 크고 10보다 작은 정수를 입력 받아서 구구단을 완성시키는 프로그램을 작성하시오.\n");
    System.out.print("2 ~ 9 사이의 정수를 입력하세요 : ");
    String str = br.readLine();
    if (!inputExceptionProcess(str)) {
      System.out.println("잘못된 숫자가 입력되었습니다.");
    }
    else {
      int num = Integer.parseInt(str);
      for(int n=1; n<10 ; n++) {
        System.out.printf("%d * %d = %d\n", num, n, num*n);
      }
    }
  }

  /** 문제2 */
  public void prob2() throws IOException{
    System.out.println("문제2\n초기값, 마지막값, 증가분을 입력 받아서, 초기값부터 마지막 값까지, 증가분씩 값을 증가 시키면서\n각 값들의 총합을 구하는 프로그램");
    System.out.println("합의 결과가 1000으 넘으면 결과에 2000을 한번더 더하여 출력");
    System.out.print("초기값을 정수로 입력하세요. : ");
    int startNumber = Integer.parseInt(br.readLine());
    System.out.print("마지막 값을 정수로 입력하세요. : ");
    int lastNumber = Integer.parseInt(br.readLine());
    System.out.print("중가분을 정수로 입력하세요. : ");
    int addNumber = Integer.parseInt(br.readLine());
    int sum=0;

    for(int n = startNumber; n<= lastNumber ; n +=addNumber) {
      sum += n;
    }

    if(sum >= 1000)
      sum += 2000;
    System.out.println("총합은 " + sum + " 입니다.");
  }

  /** 문제3 */
  public void prob3() throws IOException{
    System.out.println("문제3\n2~100사이의 숫자를 입력하면 소수인지 여부를 판별하는 프로그램");
    System.out.print("2 ~ 100 사이의 정수를 입력하세요 : ");
    int num = Integer.parseInt(br.readLine());
    boolean isPrime = true;

    for(int n=2 ; n< (int)Math.sqrt(num) ; n++) {
      if(num %n == 0) {
        isPrime = false;
        break;
      }
    }

    if (isPrime) {
      System.out.printf("%d는 소수입니다.\n", num);
    } else {
      System.out.printf("%d는 소수가 아닙니다.\n", num);
    }

    System.out.println(Math.sqrt(num));
  }

  public boolean inputExceptionProcess(String str) {
    return Pattern.matches("^[2-9]*$", str);
  }

}
