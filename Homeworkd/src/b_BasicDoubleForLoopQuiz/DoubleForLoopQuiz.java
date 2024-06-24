package b_BasicDoubleForLoopQuiz;
import java.io.*;
public class DoubleForLoopQuiz {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException{

    DoubleForLoopQuiz dflq = new DoubleForLoopQuiz();

    dflq.showPro1();
    //dflq.showPro2();
    //dflq.showPro3();
  }

  /** 문제1 */
  public void showPro1() {
    System.out.println("문제1\n아래의 규칙으로 증가하는 수열에서 15번째까지의 합을 계산하시오");
    int num =1;
    int sum =0;

    for(int n=1; n<=15 ; n++) {
      sum += num;
      num = num+n;
    }
    System.out.println("15번째까지의 합 : " + sum);
  }

  /** 문제2 */
  public void showPro2() throws IOException{
    System.out.printf("숫자를 입력하세요. : ");
    int num = Integer.parseInt(br.readLine());

    for(int y = 0 ; y<num; y++) {
      for(int x = num -y; x>0; x--) {
        System.out.printf("*");
      }
      System.out.println();
    }
  }

  /** 문제3 */
  public void showPro3() {
    int count =0;
    int number =0;
    System.out.println("소수 구하기");
    for(int n=1 ; n<=100; n++) {
      count=0;
      for(int p=1; p<=n ; p++) {
        if(n%p ==0) {
          count++;
        }
        //System.out.printf("n은 %d      count는 %d\n", n, count);
      }

      if(count ==2) {
        System.out.printf("%d는 소수이다.\n", n);
        number++;

      }
    }
    System.out.println("소수의 개수는 : " + number);
  }

}
