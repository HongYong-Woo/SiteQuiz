package LC_C.i_array_one;

import java.io.*;
import java.util.StringTokenizer;

public class array1_Test3 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arrayInt = new int[10];
    int oddsum=0, evensum=0;
    for(int n=0; n<arrayInt.length ; n++) {
      arrayInt[n] = Integer.parseInt(st.nextToken());
      if((n+1) %2==0)
        evensum += arrayInt[n];
      else
        oddsum += arrayInt[n];

    }

    System.out.printf("odd : %d\neven : %d\n", oddsum, evensum);
    br.close();
  }

}
//Quiz.10개의 정수를 입력받아
// 홀수 번째 입력받은 정수의 합과 짝수 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.
//input : 10 20 25 66 83 7 22 90 1 100
//odd : 141
//even : 283