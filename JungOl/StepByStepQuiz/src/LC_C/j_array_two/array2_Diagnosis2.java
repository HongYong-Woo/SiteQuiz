package LC_C.j_array_two;
import java.io.*;
import java.util.StringTokenizer;

public class array2_Diagnosis2 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arrIntCount = new int[10];
    int cnt = st.countTokens();
    int num=0;
    for(int n=0; n<cnt; n++) {
      num = Integer.parseInt(st.nextToken());
      if(num ==0)
        break;

      num /= 10;
      arrIntCount[num] ++;
    }

    for(int n=0;n<arrIntCount.length ; n++) {
      if(arrIntCount[n]>0) {
        System.out.printf("%d : %d\n", n, arrIntCount[n]);
      }
    }
    br.close();
  }
}
//Quiz.100 미만의 양의 정수들이 주어진다.
//입력받다가 0 이 입력되면 마지막에 입력된 0 을 제외하고
//그 때까지 입력된 정수의 십의 자리 숫자가 각각 몇 개인지
//작은 수부터 출력하는 프로그램을 작성하시오. (0개인 숫자는 출력하지 않는다.)
//input : 10 55 3 63 85 61 85 0
//0 : 1
//1 : 1
//5 : 1
//6 : 2
//8 : 2