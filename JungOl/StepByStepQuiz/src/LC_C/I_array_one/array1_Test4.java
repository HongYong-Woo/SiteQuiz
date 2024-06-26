package LC_C.i_array_one;

import java.io.*;
import java.util.StringTokenizer;

public class array1_Test4 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arrayInt = new int[100];
    int cnt=st.countTokens()-1, num=0;

    for(int n=0 ; n<arrayInt.length ; n++) {
      num = Integer.parseInt(st.nextToken());
      if(num == -1)
        break;
      else {
        arrayInt[n] = num;
      }
    }
    if(cnt<3) {
      for(int n= 0; n<cnt ; n++) {
        System.out.printf("%d ",arrayInt[n]);
      }
    }
    else {
      for(int n= cnt-3; n<cnt ; n++) {
        System.out.printf("%d ",arrayInt[n]);
      }
    }


    br.close();
  }
}
//Quiz.100개의 정수를 입력받을 수 있는 배열을 선언한 후
// 정수를 차례로 입력 받다가 -1이 입력되면 입력을 중단하고
// -1을 제외한 마지막 세 개의 정수를 출력하는 프로그램을 작성하시오.
// (입력받은 정수가 -1을 제외하고 3개 미만일 경우에는 -1을 제외하고 입력받은 정수를 모두 출력한다.)
//input : 30 20 10 60 80 -1
//10 60 80