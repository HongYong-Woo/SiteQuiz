package LC_C.i_array_one;
import java.io.*;
import java.util.StringTokenizer;

public class array1_Diagnosis4 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arrayInt = new int[100];
    int cnt =0;
    for(int n=0; n<arrayInt.length ; n++) {
      arrayInt[n] = Integer.parseInt(st.nextToken());
      if(arrayInt[n] == 0)
        break;

      cnt++;
    }

    for(int n = cnt-1; n>=0 ; n--) {
      System.out.printf("%d ", arrayInt[n]);
    }
    br.close();
  }
}
//Quiz.100 개의 정수를 저장할 수 있는 배열을 선언하고
// 정수를 차례로 입력받다가 0 이 입력되면
// 0 을 제외하고 그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
//input : 3 5 10 55 0
//55 10 5 3