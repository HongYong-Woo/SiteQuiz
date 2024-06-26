package LC_C.i_array_one;
import java.io.*;
import java.util.StringTokenizer;

public class array1_Test7 {

  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arrayInt = new int[st.countTokens()];
    int max=-999, min=999;
    int num=0;
    for(int n=0; n<arrayInt.length ; n++) {
      num = Integer.parseInt(st.nextToken());
      arrayInt[n] = num;
      if(num == 999) {
        break;
      }

      if(max < arrayInt[n])
        max = arrayInt[n];
      if(min> arrayInt[n])
        min = arrayInt[n];
    }

    System.out.printf("max : %d\nmin : %d\n", max, min);
    br.close();
  }
}

//Quiz.세 자리 이하의 정수를 차례로 입력 받다가 999가 입력되면 프로그램을 종료하고 그 때까지 입력된 최대값과 최소값을 출력하는 프로그램을 작성하시오.
//입력받는 정수는 100개 이하이다.
//input : 45 19 123 58 10 -55 16 -1 999
//max : 123
//min : -55
