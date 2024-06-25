package LC_C.i_array_one;
import java.io.*;
import java.util.StringTokenizer;

public class array1_Diagnosis8 {

  public static void main(String[] args) throws IOException{
    int[] arrayInt = new int[10];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int evensum=0, oddsum =0;
    int cnt=0;
    double avg =0;
    for(int n=0; n<arrayInt.length ; n++) {
      arrayInt[n] = Integer.parseInt(st.nextToken());

      if((n+1) %2 ==0) {
        evensum += arrayInt[n];
      }
      else {
        oddsum += arrayInt[n];
        cnt++;
      }
    }

    System.out.printf("sum : %d\navg : %.1f",evensum, (double)oddsum/cnt);
    br.close();
  }
}

//Quiz.10개의 정수를 입력받아 배열에 저장한 후
//짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오. 평균은 반올림하여 소수첫째자리까지 출력한다.
//input : 95 100 88 65 76 89 58 93 77 99
//sum : 446
//avg : 78.8