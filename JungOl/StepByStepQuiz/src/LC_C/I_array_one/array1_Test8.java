package LC_C.i_array_one;
import java.io.*;
import java.util.StringTokenizer;

public class array1_Test8 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arrayInt = new int[st.countTokens()];
    int sum=0, cnt=0;
    double avg=0;
    for(int n=0 ; n<arrayInt.length ; n++) {
      arrayInt[n] = Integer.parseInt(st.nextToken());
      if(arrayInt[n] ==0)
        break;;

      if(arrayInt[n] %5 ==0) {
        sum +=arrayInt[n];
        cnt++;
      }
    }

    avg = (double)sum / cnt;
    System.out.printf("Multiples of 5 : %d\nsum : %d\navg : %.1f\n", cnt, sum, avg);
    br.close();
  }
}
//Quiz.100 개 이하의 정수를 입력받다가 0 이 입력되면
// 그 때까지 입력된 정수 중 5의 배수의 개수와
// 합계 평균을 출력하는 프로그램을 작성하시오. 평균은 소수점 이하 1자리까지 출력한다.
//input : 35 10 23 100 64 51 5 0
//Multiples of 5 : 4
//sum : 150
//avg : 37.5